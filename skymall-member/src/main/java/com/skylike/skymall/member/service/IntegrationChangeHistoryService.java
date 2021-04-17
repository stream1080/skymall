package com.skylike.skymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skylike.common.utils.PageUtils;
import com.skylike.skymall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author stream
 * @email stream@gmail.com
 * @date 2021-04-17 09:30:44
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

