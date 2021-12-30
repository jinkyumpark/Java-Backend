<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	if(session.getAttribute("loginUser") == null) {
		response.sendRedirect("071_loginForm.jsp");
	} else {
		response.sendRedirect("076_myPage.jsp");
	}
%>