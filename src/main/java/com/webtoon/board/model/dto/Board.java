package com.webtoon.board.model.dto;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Alias(value="board")
public class Board {

    private int boardNo;
	private int memberNo;
	private String boardTitle;
	private String boardContent;
	private int boardCount;
	private String boardDate;
}
