<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Creation</title>
</head>
<body>
	<h1>Employee Details Generated!</h1>
	Employee Name : <%= request.getAttribute("empName")%> <br>
	Employee MailId :<%= request.getAttribute("empMailID") %><br>
	Employee Id : <%= request.getAttribute("empId") %>
</body>
</html>