<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>04_getSession</title>
</head>
<body>
	<h3>���ǿ� ����� �� �ϳ��� ����</h3>
	<%
		String id = (String) session.getAttribute("id");
		String pwd = (String) session.getAttribute("pwd");
		Integer age = (Integer) session.getAttribute("age");
	%>
	id : <%=id %><br>
	pwd : <%=pwd %><br>
	age : <%=age %><br>
	
	<h3>���ǿ� ������ ��� �� ������</h3>
	<%
		Enumeration<String> names = session.getAttributeNames();
		
		while(names.hasMoreElements()) {
			String name = names.nextElement().toString();
			String value = session.getAttribute(name).toString();
			out.println(name + " : " + value + "<br>");
		}
		
		session.removeAttribute("s_name2");
		out.print("<hr><h3> >>���ǰ��� ������ �� << </h3>");
		names = session.getAttributeNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement().toString();
			String value = session.getAttribute(name).toString();
			out.print(name + " : " + value + "<br>");
		}
		
		
	%>
</body>
</html>