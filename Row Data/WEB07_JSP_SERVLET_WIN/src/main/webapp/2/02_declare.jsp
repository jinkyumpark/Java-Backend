<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>02_declare.jsp</title>
</head>
<body>
<%!
	String str = "안녕하세요!";
	int a = 5, b = -5;
	
	public int abs(int n) {
		if(n < 0) n = -n;
		return n;
	}
%>

<%
int c = 10;
c++;
a++;

out.print(str + "<br>");
out.print(a + "abs : " + abs(a) + "<br>");
%>
</body>
</html>