<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Add Employee Form</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/main.css"/>">
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="pull-right" style="padding-right: 50px">
				<a href="?language=en">English</a>|<a href="?language=nl_NL">Dutch</a>
			</div>

		</div>
	</section>

	<div id="global">
		<form:form commandName="employee" action="employee_save" method="post"
			enctype="multipart/form-data">
			<fieldset>
				<legend>
					<spring:message code="Employee.form.addAnEmployee.legend" />
				</legend>
				<p>
					<form:errors path="*" cssStyle="color : red;" />
				</p>
				<p>
					<label for="id"><spring:message
							code="Employee.form.id.label" /> </label>
					<form:input path="id" id="id" />
				<div style="text-align: center;">
					<form:errors path="id" cssStyle="color : red;" />
				</div>
				</p>
				<p>
					<label for="firstName"><spring:message
							code="Employee.form.firstName.label" /></label>
					<form:input path="firstName" />
				<div style="text-align: center;">
					<form:errors path="firstName" cssStyle="color : red;" />
				</div>
				</p>
				<p>
					<label for="lastName"><spring:message
							code="Employee.form.lastName.label" /> </label>
					<form:input path="lastName" />
				<div style="text-align: center;">
					<form:errors path="lastName" cssStyle="color : red;" />
				</div>
				</p>

				<p>
					<label for="birthDate"><spring:message
							code="Employee.form.birthday.label" /> </label>
					<form:input path="birthDate" id="birthDate" />
					<form:errors path="birthDate" cssStyle="color : red;" />
				</p>
				<p>
					<label for="salaryLevel"> <spring:message
							code="Employee.form.salary.label" />
					</label>
					<form:input path="salaryLevel" id="salaryLevel" />
				<div style="text-align: center;">
					<form:errors path="salaryLevel" cssStyle="color : red;" />
				</div>
				</p>
				<h4>
					<spring:message code="Employee.form.address.label" />
				</h4>
				<p>
					<label for="street"><spring:message
							code="Employee.form.street.label" /> </label>
					<form:input path="address.street" id="street" />
				<div style="text-align: center;">
					<form:errors path="address.street" cssStyle="color : red;" />
				</div>
				</p>
				<p>
					<label for="state"><spring:message
							code="Employee.form.state.label" /> </label>
					<form:input path="address.state" id="state" />
				<div style="text-align: center;">
					<form:errors path="address.state" cssStyle="color : red; " />
				</div>
				</p>
				<p>
					<label for="zipCode"><spring:message
							code="Employee.form.zip.label" /> </label>
					<form:input path="address.zipCode" id="zipCode" />
				<div style="text-align: center;">
					<form:errors path="address.zipCode" cssStyle="color : red; " />
				</div>
				</p>

				<p>
					<label for="photo"><spring:message
							code="Employee.form.photo.label" /> </label>
					<form:input path="employeePhoto" id="employeePhoto" type="file"
						class="form:input-large" />

				</p>
				<p id="buttons">
					<input id="reset" type="reset" tabindex="4"> <input
						id="submit" type="submit" tabindex="5" value="Add Employee">
				</p>
			</fieldset>
		</form:form>
	</div>
</body>
</html>
