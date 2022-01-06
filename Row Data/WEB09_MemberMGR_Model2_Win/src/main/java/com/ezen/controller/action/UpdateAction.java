package com.ezen.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezen.dao.MemberDao;
import com.ezen.dto.MemberDto;

public class UpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDto mdto = new MemberDto();
		mdto.setAdmin(Integer.parseInt(request.getParameter("admin")));
		mdto.setEmail(request.getParameter("email"));
		mdto.setName(request.getParameter("name"));
		mdto.setPhone(request.getParameter("phone"));
		mdto.setPwd(request.getParameter("pwd"));
		mdto.setUserid(request.getParameter("userid"));
		
		MemberDao mdao = MemberDao.getInstance();
		int result = mdao.updateMember(mdto);
		HttpSession session = request.getSession();
		
		if(result == 1) {
			request.setAttribute("message", "회원정보를 수정하였습니다");
			session.setAttribute("loginUser", mdto);
		} else {
			request.setAttribute("message", "회원정보 수정을 실패하였습니다");
		}
	
		RequestDispatcher dp = request.getRequestDispatcher("main.jsp");
		dp.forward(request, response);
	}

}
