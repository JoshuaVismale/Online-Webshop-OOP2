<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Footer</title>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<style>
.w3-sidebar a {
	font-family: "Roboto", sans-serif
}

body, h1, h2, h3, h4, h5, h6, .w3-wide {
	font-family: "Montserrat", sans-serif;
}
</style>

<body class="w3-content" >
	<div class="w3-main" style="margin-left: 250px">
		

		<!-- Footer -->
		<footer class="w3-padding-64 w3-light-grey w3-small w3-center"
			style="width: 100%" id="footer">
			<div class="w3-row-padding">
				<div class="w3-col s4">
					<h4>Contact</h4>
					<p>Questions? Go ahead.</p>
					<form method="get" action="Contact">
						<p>
							<input class="w3-input w3-border" type="text" placeholder="Name"
								name="Name" required style="width:100%">
						</p>
						<p>
							<input class="w3-input w3-border" type="text" placeholder="Email"
								name="Email" required style="width:100%">
						</p>
						<p>
							<input class="w3-input w3-border" type="text"
								placeholder="Subject" name="Subject" required style="width:100%">
						</p>
						<p>
							<input class="w3-input w3-border" type="text"
								placeholder="Message" name="Message" required style="width:100%">
						</p>
						<button type="submit" class="w3-button w3-block w3-black">Send</button>
					</form>
				</div>

				<div class="w3-col s4">
					<h4>About</h4>
					<p>
						<a href="#">About us</a>
					</p>
					<p>
						<a href="#">We're hiring</a>
					</p>
					<p>
						<a href="#">Support</a>
					</p>
					<p>
						<a href="#">Find store</a>
					</p>
					<p>
						<a href="#">Shipment</a>
					</p>
					<p>
						<a href="#">Payment</a>
					</p>
					<p>
						<a href="#">Gift card</a>
					</p>
					<p>
						<a href="#">Return</a>
					</p>
					<p>
						<a href="#">Help</a>
					</p>
				</div>

				<div class="w3-col s4 w3-justify">
					<h4>Store</h4>
					<p>
						<i class="fa fa-fw fa-map-marker"></i>Electro World, Paramaribo
						Suriname
					</p>

					<p>
						<i class="fa fa-fw fa-phone"></i> 0044123123
					</p>
					<p>
						<i class="fa fa-fw fa-envelope"></i> Electro_World@gmail.com
					</p>
					<h4>We accept</h4>
					<p>
						<i class="fa fa-fw fa-cc-amex"></i> Paypal
					</p>
					<p>
						<i class="fa fa-fw fa-credit-card"></i> Visa /Master Card
					</p>
					<br> <i
						class="fa fa-facebook-official w3-hover-opacity w3-large"></i> <i
						class="fa fa-instagram w3-hover-opacity w3-large"></i> <i
						class="fa fa-snapchat w3-hover-opacity w3-large"></i> <i
						class="fa fa-pinterest-p w3-hover-opacity w3-large"></i> <i
						class="fa fa-twitter w3-hover-opacity w3-large"></i> <i
						class="fa fa-linkedin w3-hover-opacity w3-large"></i>
				</div>
			</div>
		</footer>

		<div class="w3-black w3-center w3-padding-24" style="width: 100%">
			Powered by <a href="https://www.w3schools.com/w3css/default.asp"
				title="W3.CSS" target="_blank" class="w3-hover-opacity">w3.css</a>
		</div>
	</div>
</body>
</html>