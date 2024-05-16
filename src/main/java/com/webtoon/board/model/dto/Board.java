package com.webtoon.board.model.dto;

import java.util.List;

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
	private String boardTitle;
	private String boardContent;
	private String boardWriter;
	private int readCount;
	private String boardDate;
	private List<BoardFile> fileList;
}
