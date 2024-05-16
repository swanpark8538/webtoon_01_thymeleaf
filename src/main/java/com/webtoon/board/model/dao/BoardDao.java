package com.webtoon.board.model.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.webtoon.board.model.dto.Board;
import com.webtoon.board.model.dto.BoardFile;

@Mapper
public interface BoardDao {

	List getBoardList(HashMap<String, Object> map);

	int totalCount();

	int insertBoard(Board board);

	int insertBoardFile(BoardFile file);

	int updateReadCount(int boardNo);

	Board selectOneBoard(int boardNo);

	int updateBoard(Board board);

	List<BoardFile> selectDelFileList(int[] delFileNo);

	int deleteBoardFile(int[] delFileNo);

	List<BoardFile> selectOneBoardFiles(int boardNo);

	int deleteBoard(int boardNo);

}
