package com.webtoon.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webtoon.board.service.BoardService;

@RestController
@RequestMapping(value="/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;

}
