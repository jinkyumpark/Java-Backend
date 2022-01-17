package com.ezen.board.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.board.dto.MemberDto;
import com.ezen.board.mdao.MemberDao;

public class LoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		
		MemberDao mdao;
		mdao = MemberDao.getInstance();
		MemberDto mdto = mdao.getMember(userid);
		
		String url = "member/loginForm.jsp";
		
		if(mdto == null) {
			 request.setAttribute("message", "No such ID");
		} else if(!mdto.getPwd().equals(pwd)) {
			request.setAttribute("message", "Wrong Password");
		} else if(mdto.getPwd().equals(pwd)) {
			request.setAttribute("message", "Successfully Loged in");
			url = "main.jsp";
		} else {
			request.setAttribute("message", "You can't log in for unknown reason");
		}
		
		RequestDispatcher dp = request.getRequestDispatcher(url);
		dp.forward(request, response);
	}
}
