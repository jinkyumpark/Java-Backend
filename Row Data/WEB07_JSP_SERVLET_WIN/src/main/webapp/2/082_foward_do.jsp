<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String sAge = request.getParameter("age");
	int age = Integer.parseInt(sAge);
	String abc = request.getParameter("abc");
	
	if(age <= 19) {
%>

<script type="text/javascript">
	alert("20�� �̸��̹Ƿ� ���� �Ұ���");
	history.go(-1);
</script>

<%
} else {
	request.setAttribute("name", "ȫ�浿");
	
	RequestDispatcher dp = request.getRequestDispatcher("083_ForwardResult.jsp");
	dp.forward(request, response);
	
}
%>