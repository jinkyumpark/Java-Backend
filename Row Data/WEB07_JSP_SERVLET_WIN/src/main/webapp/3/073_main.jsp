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
			로그인 관리자 <br>전화번호 010-1234-5678<br>
			<%=session.getAttribute("loginUser") %>님 안녕하세요!<br>
			저희 홈페이지에 방문해 주셔서 감사합니다.<br>
			즐거운 시간 되세요... <br>
			<form method="get" action="075_myPage_do.jsp">
				<input type="submit" value="마이페이지">
			</form>
			<form method="get" action="074_logout.jsp">
				<input type="submit" value="로그아웃">
			</form>
		<%}%>
</body>
</html>