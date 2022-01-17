package com.ezen.controller.action;

import java.io.IOException;

public class DeleteMemberAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		MemberDto mdto = (MemberDto) session.getAttribute("loginUser");

		MemberDao mdao = MemberDao.getInstance();
		mdao.deleteMember(mdto.getUserid());

		session.invalidate();

		request.setAttribute("message", mdto.getUserid() + " Delete Successful");

		RequestDispatcher dp = request.getRequestDispatcher("member/loginForm.jsp");
		dp.forward(request, response);
	}
}