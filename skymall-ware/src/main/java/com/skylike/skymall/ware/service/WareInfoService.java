package com.skylike.skymall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skylike.common.utils.PageUtils;
import com.skylike.skymall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author stream
 * @email stream@gmail.com
 * @date 2021-04-17 09:15:35
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

