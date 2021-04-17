package com.skylike.skymall.ware.dao;

import com.skylike.skymall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author stream
 * @email stream@gmail.com
 * @date 2021-04-17 09:15:35
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
