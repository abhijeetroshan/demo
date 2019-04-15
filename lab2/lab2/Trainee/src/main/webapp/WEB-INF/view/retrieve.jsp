<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search By Id</title>
</head>
<body>
	<h1>RETRIEVE TRAINEE INFO</h1>
	<c:url var="myAction" value="retrieve" />

	<f:form method="post" modelAttribute="trainee" action="${myAction}">
		<table>
			<tr>
				<td>Please enter Trainee ID:</td>
				<td><f:input path="traineeId" /></td>
				<td><input type="submit" value="Search" /></td>
			</tr>
		</table>
	</f:form>
</body>
</html>