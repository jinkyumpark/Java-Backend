<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>03_JSTL.jsp</title>
</head>
<body>
	�ܼ����<br>
	<c:out value="hello"></c:out>
	${"Hello" }
	<br><br><br>
	
	�������� �� �ʱ�ȭ 1 <br>
	<c:set var="msg" value="Hello"></c:set><br>
	\${msg } = ${msg }
	
	�������� �� �ʱ�ȭ 2 <br>
	<c:set var="age">30</c:set><br>
	\${age } = ${age }
	<br><br><br>
	
	��ü���� <br>
	<c:set var="member" value="<%new com.ezen.dto.MemberBean(); %>"></c:set>
	
	<c:set target="${member }" property="name" value="ȫ�浿"></c:set>
	<c:set target="${member }" property="userid">Hong</c:set>
	EL�� ���� �ɹ����� ��� - ��ü�� �ɹ����� �̸������� setter ��� ��ü
	${member.name } <br>
	${member.userid } <br>
	
	
	<br><br><br>
	
	�׿� ������ ��� ��� - jstl�� el ȥ�� ���<br>
	<c:set var="add" value="${10+5 }"></c:set>
	\${add } = ${add }<br>
	<c:set var="flag" value="${10 > 5 }"></c:set>
	\${flag } = ${flag }<br>
	
	<input type="text" value="${member.userid }">
	
	
	
</body>
</html>