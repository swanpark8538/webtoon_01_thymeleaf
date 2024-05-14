package com.webtoon.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webtoon.board.model.dao.BoardDao;

@Service
public class BoardService {

	@Autowired
	private BoardDao boardDao;
}
