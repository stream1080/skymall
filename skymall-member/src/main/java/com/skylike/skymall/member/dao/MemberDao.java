package com.skylike.skymall.member.dao;

import com.skylike.skymall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author stream
 * @email stream@gmail.com
 * @date 2021-04-17 09:30:44
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
