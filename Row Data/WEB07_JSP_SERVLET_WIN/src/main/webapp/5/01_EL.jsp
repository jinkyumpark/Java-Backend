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
	정수형 : ${10 }<br>
	실수형 : ${5.6 }<br>
	문자열 : ${"홍길동" }<br>
	논리형 : ${ true } <br>
	null : ${null }<br>
	
	${10+2 }<br>
	\${10-2} : ${10-2 }<br>
	
	${10 eq 2 }
	${10 lt 3 }
	${empty("") } <br><br>
	
	${"문자" += "열"} <br><br>
	
	<%
		request.setAttribute("name", "홍길동");
		pageContext.setAttribute("name", "홍길서");
		session.setAttribute("name", "홍길남");
		application.setAttribute("name", "홍길북");
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