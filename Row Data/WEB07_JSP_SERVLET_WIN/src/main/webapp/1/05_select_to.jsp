<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>05_select_to.jsp</title>
</head>
<body>
	<%
		String job = request.getParameter("job");
		String interests[] = request.getParameterValues("interest");
	%>
	<h1>����� ������ ���� : <%=job %></h1>
	<br><br><br>
	<h1>����� ������ ���ɺо�</h1>
	<h1>
		<%
			if(interests == null) out.print("������ �׸��� �����ϴ�.");
			else {
				for(String interest : interests) {
					%>
					<%=interest %>,
			<%	}
			}
		%>
	</h1>
</body>
</html>