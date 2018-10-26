<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success</title>
</head>
<body bgcolor="green">
	<%!int i = 0;%>
	<%= "Hello World" %>
	<%
		response.setHeader("Cache-Control", "no-cache,no-store,revalidate");
		if (session.getAttribute("USERNAME") == null) {
			response.sendRedirect("login.html");
		}
	%>Welcome ${USERNAME}
	<form action="logout" method="get">
		<input type="submit" value="logout">
	</form>
</body>
</html>












