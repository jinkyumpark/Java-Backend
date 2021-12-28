<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>02_sum</title>
</head>
<body>
	<%
	int sum = 0;
	for(int i = 1; i <= 100; i++) {
		sum += i;
	%>
	<h3><%= sum %></h3>
	<%
	}
	%>
</body>
</html>