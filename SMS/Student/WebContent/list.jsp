<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Updated_List</title>
</head>
<body>
	<h3>List of Bookings</h3>
	<table border=1>
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Tickets</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach var="lst" items="${STUDENTLIST}">
				<tr>
					<td>${lst.student_id}</td>
					<td>${lst.student_name}</td>
					<td>${lst.department}</td>
					<td>
						<a href="<%=request.getContextPath()%>/DeleteServlet?id=${movie.Customer_name}">
							delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>