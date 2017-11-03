<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--@page errorPage="loginerror.jsp"--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Ask for advice about your favorite roast:</h2>
	<p>
	<c:choose>
		<c:when test="${Leonardo ne null}">
			<form action="advice" method="post">
				<select name="roastKey">
					<option value="-">--Select Roast--</option>

					<c:forEach var="roast" items="${roasts}">
						<option value="${roast.key}">${roast.value}</option>
					</c:forEach>
				</select>

				<p>
					<input type="submit" value="Submit" />
				</p>
				</form>
		</c:when>
		<c:otherwise>
			<input type="submit" value="Submit" disable="diabled" />
		</c:otherwise>
	</c:choose>
	
</p>

	


	<form action="login" method="post">

		<p>Login:</p>
		<p>
			Name : <input type="text" id="name" name="name" />
		</p>
		<p>
			Password : <input type="password" id="password" name="password" />
		</p>
		<p>
			<input type="submit" value="login" />
		</p>
	</form>
</body>
</html>