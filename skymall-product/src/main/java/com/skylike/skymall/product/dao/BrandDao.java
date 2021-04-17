package com.skylike.skymall.product.dao;

import com.skylike.skymall.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 品牌
 * 
 * @author stream
 * @email stream@gmail.com
 * @date 2021-04-16 18:05:46
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
