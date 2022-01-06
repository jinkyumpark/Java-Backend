<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join</title>
<script type="text/javascript">
	function joinCheck() {
		if(document.frm.name == "") {
			alert("이름은 필수입력")
			document.frm.name.focus()
		}
		if(document.frm.userid == "") {
			alert("아이디는 필수입력")
			document.frm.userid.focus()
		} 
		if(docuemnt.frm.pwd == "") {
			alert("비밀번호는 필수입력")
			document.frm.pwd.focus()
		}
		if(!document.frm.pwd == document.frm.pwd_check) {
			alert("비밀번호가 일치하지 않음")
			document.frm.pwd_check.focus()
		}
	}
	
	function idCheck() {
		if(document.frm.userid.value.length == 0) {
			alert("아이디 입력해 주세요")
			document.frm.userid.focus()
			return
		}
		
		var inputid = document.frm.userid.value
		var opt = "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=500, height=200"
		window.open("member.do?command=idcheck&userid=" + inputid, "idcheck", opt)
	}
</script> 
</head>
<body>
<form action="member.do" method="post" name="frm">
	<input type="hidden" name="command" value="join">
	<table>
		<tr><td>이름</td><td><input type="text" name="name" size="20">&nbsp;*</td></tr>
		<tr><td>아이디</td><td><input type="text" name="userid">&nbsp;*
			<input type="button" value="중복체크" onClick="idCheck();">
			<input type="hidden" name="reid" value="">
		</td></tr>
		<tr><td>비밀번호</td><td><input type="password" name="pwd"></td></tr>
		<tr><td>비밀번호 확인</td><td><input type="password" name="pwd_check" size="20">&nbsp;*</td></tr>
		<tr><td>이메일</td><td><input type="text" name="email" size="20"></td></tr>
		<tr><td>전화번호</td><td><input type="text" name="phone" size="20"></td></tr>
		<tr><td>등급</td><td><input type="radio" name="admin" value="0" checked="checked">
			일반회원&nbsp;<input type="radio" name="admin" value="1">&nbsp;관리자
		</td></tr>
  		<tr><td colspan="1" align="center">
			<input type="submit" value="회원가입" onclick="return joinCheck()">
			<input type="reset" value="취소">
		</td></tr>  
	</table>
</form>
</body>
</html>