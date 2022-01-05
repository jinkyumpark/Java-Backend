<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>06_ForEach.jsp</title>
</head>
<body>
<%
	String[] movieList = {"SpiderMan", "Cinema", "KingKong"};
	request.setAttribute("movieList", movieList);
	
	String[] mlist = (String[]) request.getAttribute("movieList");
	for(String s : mlist)
		out.print(s + "<br>");
%>

<c:forEach items="${movieList }" var="movie">

</c:forEach>
	
</body>
</html>