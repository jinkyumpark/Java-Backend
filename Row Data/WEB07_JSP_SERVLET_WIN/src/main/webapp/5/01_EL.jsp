<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>01_EL</title>
</head>
<body>
	JSP 1 : <%="Hello" %><br>
	JSP 2 : <% out.println("Hello"); %><br>
	EL : ${"Hello"}<br>
	
	<br><br>
	������ : ${10 }<br>
	�Ǽ��� : ${5.6 }<br>
	���ڿ� : ${"ȫ�浿" }<br>
	���� : ${ true } <br>
	null : ${null }<br>
	
	${10+2 }<br>
	\${10-2} : ${10-2 }<br>
	
	${10 eq 2 }
	${10 lt 3 }
	${empty("") } <br><br>
	
	${"����" += "��"} <br><br>
	
	<%
		request.setAttribute("name", "ȫ�浿");
		pageContext.setAttribute("name", "ȫ�漭");
		session.setAttribute("name", "ȫ�泲");
		application.setAttribute("name", "ȫ���");
	%>
	
	JSP : <%=request.getAttribute("name") %><br>
	JSP : <% String str = (String) request.getAttribute("name"); %>
			<%=str %> <br>
			
	El : ${name }
	
	${name }<br>
	${requestScope.name }<br>
	${sessionScope.name }<br>
	${applicationScope.name }<br>
	
	
</body>
</html>