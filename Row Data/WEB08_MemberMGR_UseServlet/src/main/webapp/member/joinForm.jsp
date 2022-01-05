<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function idCheck() {
		if(document.frm.userid.value.length == 0) {
			alert("중복 조회할 아이디를 먼저 입력하고 버튼을 눌러주세요.")
			document.frm.userid.focus()
			return false
		}
		
		var inputid = document.frm.userid.value
		var opt = "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=500, height=200"
		window.open("idcheck.do?userid=" + inputid, "idcheck", opt)
	}
	
	function joinCheck() {
		if(document.frm.name.value == "") {
			alert("")
			document.frm.name.focus()
		}
		if(document.frm.userid.value.length == 0) {
			alert("")
			document.frm.userid.focus()
			return false
		}
		if(document.frm.userid.value != document.frm.reid.value) {
			alert("")
			document.frm.userid.focus()
			return false
		}
		if(document.frm.pwd.value.length == 0) {
			alert("You must enter the password")
			document.frm.pwd.focus()
			return false
		}
		if(document.frm.pwd.value != document.frm.pwd_check.value) {
			alert("Password doesn't match")
			document.frm.pwd.focus()
			return false
		}
	}
</script>
</head>
<body>
	<h2>회원 가입</h2> '*' 표시 항목은 필수 입력 항목입니다.
	<form action="join.do" method="post" name="frm">
		
	</form>
</body>
</html>