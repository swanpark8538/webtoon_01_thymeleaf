package com.webtoon.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webtoon.member.service.MemberService;

@RestController
@RequestMapping(value="/member")
public class MemberController {

	@Autowired
	private MemberService memberService;
}
