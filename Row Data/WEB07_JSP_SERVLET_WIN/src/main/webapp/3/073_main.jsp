<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>073_main.jsp</title>
</head>
<body>
	<%
		if(session.getAttribute("loginUser") == null) {
			// no one loged in
			response.sendRedirect("071_LoginForm.jsp");
		} else {
			%>
			�α��� ������ <br>��ȭ��ȣ 010-1234-5678<br>
			<%=session.getAttribute("loginUser") %>�� �ȳ��ϼ���!<br>
			���� Ȩ�������� �湮�� �ּż� �����մϴ�.<br>
			��ſ� �ð� �Ǽ���... <br>
			<form method="get" action="075_myPage_do.jsp">
				<input type="submit" value="����������">
			</form>
			<form method="get" action="074_logout.jsp">
				<input type="submit" value="�α׾ƿ�">
			</form>
		<%}%>
</body>
</html>