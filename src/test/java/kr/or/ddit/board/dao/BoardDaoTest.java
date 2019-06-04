package kr.or.ddit.board.dao;

import static org.junit.Assert.*;
import kr.or.ddit.board.model.BoardVO;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoardDaoTest {
	private static final Logger logger = LoggerFactory
			.getLogger(BoardDaoTest.class);
	
	private IBoardDao boardDao;
	
	@Before
	public void setup(){
		boardDao = new BoardDaoImpl();
	}
	
	
	/**
	* Method : boardCntTest
	* 작성자 : PC23
	* 변경이력 :
	* Method 설명 : 게시판 전체 수 조회 테스트
	*/
	@Test
	public void boardCntTest() {
		/***Given***/

		/***When***/
		int boardCnt = boardDao.boardCnt();
		
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
		BoardVO boardVo = new BoardVO(1, "ryan", "공지사항", 0);

		/***When***/
		int addCnt = boardDao.addBoard(boardVo);
		
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
		BoardVO boardVo = boardDao.getBoard(boardId);
		
		/***Then***/
		assertEquals("공지사항", boardVo.getBoardName());
	}

}
