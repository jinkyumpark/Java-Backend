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
	
	�ڹ� �� ��ü�� ����� ���� ����ϱ� <br>
	�̸� : <%=member.getName() %><br>
	���̵� : <%=member.getUserid() %><br><br>
	
	���� ������ �� ����� ���� ����ϱ� <br>
	<%
	member.setName("Hong");
	member.setUserid("hongGilDong");%>
	�̸� : <%=member.getName()%><br>
	���̵� : <%=member.getUserid() %>
	
	<jsp:setProperty name="member" property="name" value="ȫ�漭">
	<jsp:setProperty name="member" property="userid" value="HongGilSeo">
	�̸� : <jsp:getProperty name="member" property="name">
	���̵� : <jsp:getProperty name="member" property="userid">

</body>
</html>