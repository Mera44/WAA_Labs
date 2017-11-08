<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE HTML>
<html>
<head>
<title>Save Employee</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>">
</head>
<body>
<div id="global">
    <h4>The employee details have been saved.</h4>
    <p>
        <h5>Details:</h5>
        First Name: ${employee.firstName}<br/>
        Last Name: ${employee.lastName}<br/>
        Date of birth: ${employee.birthDate}
    </p><br/>
    <img src="../../../../Downloads/sts-bundle/pivotal-tc-server-developer-3.2.6.RELEASE/base-instance/wtpwebapps/EmployeeValidDemo/images/${employee.id}.png" alt="image"  style = "width:100%"/>
</div>
</body>
</html>