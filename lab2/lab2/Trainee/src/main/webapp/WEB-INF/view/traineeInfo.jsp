<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trainee INFORMATION FORM</title>
</head>
<body>

	<h1>TRAINEE INFORMATION</h1>


	<table border=1>
		<tr>
			<th>Trainee ID</th>
			<th>Trainee Name</th>
			<th>Trainee Location</th>
			<th>Trainee Domain</th>
		</tr>
		<c:forEach var="trainee" items="${tlist}">
			<tr>
				<td>${trainee.traineeId}</td>
				<td>${trainee.traineeName}</td>
				<td>${trainee.traineeLocation}</td>
				<td>${trainee.traineeDomain}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>