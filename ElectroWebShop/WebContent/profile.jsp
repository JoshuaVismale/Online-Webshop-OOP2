<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="javax.servlet.*"%>

<!DOCTYPE html>
<html>

<meta charset="ISO-8859-1">
<title>Electro-World: My Profile</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
.w3-sidebar a {
	font-family: "Roboto", sans-serif
}

body, h1, h2, h3, h4, h5, h6, .w3-wide {
	font-family: "Montserrat", sans-serif;
}
</style>

<body class="w3-content" style="max-width: 1200px">
	<jsp:include page="sidebar.jsp" flush="true" />
	<jsp:include page="header.jsp" flush="true" />

	<!-- Page Content -->
	<div class="w3-main" style="margin-left: 250px">
		<header class="w3-container w3-xlarge">
			<p class="w3-left w3-text-black">
				<p class="w3-center"><b>My Profile</b></p>
			</p>
		</header>
		<div class="w3-container w3-center">
			<img src="Images/user.png" style="height: 200px; width: 200px">
			<p>
				<b>${currentSessionUser}</b>
			</p>
		</div>

		<c:forEach items="${profile}" var="p">
			
				<table class="w3-centered w3-table w3-bordered w3-large">
					<tr>
						<td><b>First Name:</b></td>
						<td><c:out value="${p.firstName}" /></td>
					</tr>
					<tr>
						<td><b>Last Name:</b></td>
						<td><c:out value="${p.lastname}" /></td>
					</tr>
					<tr>
						<td><b>E-mail:</b></td>
						<td><c:out value="${p.email}" /></td>
					</tr>
					<tr>
						<td><b>Gender:</b></td>
						<td><c:out value="${p.gender}" /></td>
					</tr>
					<tr>
						<td><b>Address:</b></td>
						<td><c:out value="${p.address}" /></td>
					</tr>
				</table>
			
		</c:forEach>

	</div>

	<jsp:include page="footer.jsp" flush="true" />
</body>
</html>