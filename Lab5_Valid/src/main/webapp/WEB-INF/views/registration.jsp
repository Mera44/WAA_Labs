<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

	<h1>Registration Form</h1>
	<br />
	<form:form modelAttribute="student">
		<label for="firstName">First Name: </label>
		<form:input path="firstName" id="firstName" />

		<form:errors path="firstName" cssStyle="color : red;" />
		<br />

		<label for="lastName">Last Name: </label>
		<form:input path="lastName" id="lastName" />

		<form:errors path="lastName" cssStyle="color : red;" />
		<br />

		<label for="email"> Email: </label>
		<form:input path="email" id="email" />
		<form:errors path="email" cssStyle="color : red;" />
		<br />
		<label for="birthday"> Birth Date: </label>
		<form:input path="birthday" id="birthday" />

		<form:errors path="birthday" cssStyle="color : red;" />

		<br />

		<label for="area">Phone :</label>
		<form:input path="phon.area" id="area" />
		<span style="text-align: center;"> <form:errors
				path="phon.area" cssStyle="color : red;" />
		</span>
		<form:input path="phon.prefix" id="prefix" />
		<span style="text-align: center;"> <form:errors
				path="phon.prefix" cssStyle="color : red;" />
		</span>
		<form:input path="phon.number" id="number" />
		<span style="text-align: center;"> <form:errors
				path="phon.number" cssStyle="color : red;" />
		</span>
		<br />
		<br />
		<label for="gender">Gender :</label>
		<form:select id='gender' path="gender">
			<form:option value="Male"> Male </form:option>
			<form:option value="Female">Female</form:option>
		</form:select>

		<input type="submit" value="Submit" />
	</form:form>



</body>
</html>