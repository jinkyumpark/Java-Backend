<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>04_getSession</title>
</head>
<body>
	<h3>���ǿ� ����� �� �ϳ��� ����</h3>
	<%
		String id = (String) session.getAttribute("id");
		String pwd = (String) session.getAttribute("pwd");
		Integer age = (Integer) session.getAttribute("age");
	%>
	id : <%=id %><br>
	pwd : <%=pwd %><br>
	age : <%=age %><br>
</body>
</html>