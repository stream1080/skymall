package com.skylike.skymall.order.dao;

import com.skylike.skymall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author stream
 * @email stream@gmail.com
 * @date 2021-04-17 09:07:53
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
