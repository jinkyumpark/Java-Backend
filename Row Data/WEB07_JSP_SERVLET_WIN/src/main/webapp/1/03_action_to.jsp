<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>GET ������� ��û�Ǿ��� �ּ�</h3>
	<h3>http://localhost:8090/WEB07_JSP_SERVLET_WIN/01/03_action_to.jsp?name=Gildong&id=...</h3>
	<h3>POST ������� ��û�Ǿ��� �ּ�</h3>
	<h3>http://localhost:8090/WEB07_JSP_SERVLET_WIN/01/03_action_to.jsp</h3>
	
	<%
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String pwd_re = request.getParameter("pwd_re");
	%>
	
	���� : <%=name %><br>
	���̵� : <%=id %><br>
	��й�ȣ : <%=pwd %><br>
	��й�ȣ Ȯ�� : <%=pwd_re %><br>
</body>
</html>