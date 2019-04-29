<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

	<meta charset="ISO-8859-1">
	<title>Electro-World: Accessories</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

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
				<b>Search Result</b>
			</p>
		</header>

		<!-- Product Grid -->
		<div class="w3-row" style="margin-bottom: 50px">
			<c:forEach items="${search}" var="s">
				<div class="w3-container w3-button" style="width: 250px; height: 250px; margin-left: 2px; margin-right: 2px">
				   	<c:out value="${s.productName}" />
					<br/>
					<c:out value="${s.productPrice}" />
					<br/>
					<c:out value="${s.productDetails}" />
					<br/>
					<img src="data:image/jpg;base64,${s.base64image}" height="100"/>
					<br/>
				</div>
				
				</c:forEach>				
		</div>	
	</div>

	<jsp:include page="footer.jsp" flush="true" />
</body>
</html>