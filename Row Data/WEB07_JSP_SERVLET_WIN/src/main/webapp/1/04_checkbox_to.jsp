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
		<h3>������ �׸��� �����ϴ�.</h3>

	<%
		} else {
	%>
		<h3>����� ������ �׸��Դϴ�.</h3>
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