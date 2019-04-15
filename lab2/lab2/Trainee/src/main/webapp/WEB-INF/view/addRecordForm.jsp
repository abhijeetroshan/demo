<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADD RECORD FORM</title>
</head>
<body>
	<h1>ENTER TRAINEE DETAILS:</h1>
	<f:form method="POST" action="recordView" modelAttribute="t">
		<b>TRAINEE ID: </b>
		<br>
		<f:input path="traineeId" />
		<f:errors path="traineeId" />
		<br>
		<b>TRAINEE NAME: </b>
		<br>
		<f:input path="traineeName" />
		<f:errors path="traineeName" style="color:red" />
		<br>
		<b>TRAINEE LOCATION: </b>
		<br>
		<f:radiobutton path="traineeLocation" value="Chennai" label="Chennai" />
		<f:radiobutton path="traineeLocation" value="Bangalore"
			label="Bangalore" />
		<f:radiobutton path="traineeLocation" value="Pune" label="Pune" />
		<f:radiobutton path="traineeLocation" value="Mumbai" label="Mumbai" />
		<br>
		<br>
		<b>TRAINEE DOMAIN: </b>
		<br>
		<f:select path="traineeDomain">
			<f:option value="JEE" />
			<f:option value="ORACLETOOLS" />
			<f:option value="SAP" />
		</f:select>
		<br>
		<f:errors path="traineeDomain" />
		<br>
		<input type="submit" value="ADD TRAINEE" />
	</f:form>

</body>
</html>