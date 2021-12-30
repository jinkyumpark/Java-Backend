<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>071_loginForm.jsp</title>
</head>
<body>
	<%
		if(session.getAttribute("loginUser") != null) {
			response.sendRedirect("073_main.jsp");
		}
	%>
	<form method="post" action="072_login_do.jsp">
		<label for="userid">아이디 : </label>
		<input type="text" name="id" id="userid"><br>
		<label for="userpwd">암&nbsp;호</label>
		<input type="password" name="pwd" id="userpwd"><br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>