package kr.or.ddit.board.dao;

import kr.or.ddit.board.model.BoardVO;

public interface IBoardDao {
	/**
	* Method : boardCnt
	* 작성자 : PC23
	* 변경이력 :
	* @return
	* Method 설명 : 게시판 전체 수 조회
	*/
	int boardCnt();
	
	
	/**
	* Method : addBoard
	* 작성자 : PC23
	* 변경이력 :
	* @param boardVo
	* @return
	* Method 설명 : 새로운 게시판 생성
	*/
	int addBoard(BoardVO boardVo);
	
	
	/**
	* Method : getBoard
	* 작성자 : PC23
	* 변경이력 :
	* @param boardId
	* @return
	* Method 설명 : 특정 게시판 조회
	*/
	BoardVO getBoard(int boardId);
}
