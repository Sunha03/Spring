<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<h1>Spring Web MVC ����</h1>
	<hr/>
	<h3>JSP�� �ڵ� ��� : <%= request.getAttribute("msg") %></h3>
	<h3>EL�� �ڵ� ��� : ${msg}</h3>
</body>
</html>