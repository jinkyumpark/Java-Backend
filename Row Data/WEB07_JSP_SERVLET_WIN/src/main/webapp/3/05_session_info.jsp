<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>05_session_info</title>
</head>
<body>
	<h3>세션 정보를 얻어오는 매소드를 사용하기</h3>
	<%
		String id_str = session.getId();
		long lasttime = session.getLastAccessedTime();
		long createtime = session.getCreationTime();
		long time_used = (lasttime - createtime) / 1000;
		session.setMaxInactiveInterval(3600);
		int inactive = session.getMaxInactiveInterval() / 60;
		boolean b_new = session.isNew();
	%>
	
	[1] Seesion id : [<%=id_str %>] <br><hr>
	[2] You stayed : <%=time_used %> seconds <br><hr>
	[3] Session Inactive : <%=inactive %> m <br><hr>
	[4] Session newly created? <br>
	<% 	if(b_new) out.print("Yes! It's newly created");
		else out.print("No! It's not newly created");
	
	%>
</body>
</html>