<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>GET 방식으로 요청되어진 주소</h3>
	<h3>http://localhost:8090/WEB07_JSP_SERVLET_WIN/01/03_action_to.jsp?name=Gildong&id=...</h3>
	<h3>POST 방식으로 요청되어진 주소</h3>
	<h3>http://localhost:8090/WEB07_JSP_SERVLET_WIN/01/03_action_to.jsp</h3>
	
	<%
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String pwd_re = request.getParameter("pwd_re");
	%>
	
	성명 : <%=name %><br>
	아이디 : <%=id %><br>
	비밀번호 : <%=pwd %><br>
	비밀번호 확인 : <%=pwd_re %><br>
</body>
</html>