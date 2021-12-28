<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>01_Operator</title>
</head>
<body>
	<%
		int num1 = 20;
		int num2 = 7;
		double num3;
		
		int add = num1 + num2;
		out.print(num1 + " + " + num2  + " = " + add + "<br>");
		
		add = num1 - num2;
		out.print(num1 + " - " + num2 + " = " + add + "<br>");
		
		add = num1 * num2;
		out.print(num1 + " * " + num2 + " = " + add + "<br>");
		
		num3 = num1 / (double) num2;
		out.print(num1 + " / " + num2 + " = " + num3 + "<br>");
	%>
</body>
</html>