<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String sAge = request.getParameter("age");
	int age = Integer.parseInt(sAge);
	String abc = request.getParameter("abc");
	
	if(age <= 19) {
%>

<script type="text/javascript">
	alert("20세 미만이므로 입장 불가능");
	history.go(-1);
</script>

<%
} else {
	request.setAttribute("name", "홍길동");
	
	RequestDispatcher dp = request.getRequestDispatcher("083_ForwardResult.jsp");
	dp.forward(request, response);
	
}
%>