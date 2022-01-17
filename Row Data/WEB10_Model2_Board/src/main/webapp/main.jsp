<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${empty loginUser }">
	<jsp:forward page="board.do?command=loginForm">
</c:if>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" src="css/board.css">
</head>
<body>
<div id="wrap" align="center">
	<h1>List</h1>
	<table>
		<tr>
			<td colspan="5" style="border:white;">
				<div style="float:left;">${loginUser.name }(${loginUser.userid }) Logging in
					<input type="button" value="Edit" onclick="location.href='board.do?command=editMemberForm'">
					<input type="button" value="logout" onclick="location.href='board.do?command=logout'"></div>
					
				<div style="float:right;">
					<a href="board.do?command=boardWriteForm">WRITE POST</a>
				</div>					
			</td>
		</tr>	
		
		<tr>
			<th>번호<th>
			<th>제목<th>
			<th>작성자<th>
			<th>작성일<th>
			<th>조회수<th>			
		</tr>

		<c:forEach items="${boardList }" var="board">
			<tr align="center">
				<td>${board.num }</td>
				<td align="left">${board.title }</td>
				<td>${board.userid }</td>
				<td>${board.writedate }</td>
				<td>${board.readcount }</td>
			</tr> 
		</c:forEach>		
		
	</table>
</div>

</body>
</html>