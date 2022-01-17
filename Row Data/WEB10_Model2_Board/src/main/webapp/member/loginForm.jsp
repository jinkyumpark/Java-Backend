<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/board.css">
<script src="script/script.js"></script>
</head>
<body>

<form action="board.do" method="post" name="frm">
	<input type="hidden" name="command" value="login">
		<div class="box">LOG IN</div>
		<div class="box">
			<div class="label">ID</div>
			<div class="item"><input type="text" name="userid" id="loginid" size="20"></div>
		</div>
		<div class="box">
			<div class="label">PASSWORD</div>
			<div class="item"><input type="password" name="pwd" id="loginpwd" size="20"></div>
		</div>
		<div class="box">
			<input type="submit" value="LOGIN" onclick="return loginCheck();">
			<input type="button" value="REGISTER" onclick="location.href='board.do?command=joinForm'">
		</div>
		<div class="box">${message }</div>
</form>

</body>
</html>