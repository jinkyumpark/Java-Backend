<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>071_loginForm.jsp</title>
</head>
<body>
	<form method="post" action="072_login_do.jsp">
		<lable for="id">아이디</lable>
		<input type="text" id="id" name="id"><br>
		<label for="pwd">암&nbsp;호 : </label>
		<input type="password" id="pwd" name="pwd"><br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>