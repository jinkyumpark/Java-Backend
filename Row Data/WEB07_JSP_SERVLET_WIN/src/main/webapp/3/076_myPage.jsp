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
		if(session.getAttribute("loginUser") == null) {
			response.sendRedirect("071_loginForm.jsp");
		} else {
			%>
			���̵� : <%=session.getAttribute("loginUser") %><br>
			���� : ȫ�浿<br>
			�ּ� : ����Ư���� ���ı� �ø��ȷ� 141<br>
			��ȭ��ȣ : 010-45398-8503<br>
			�ֹε�Ϲ�ȣ : XXXXXX-XXXXXXX<br>
			<input type="button" value="��������">
		<%}%>
</body>
</html>