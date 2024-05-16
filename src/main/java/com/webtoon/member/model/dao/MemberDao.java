package com.webtoon.member.model.dao;

import org.apache.ibatis.annotations.Mapper;

import com.webtoon.member.model.dto.Member;

@Mapper
public interface MemberDao {

	int insertMember(Member m);

	Member selectOneMember(Member m);

	int updateMember(Member m);

}
