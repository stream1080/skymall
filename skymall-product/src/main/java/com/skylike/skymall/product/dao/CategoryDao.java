package com.skylike.skymall.product.dao;

import com.skylike.skymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author stream
 * @email stream@gmail.com
 * @date 2021-04-16 18:05:46
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
