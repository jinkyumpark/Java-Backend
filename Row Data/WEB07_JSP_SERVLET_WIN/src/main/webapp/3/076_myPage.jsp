<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
		if(session.getAttribute("loginUser") == null) {
			response.sendRedirect("071_loginForm.jsp");
		} else {
			%>
			아이디 : <%=session.getAttribute("loginUser") %><br>
			성명 : 홍길동<br>
			주소 : 서울특별시 송파구 올림픽로 141<br>
			전화번호 : 010-45398-8503<br>
			주민등록번호 : XXXXXX-XXXXXXX<br>
			<input type="button" value="정보수정">
		<%}%>
</body>
</html>