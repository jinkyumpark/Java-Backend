<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.net.URLEncoder" %>
  
    
<%

String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

if(id.equals("hong") && pwd.equals("1234")) {
	response.sendRedirect("073_login_Ok.jsp?name=" + URLEncoder.encode("ȫ�浿", "UTF-8"));
} else {
	response.sendRedirect("071_loginForm.jsp");
}
	
%>
