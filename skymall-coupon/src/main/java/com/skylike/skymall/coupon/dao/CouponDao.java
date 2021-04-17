package com.skylike.skymall.coupon.dao;

import com.skylike.skymall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author stream
 * @email stream@gmail.com
 * @date 2021-04-17 08:36:39
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
