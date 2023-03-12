<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>

	<nav class="navbar navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="44" class="d-inline-block align-text-top">
				X-works ODC
			</a> <a href="index.jsp" class="btn btn-success">Home</a>

		</div>

	</nav>

	<h1>Search By ID</h1>

	<form action="search" method="post">
		<input type="number" name="id" placeholder="Enter the ID"> <input
			type="submit" value="Submit">
	</form>

	<span style="color: red">${msg } </span>
	<div>
		Name:${deathInfoDTO.name}<br> 
		Age:${deathInfoDTO.age}<br>
		Location:${deathInfoDTO.location}<br>
		Reason Of Death:${deathInfoDTO.reasonOfDeath}<br>
		Married:${deathInfoDTO.married}<br>
	</div>


</body>
</html>