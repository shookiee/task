package kr.or.ddit.login.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.user.model.UserVO;
import kr.or.ddit.user.service.IUserService;
import kr.or.ddit.user.service.UserServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private static final Logger logger = LoggerFactory
			.getLogger(LoginController.class);
	
	private IUserService userService;
	
	@Override
	public void init() throws ServletException {
		userService = new UserServiceImpl();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.debug("LoginController doGet()");
		request.getRequestDispatcher("/login/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.debug("LoginController doPost()");
		
		String userId = request.getParameter("userId");
		String pass = request.getParameter("pass");
		
		UserVO userVo = userService.getUser(userId);
		
		if(userVo != null && userVo.getPass().equals(pass)){
			HttpSession session = request.getSession();
			session.setAttribute("USER_INFO", userVo);
			session.setAttribute("loginUser", userId);
			
			request.getRequestDispatcher("/main.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/login/login.jsp").forward(request, response);
		}
		
	}

}
