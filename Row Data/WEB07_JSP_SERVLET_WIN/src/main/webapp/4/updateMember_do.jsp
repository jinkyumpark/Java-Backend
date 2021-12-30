<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>

<%
request.setCharacterEncoding("UTF-8");

Connection con = null;
PreparedStatement pstmt = null;
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String driver = "oracle.jdbc.driver.OracleDriver";
int result = 0;

String id = request.getParameter("userid");
String name = request.getParameter("name");
String pwd = request.getParameter("pwd");
String phone = request.getParameter("phone");
String sql = "update mem set name=?, pwd=?, phone=? where id=?";

try {
	Class.forName(driver);
	
	con = DriverManager.getConnection(url, "scott", "tiger");
	pstmt = con.prepareStatement(sql); 
	pstmt.setString(1, name);
	pstmt.setString(2, pwd);
	pstmt.setString(3, phone);
	pstmt.setString(4, id);
	result = pstmt.executeUpdate();
	
} catch(Exception e) {
	e.printStackTrace();
} finally {
	try {
		if(con != null) con.close();
		if(pstmt != null) pstmt.close();
	} catch(Exception e) {
		e.printStackTrace();
	}
}

if(result == 1) {
%>
	<script type="text/javascript">
		alert("Update Successful!");
	</script>
<%
} else {
%>
	<script type="text/javascript">
		alert("Update Failed...");
	</script>
<%	
}

response.sendRedirect("MemberMGR.jsp");

%>