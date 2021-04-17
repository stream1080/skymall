package com.skylike.skymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skylike.common.utils.PageUtils;
import com.skylike.skymall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author stream
 * @email stream@gmail.com
 * @date 2021-04-17 09:07:53
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

