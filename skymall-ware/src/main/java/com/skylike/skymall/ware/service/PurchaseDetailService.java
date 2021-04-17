package com.skylike.skymall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skylike.common.utils.PageUtils;
import com.skylike.skymall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author stream
 * @email stream@gmail.com
 * @date 2021-04-17 09:15:35
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

