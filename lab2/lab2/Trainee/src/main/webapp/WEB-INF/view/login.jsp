<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1>LOGIN PAGE</h1>
	<br>
	<f:form method="POST" action="authenticate" modelAttribute="t">
		<b>Username: </b>
		<br>
		<f:input path="traineeName" />
		<f:errors path="traineeName" style="color:red" />
		<br>
		<b>Password: </b>
		<br>
		<f:password path="traineeId" />
		<f:errors path="traineeId" />
		<br>
		<input type="submit" value="Login" />
	</f:form>

</body>
</html>