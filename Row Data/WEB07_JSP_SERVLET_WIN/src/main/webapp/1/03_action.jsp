<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>03_action</title>
</head>
<body>

<form name="joinForm" action="03_action_to.jsp" method="get">
	<label for="name">�̸�</label><span style="color:red;">*</span>
	<input type="text" id="name" name="name" value=""><br>
	<label for="id">���̵�</label><span style="color:red;">*</span>
	<input type="text" id="id" name="id" value=""><br>
	<label for="pwd">��й�ȣ</label><span style="color:red;">*</span>
	<input type="password" id="pwd" name="pwd" value=""><br>
	<label for="pwd_re">��й�ȣ Ȯ��</label><span style="color:red;">*</span>
	<input type="password" id="pwd_re" name="pwd_re" value=""><br>
	
	<input type="submit" value="ȸ������">
	<input type="reset" value="�ٽ��ۼ�">
</form>

<br><br>
<a href="03_action_to.jsp?useritem=superCar">���������۸� ������</a>


</body>
</html>