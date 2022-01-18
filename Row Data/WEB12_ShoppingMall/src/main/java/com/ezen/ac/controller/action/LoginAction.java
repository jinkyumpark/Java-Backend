package com.ezen.ac.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "member/login.jsp";
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		MemberDao mdao = MemberDao.getInstance();
		MemberVO mvo = mdao.getMember(id);
		
		if(mvo == null) {
			request.setAttribute("message", "아이디가 없어요.");
		} else if(mvo.getPwd() == null) {
			request.setAttribute("message", "회원정보 오류. 관리자게엑 문의하세요.");
		} else if(!mvo.getPwd().equals(pwd)) {
			request.setAttribute("message", "비밀번호가 틀려요.");
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", mvo);
			url = "shop.do?command=index";
		}
		
		RequestDispatcher dp = request.getRequestDispatcher(url);
		dp.forward(request, response);
		
	}

}
