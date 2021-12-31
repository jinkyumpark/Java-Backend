<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>02_ParameterNull</title>
</head>
<body>
	<h1>JSP : <%=request.getParameter("id")%></h1>
	<h1>EL : ${param.id }</h1>
	
	
	<br>
	
	<%=request.getParameter("id").equals("hong") %>
	equals() 는 null값으로 비교할때 오류
	
	에러 방지 위해 == 사용 : request.getParameter("id") == "hong"
	<%=request.getParameter("id") != null && request.getParameter("id").equals("hong") %>
	
	EL 
	${param.id == "hong" }
	
	<hr>
	
	<pre>
		if(request.getParameter("id") != null) {
			if(request.getParameter("id").equals("hong")) {
			
	</pre>
	
	
</body>
</html>