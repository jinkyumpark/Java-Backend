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
		<label for="userid">���̵� : </label>
		<input type="text" name="id" id="userid"><br>
		<label for="userpwd">��&nbsp;ȣ</label>
		<input type="password" name="pwd" id="userpwd"><br>
		<input type="submit" value="�α���">
	</form>
</body>
</html>