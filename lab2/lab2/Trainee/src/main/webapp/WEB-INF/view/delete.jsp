<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete By ID</title>
</head>
<body>
	<h1>DELETE TRAINEE</h1>
	<c:url var="myAction" value="delete" />
		
	<f:form method="post" modelAttribute="trainee" action="${myAction}">
		<table>
			<tr>
				<td>Please enter Trainee ID:</td>
				<td><f:input path="traineeId" /></td>
				<td><input type="submit" value="Delete" /></td>
			</tr>
		</table>
	</f:form>
</body>
</html>