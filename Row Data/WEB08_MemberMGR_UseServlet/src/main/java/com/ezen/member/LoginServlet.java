package com.ezen.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezen.dao.MemberDao;
import com.ezen.dto.MemberDto;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "member/loginForm.jsp";
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("loginUser") != null) {
			url = "main.jsp";
		}
		
		RequestDispatcher dp = request.getRequestDispatcher(url);
		dp.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		
		// if login fails
		String url = "member/loginForm.jsp";
		
		// login succeed -> url = main.jsp
		
		// Dao
		MemberDao mdao = MemberDao.getInstance();
		MemberDto mdto = mdao.getMember(id);
		
		if(mdto == null) {
			request.setAttribute("message", "아이디가 없어요");
		} else if(mdto.getPwd() == null) {
			request.setAttribute("message", "관리자에게 문의하세요");
		} else if(!mdto.getPwd().equals(pwd)) {
			request.setAttribute("message", "비밀번호가 틀립니다");
		} else if(mdto.getPwd().equals(pwd)) {
			url = "main.do";
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", mdto); // save login user
		} else {
			request.setAttribute("message", "어떤 이유에서인지 로그인이 안 됩니다.");
		}
		
		RequestDispatcher dp = request.getRequestDispatcher(url);
		dp.forward(request, response);
	
	}
}
