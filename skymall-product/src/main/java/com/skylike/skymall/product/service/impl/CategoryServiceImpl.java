package com.skylike.skymall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skylike.common.utils.PageUtils;
import com.skylike.common.utils.Query;

import com.skylike.skymall.product.dao.CategoryDao;
import com.skylike.skymall.product.entity.CategoryEntity;
import com.skylike.skymall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    private CategoryEntity categoryEntity;

    //TODO 三级分类功能，未完成，空指针异常
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTress() {
        //1.查出所有的分类
        List<CategoryEntity> entities = baseMapper.selectList(null);

        //2.组装成父子结构
        //2.1)、找到所有的一级分类
        List<CategoryEntity> level1Menus = entities.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0
        ).map((menu)->{
            menu.setChildren(getChildrens(menu,entities));
            return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());

        return level1Menus;
    }

    //递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildrens (CategoryEntity root , List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return (categoryEntity.getParentCid()==null?0:categoryEntity.getParentCid()) == root.getCatId();
        }).map(categoryErtity -> {
            //1、找到子菜单
            if (categoryErtity == null) {
                return categoryErtity;
            }
            categoryEntity.setChildren(getChildrens(categoryEntity, all));
            return categoryEntity;
            //2.菜单的排序
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }


    }