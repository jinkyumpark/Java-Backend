<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="com.ezen.dto.MemberBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>081_useBeanActionTag</title>
</head>
<body>
	<%
		MemberBean member1 = new MemberBean();
		com.ezen.dto.MemberBean member2 = new com.ezen.dto.MemberBean();
		
	%>
	<jsp:useBean id="member" class="com.ezen.dto.MemberBean"></jsp:useBean>
	
	자바 빈 객체에 저장된 정보 출력하기 <br>
	이름 : <%=member.getName() %><br>
	아이디 : <%=member.getUserid() %><br><br>
	
	정보 변경한 후 변경된 정보 출력하기 <br>
	<%
	member.setName("Hong");
	member.setUserid("hongGilDong");%>
	이름 : <%=member.getName()%><br>
	아이디 : <%=member.getUserid() %>
	
	<jsp:setProperty name="member" property="name" value="홍길서">
	<jsp:setProperty name="member" property="userid" value="HongGilSeo">
	이름 : <jsp:getProperty name="member" property="name">
	아이디 : <jsp:getProperty name="member" property="userid">

</body>
</html>