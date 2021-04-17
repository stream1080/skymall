package com.skylike.skymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skylike.common.utils.PageUtils;
import com.skylike.skymall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author stream
 * @email stream@gmail.com
 * @date 2021-04-16 18:05:46
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

