<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import = "java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>07_Calendar.jsp</title>
</head>
<style>
	td {font-weight: bold; font-size: 110%;}
	tr>td:first-child{color:red;}
	tr>td:last-child{color:blue;}
</style>
<body>
	<%
		//java.util.Calendar sDay = java.util.Calendar.getInstance();
	Calendar sDay = Calendar.getInstance(); // ��µ� �������� ����
	Calendar eDay = Calendar.getInstance();
	
	int sYear = sDay.get(Calendar.YEAR);
	int sMonth = sDay.get(Calendar.MONTH);
	
	sDay.set(sYear, sMonth, 1);
	eDay.set(sYear, sMonth+1, 1);
	eDay.add(Calendar.DATE, -1);
	
	int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
	
	int i, k, cnt = 0;
	
	%>
	
	<h1><%=sYear %>��<%=sMonth %>��</h1>

	<a href="07_Calendar.jsp?sYear="<%=sYear %>&sMonth=<%=sMonth %>">������</a>
	
	<table width="560" align="left" cellspaing="1" bgcolor="black">
	<tr bgcolor="white" height="50">
		<td align="center" width="80">��</td>
		<td align="center" width="80">��</td>
		<td align="center" width="80">ȭ</td>
		<td align="center" width="80">��</td>
		<td align="center" width="80">��</td>
		<td align="center" width="80">��</td>
		<td align="center" width="80">��</td>
	</tr>
	
	<tr bgcolor="white" height="50">
		<% for(i = 1; i< START_WEEK; i++) { %>
		<td>&nbsp;</td>
		<%} %>
		<% for(i = 1; i<= 8-START_WEEK; i++) { %>
		<td align="right"><%=i %>&nbsp;</td>
		<%} %>
	</tr>
	
	<tr bgcolor="white" height="60">
		<%for(k = i; k <= eDay.get(Calendar.DATE); k++) { %>
			<%cnt++;
				if(cnt % 7 == 0) {%>
				</tr><tr bgcolor="white" height="60">
			<%} %>
			<td align="right"><%=k %>&nbsp;</td>
		<%} %>
		
		<%for(i = 1; i <=7 - (cnt % 7); i++) { %>
			<td>&nbsp;</td>
		<%} %>
	</table>
</body>
</html>