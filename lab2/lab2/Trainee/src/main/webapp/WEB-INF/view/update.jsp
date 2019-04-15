<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Trainee Form</title>
</head>
<body>
	<h1>UPDATE TRAINEE</h1>
	<c:url var="myAction" value="searchUpdate" />

	<f:form method="post" modelAttribute="trainee" action="${myAction}">
		<table>
			<tr>
				<td>Please enter Trainee ID:</td>
				<td><f:input path="traineeId" /></td>
				<td><input type="submit" value="Modify" /></td>
			</tr>
		</table>
	</f:form>
	
	
	<h1>TRAINEE INFO</h1>
	<c:url var="myAction" value="update" />

	<f:form method="post" modelAttribute="trainee" action="${myAction}">
		<table border="1">
			<tr>
				<td>Trainee ID:</td>
				<td><f:input path="traineeId" value="${id }" /></td>
			</tr>
			<tr>
				<td>Trainee Name:</td>
				<td><f:input path="traineeName" value='${name }' /></td>
			</tr>
			<tr>
				<td>Trainee Location:</td>
				<td><f:input path="traineeLocation" value='${location }' /></td>
			</tr>
			<tr>
				<td>Trainee Domain:</td>
				<td><f:input path="traineeDomain" value='${domain }' /></td>
			</tr>
			<tr>
				<td></td>
				<td align="right"><input type="submit" value="Update" /></td>
			</tr>
		</table>
	</f:form>
	
	
</body>
</html>