package kr.or.ddit.board.service;

import static org.junit.Assert.*;
import kr.or.ddit.board.model.BoardVO;

import org.junit.Before;
import org.junit.Test;

public class BoardServiceTest {
	IBoardService boardService;
	
	@Before
	public void setup(){
		boardService = new BoardServiceImpl();
	}
	
	
	/**
	* Method : test
	* 작성자 : PC23
	* 변경이력 :
	* Method 설명 : 게시판 전체수 조회 테스트
	*/
	@Test
	public void boardCntTest() {
		/***Given***/

		/***When***/
		int boardCnt = boardService.boardCnt();
		
		/***Then***/
		assertEquals(0, boardCnt);
	}
	
	
	/**
	* Method : addBoardTest
	* 작성자 : PC23
	* 변경이력 :
	* Method 설명 : 새로운 게시판 생성 테스트
	*/
	@Test
	public void addBoardTest(){
		/***Given***/
		BoardVO boardVo = new BoardVO(2, "ryan", "자유게시판", 0);

		/***When***/
		int addCnt = boardService.addBoard(boardVo);
		
		/***Then***/
		assertEquals(1, addCnt);
	}

	
	/**
	* Method : getBoardTest
	* 작성자 : PC23
	* 변경이력 :
	* Method 설명 : 특정 게시판 조회
	*/
	@Test
	public void getBoardTest(){
		/***Given***/
		int boardId = 1;

		/***When***/
		BoardVO boardVo = boardService.getBoard(boardId);
		
		/***Then***/
		assertEquals("공지사항", boardVo.getBoardName());
	}
}
