<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>04_import.jsp</title>
</head>
<body>
	<% 
	Calendar date = Calendar.getInstance();
	SimpleDateFormat today = new SimpleDateFormat("yyyy�� MM�� dd��");
	SimpleDateFormat now = new SimpleDateFormat("hh�� mm�� ss��");
	%>
	
	<h1>������
	<%
	Date d = date.getTime();
	out.print(today.format(d));
	%>
	�Դϴ�.
	</h1>
	
	<h1>���� �ð���
	<%
		out.print(now.format(date.getTime()));
	%>
	�Դϴ�.
	</h1>
</body>
</html>