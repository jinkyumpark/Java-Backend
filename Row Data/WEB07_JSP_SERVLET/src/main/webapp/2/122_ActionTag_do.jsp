<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String userID = request.getParameter("userID");
	String userPwd = request.getParameter("userPwd");
	String loginCheck = request.getParameter("loginCheck");
	
	if(userID.equals("scott") && userPwd.equals("1234") && loginCheck.equals("user")) {
		response.sendRedirect(
				"123_ActionUser.jsp?userID=" + userID + "&userName-" + URLEncoder.encode()
				)
	}
%>