package com.skylike.skymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skylike.common.utils.PageUtils;
import com.skylike.skymall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author stream
 * @email stream@gmail.com
 * @date 2021-04-16 18:05:46
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTress();
}

