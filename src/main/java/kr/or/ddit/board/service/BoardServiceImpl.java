package kr.or.ddit.board.service;

import kr.or.ddit.board.dao.BoardDaoImpl;
import kr.or.ddit.board.dao.IBoardDao;
import kr.or.ddit.board.model.BoardVO;

public class BoardServiceImpl implements IBoardService {
	private IBoardService service;
	
	private IBoardDao boardDao = new BoardDaoImpl();
	
	/**
	* Method : boardCnt
	* 작성자 : PC23
	* 변경이력 :
	* @return
	* Method 설명 : 게시판 전체 수 조회
	*/
	@Override
	public int boardCnt() {
		return boardDao.boardCnt();
	}

	
	
	/**
	* Method : addBoard
	* 작성자 : PC23
	* 변경이력 :
	* @param boardVo
	* @return
	* Method 설명 : 새로운 게시판 생성
	*/
	@Override
	public int addBoard(BoardVO boardVo) {
		return boardDao.addBoard(boardVo);
	}



	/**
	* Method : getBoard
	* 작성자 : PC23
	* 변경이력 :
	* @param boardId
	* @return
	* Method 설명 : 특정 게시판 조회
	*/
	@Override
	public BoardVO getBoard(int boardId) {
		return boardDao.getBoard(boardId);
	}

}
