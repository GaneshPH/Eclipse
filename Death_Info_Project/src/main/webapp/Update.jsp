<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<a href="SearchByName.jsp" class="btn btn-success">Search By Name</a>

		</div>

	</nav>


	<h1>Update the Death_Info</h1>

	<c:forEach items="${err}" var="V">
		<span style="color: red">${V.message}</span>

	</c:forEach>

	<span style="color: green">${msg}</span>
	

	<form action="update" method="post">

		<div class="mb-3">
			<label for="formFile" class="form-label">ID</label> <input
				class="form-control" type="number" value="${dto.id}" id="id" name="id"
				placeholder="Enter the id">
		</div>

		<div class="mb-3">
			<label for="formFile" class="form-label">Name</label> <input
				class="form-control" type="text" value="${dto.name}" id="name"
				name="name" placeholder="Enter the name">
		</div>

		<div class="mb-3">
			<label for="formFile" class="form-label">age</label> <input
				class="form-control" type="number" id="age" value="${dto.age}"
				name="age" placeholder="Enter the address">
		</div>

		<div class="mb-3">
			<label for="formFile" class="form-label">ReasonOfDeath</label> <input
				class="form-control" type="text" id="reasonOfDeath" value="${dto.reasonOfDeath}"
				name="reasonOfDeath" placeholder="Enter the reasonOfDeath">
		</div>


		<div>
			<label>Location</label> <select class="form-select"
				aria-label="Default select example" name="location">
				<option selected>Select Location</option>
				<option value="Hospital">Hospital</option>
				<option value="Home">Home</option>
				<option value="Accident On Road">Accident On Road</option>
				<option value="While Travelling in vehicle">While Travelling in vehicle</option>
			</select>
		</div>

			<div class="mb-3">

			Married
			<div>
			<input name="married" type="radio" value="true" /> Yes<br>
			<input name="married" type="radio" value="false" /> No<br>
			</div>

		</div>
		

		<button type="Submit" name="update" class="btn btn-dark">Update</button>

	</form>
	
</body>
</html>