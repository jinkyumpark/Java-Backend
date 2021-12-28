<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String[] items = request.getParameterValues("item");
	%>
	
	<%
		if(items == null) {
	%>
		<h3>선택한 항목이 없습니다.</h3>

	<%
		} else {
	%>
		<h3>당신이 선택한 항목입니다.</h3>
		<%
			for(String it : items) {
		%>
			<%=it %>&nbsp&nbsp
		<%
			}
		}
		%>
</body>
</html>