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
	
	<h2>�Է� �Ϸ�� ȸ������</h2>
	
	<table>
		<tr><td>�̸�</td><td><jsp:getProperty name="member" property="name"/></td></tr>
		<tr><td>���̵�</td><td><%=member.getUserid() %></td></tr>
		<tr><td>����</td><td><%=member.getNickname() %></td></tr>
		<tr><td>��й�ȣ</td><td><%=member.getPwd() %></td></tr>
		<tr><td>�̸���</td><td><%=member.getEmail() %></td></tr>
		<tr><td>��ȭ��ȣ</td><td><%=member.getPhone() %></td></tr>
	</table>
</body>
</html>