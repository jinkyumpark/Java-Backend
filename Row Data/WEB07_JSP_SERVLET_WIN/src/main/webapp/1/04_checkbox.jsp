<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>04_checkbox.jsp</title>
</head>
<body>
	<h2>악세사리</h2>
	관심항목 선택
	<hr>
	
	<form method="get" action="04_checkbox_to.jsp">
		<input type="checkbox" name="item" value="shoes">신발
		<input type="checkbox" name="item" value="bag">가방
		<input type="checkbox" name="item" value="belt">벨트
		<br>
		<input type="checkbox" name="item" value="cap">모자
		<input type="checkbox" name="item" value="watch">시계
		<input type="checkbox" name="item" value="diamond">쥬얼리<br>
		<input type="submit" value="전송">

	</form>
</body>
</html>
