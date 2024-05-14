package com.webtoon.member.model.dto;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Alias(value="member")
public class Member {

	private int memberNo;
	private String memberId;
	private String memberPw;
	private String memberNickName;
	private String memberName;
	private String memberEmail;
	private String memberPhone;
	private String memberAddress;
	private int memberBirthdate;
}
