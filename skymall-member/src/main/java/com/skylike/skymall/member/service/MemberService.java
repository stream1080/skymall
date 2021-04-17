package com.skylike.skymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skylike.common.utils.PageUtils;
import com.skylike.skymall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author stream
 * @email stream@gmail.com
 * @date 2021-04-17 09:30:44
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

