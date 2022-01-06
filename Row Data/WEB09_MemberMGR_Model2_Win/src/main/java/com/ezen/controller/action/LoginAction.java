package com.ezen.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezen.dao.MemberDao;
import com.ezen.dto.MemberDto;

public class LoginAction implements Action {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		
		MemberDao mdao = MemberDao.getInstance();
		MemberDto mdto = mdao.getMember(userid);
		
		String url = "member/loginForm.jsp";
		
		if(mdto == null) {
			request.setAttribute("message", "���� ���̵� �Դϴ�");
		} else if(mdto.getPwd() == null) {
			request.setAttribute("message", "��й�ȣ ����. �����ڿ��� �����ϼ���");
		} else if(!mdto.getPwd().equals(pwd)) {
			request.setAttribute("message" , "��й�ȣ�� ���� �ʽ��ϴ�");
		} else if(mdto.getPwd().equals(pwd)) {
			url = "main.jsp";
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", mdto);
		} else {
			request.setAttribute("message", "��ü �� �α����� �� �ɱ��");
		}
		
		RequestDispatcher dp = request.getRequestDispatcher(url);
		dp.forward(request, response);
	}
}
