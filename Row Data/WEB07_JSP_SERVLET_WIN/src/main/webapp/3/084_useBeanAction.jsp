<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>084_useBeanAction.jsp</title>
</head>
<body>
	<jsp:useBean id="member" class="com.ezen.dto.MemberBean" scope="request"/>
	
	<h2>입력 완료된 회원정보</h2>
	
	<table>
		<tr><td>이름</td><td><jsp:getProperty name="member" property="name"/></td></tr>
		<tr><td>아이디</td><td><%=member.getUserid() %></td></tr>
		<tr><td>별명</td><td><%=member.getNickname() %></td></tr>
		<tr><td>비밀번호</td><td><%=member.getPwd() %></td></tr>
		<tr><td>이메일</td><td><%=member.getEmail() %></td></tr>
		<tr><td>전화번호</td><td><%=member.getPhone() %></td></tr>
	</table>
</body>
</html>