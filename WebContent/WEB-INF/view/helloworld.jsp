<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request Mapping</title>
</head>
<body>
	<h1>Hello! Welcome to Spring Request Mapping</h1> <hr><br>
	<h3>Read Data From Form</h3> <hr>
	Student Name : ${param.studentName}
	
	<br><br>
	<h3>Read Data From Model</h3> <hr>
	Student Name : ${message}
</body>
</html>