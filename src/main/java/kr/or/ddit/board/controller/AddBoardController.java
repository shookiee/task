package kr.or.ddit.board.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.board.model.BoardVO;
import kr.or.ddit.board.service.BoardServiceImpl;
import kr.or.ddit.board.service.IBoardService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/addBoard")
public class AddBoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory
			.getLogger(AddBoardController.class);
	
	private IBoardService boardService;
	
	@Override
	public void init() throws ServletException {
		boardService = new BoardServiceImpl();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.debug("AddBoard doGet()");
		request.getRequestDispatcher("/board/addboard.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		logger.debug("AddBoard doPost()");
		
		int boardCnt = boardService.boardCnt();
		int boardId = boardCnt == 0 ? 1 : boardCnt+1;	
		String userId = (String) request.getAttribute("loginUser");
				
		String boardName = request.getParameter("boardName");	
//		
//		String useYnStr = request.getParameter("use_yn");
//		int use_yn = 0;
//		if(useYnStr.equals("use_no")){
//			use_yn = 1;
//		}
//		
//	
//		logger.debug("boardId : {}", boardId);
//		logger.debug("userId : {}", userId);
//		logger.debug("boardName : {}", boardName);
//		logger.debug("boardYnStr : {}", useYnStr);
//		logger.debug("use_yn : {}", use_yn);
//	
//		
//		BoardVO boardVo= new BoardVO(boardId, userId, boardName, use_yn);
		
//		int addCnt = boardService.addBoard(boardVo);
		
//		if(addCnt == 1) {
//			response.sendRedirect(request.getContextPath() + "/main.jsp");
//		} else {
//			request.getRequestDispatcher("/board/addBoard.jsp").forward(request, response);
//		}
	}

}
