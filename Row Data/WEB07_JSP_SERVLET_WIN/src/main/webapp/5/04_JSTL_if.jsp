<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>04_JSTL_if</title>
</head>
<body>
	<c:if test="${param.color == 1 }">
		<span style="color: red; font-size: 180%; font-weight:bold;">����</span>
	</c:if>
	<c:if test="${param.color == 2 }">
		<span style="color:green; font-size: 180%; font-weight: bold;">�ʷ�</span>
	</c:if>
	<c:if test="${param.color == 3 }">
		<span style="color:blue; font-size:180%; font-weight: bold;">�Ķ�</span>
	</c:if>

</body>
</html>