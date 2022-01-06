<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	if(document.frm.name.value.length == 0) {
		alert("이름은 필수입력")
		document.frm.name.focus()
		return false
	}
	if(document.frm.pwd.value.length == 0) {
		alert("비밀번호 필수입력")
		document.frm.pwd.focus()
		return false
	}
	if(document.frm.pwd.value != document.frm.pwd_check.value) {
		alert("비밀번호 일치하지 않음")
		document.frm.pwd_check.focus()
		return false
	}
	return true
</script>
</head>
<body>
<form action="member.do" method="post" name="frm">
	<input type="hidden" name="command" value="update">
	
	<table>
		<tr><td></td><td></td>
		
		<tr><td>암호확인</td><td><input type="password" name="pwd_check" size="20"></td></tr>
		<tr><td>이메일</td><td><input type="text" name="email" value="${loginUser.email }"></td></tr>
		<tr><td>전화번호</td><td><input type="text" name="email" value="${loginUser.phone }"></td></tr>
		<tr><td>등급</td>
			<td><c:choose>
				<c:when test="${mdto.admin == 0 }">
					<input type="radio" name="admin" value="0" checked="checked">일반회원
					<input type="radio" name="admin" value="1">관리자
				</c:when>
				<c:otherwise>
					<input type="radio" name="admin" value="0">일반회원
					<input type="radio" name="admin" value="1" checked="checked">관리자
				</c:otherwise>
			</c:choose></td></tr>
	</table>
	
	

</form>
</body>
</html>