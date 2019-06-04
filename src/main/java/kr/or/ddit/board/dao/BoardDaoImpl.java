package kr.or.ddit.board.dao;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.board.model.BoardVO;
import kr.or.ddit.mybatis.MyBatisUtil;

public class BoardDaoImpl implements IBoardDao {

	/**
	* Method : boardCnt
	* 작성자 : PC23
	* 변경이력 :
	* @return
	* Method 설명 : 게시판 전체 수 조회
	*/
	@Override
	public int boardCnt() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int boardCnt = (Integer)sqlSession.selectOne("board.boardCnt");
		sqlSession.close();
		
		return boardCnt;
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
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int addCnt = sqlSession.insert("board.addBoard", boardVo);
		sqlSession.commit();
		sqlSession.close();
				
		return addCnt;
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
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		BoardVO boardVo = sqlSession.selectOne("board.getBoard", boardId);
		sqlSession.close();
		
		return boardVo;
	}

}
