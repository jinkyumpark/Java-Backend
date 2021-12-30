<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.Connection" %>
<%
Connection con = null;
PreparedStatement pstmt = null;

String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String uid = "scott";
String pass = "tiger";
int result = 0;

String name = request.getParameter("name");
String userid = request.getParameter("userid");
String pwd = request.getParameter("pwd");
String phone = request.getParameter("phone");

String sql = "insert into mem(id, name, pwd, phone) values(?,?,?,?)";

try {
	Class.forName(driver);
} catch(Exception e) {
	e.printStackTrace();
}

try {
	con = DriverManager.getConnection(url, uid, pass);
	pstmt = con.prepareStatement(sql);
	pstmt.setString(1, userid);
	pstmt.setString(2, name);
	pstmt.setString(3, pwd);
	pstmt.setString(4, phone);
	result = pstmt.executeUpdate();
} catch(Exception e) {
	e.printStackTrace();
} finally {
	try {
		if(pstmt != null) pstmt.close();
		if(con != null) con.close();
	} catch(Exception e) {
		e.printStackTrace();
	}
}

if(result == 1) {

%>
	<script type="text/javascript">
		alert("Successfully Added to DB");
	</script>
<%
	response.sendRedirect("MemberMGR.jsp");
} else {
%>
	<script type="text/javascript">
		alert("Failed to add...");
	</script>
<%
	response.sendRedirect("MemberMGR.jsp");
}

%>