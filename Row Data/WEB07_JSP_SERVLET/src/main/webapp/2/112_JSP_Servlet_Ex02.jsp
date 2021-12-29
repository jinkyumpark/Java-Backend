<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String gender = (String) request.getAttribute("gender");
		String[] items = (String[]) request.getAttribute("items");
	%>
	
	성별 : <%=gender %><br>
	구입항목 : 
	<% for(String s: items) {%>
		<%=s+ " " %><br>
	<%} %>
</body>
</html>