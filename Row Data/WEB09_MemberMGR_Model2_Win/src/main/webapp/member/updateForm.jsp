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
		alert("�̸��� �ʼ��Է�")
		document.frm.name.focus()
		return false
	}
	if(document.frm.pwd.value.length == 0) {
		alert("��й�ȣ �ʼ��Է�")
		document.frm.pwd.focus()
		return false
	}
	if(document.frm.pwd.value != document.frm.pwd_check.value) {
		alert("��й�ȣ ��ġ���� ����")
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
		
		<tr><td>��ȣȮ��</td><td><input type="password" name="pwd_check" size="20"></td></tr>
		<tr><td>�̸���</td><td><input type="text" name="email" value="${loginUser.email }"></td></tr>
		<tr><td>��ȭ��ȣ</td><td><input type="text" name="email" value="${loginUser.phone }"></td></tr>
		<tr><td>���</td>
			<td><c:choose>
				<c:when test="${mdto.admin == 0 }">
					<input type="radio" name="admin" value="0" checked="checked">�Ϲ�ȸ��
					<input type="radio" name="admin" value="1">������
				</c:when>
				<c:otherwise>
					<input type="radio" name="admin" value="0">�Ϲ�ȸ��
					<input type="radio" name="admin" value="1" checked="checked">������
				</c:otherwise>
			</c:choose></td></tr>
	</table>
	
	

</form>
</body>
</html>