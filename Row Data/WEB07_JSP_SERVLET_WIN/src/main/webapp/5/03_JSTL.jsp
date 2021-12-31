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
	단순출력<br>
	<c:out value="hello"></c:out>
	${"Hello" }
	<br><br><br>
	
	변수생성 및 초기화 1 <br>
	<c:set var="msg" value="Hello"></c:set><br>
	\${msg } = ${msg }
	
	변수생성 및 초기화 2 <br>
	<c:set var="age">30</c:set><br>
	\${age } = ${age }
	<br><br><br>
	
	객체생성 <br>
	<c:set var="member" value="<%new com.ezen.dto.MemberBean(); %>"></c:set>
	
	<c:set target="${member }" property="name" value="홍길동"></c:set>
	<c:set target="${member }" property="userid">Hong</c:set>
	EL에 의한 맴버변수 출력 - 객체와 맴버변수 이름만으로 setter 기능 대체
	${member.name } <br>
	${member.userid } <br>
	
	
	<br><br><br>
	
	그외 변수와 출력 기능 - jstl과 el 혼합 사용<br>
	<c:set var="add" value="${10+5 }"></c:set>
	\${add } = ${add }<br>
	<c:set var="flag" value="${10 > 5 }"></c:set>
	\${flag } = ${flag }<br>
	
	<input type="text" value="${member.userid }">
	
	
	
</body>
</html>