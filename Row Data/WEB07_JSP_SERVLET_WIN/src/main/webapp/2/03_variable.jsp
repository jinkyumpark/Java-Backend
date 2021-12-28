<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>03_variable.jsp</title>
<%!
	int global_cnt = 0;
%>
</head>
<body>
<%
	int local_cnt = 0;
%>

<h1>local_cnt : <%=++local_cnt %></h1>
<h1>global_cnt : <%=++global_cnt %></h1>


</body>
</html>