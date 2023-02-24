<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
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
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"
				class="d-inline-block align-text-top"><img
				src="https://dynamic.brandcrowd.com/asset/logo/788a014d-fa14-4e9a-bac2-61bc2a4ade40/logo-search-grid-1x?logoTemplateVersion=1&v=638067535570070000"
				alt="" height="48" width="80"> </a>
			<ul>
				<li style="display: inline-block; padding: 20px;"><a
					href="index.jsp" class="col-lg-2 col-sm-2" class="btn btn-primary">Home</a>
				<li style="display: inline-block;">
			</ul>
		</div>
	</nav>

	<h1>welcome to flight</h1>
	<form action="flight" method="post">
		<div class="mb-3">
			<label for="formFile" class="form-label">Company Name</label> <input
				type="text" class="form-control" name="cname" id="formFile"
				placeholder="Enter your Company name" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">flight Name</label> <input
				type="text" class="form-control" name="fname" id="formFile"
				placeholder="Enter your Flight name" />
		</div>

		<div class="mb-3">
			<label for="formFile" class="form-label">Enter Cost</label> <input
				type="text" class="form-control" name="cost" id="formFile"
				placeholder="Enter your Cost" />
		</div>

		Select Flight type <select class="form-select"
			aria-label="Default select example" name="type">
			<option selected>Select your Flight type</option>
			<c:forEach items="${type}" var="t">
				<option value="${t} }">${t}</option>

			</c:forEach>

		</select> Select Flight Country <select class="form-select"
			aria-label="Default select example" name="country">
			<option value="">Select your Country</option>
			<c:forEach items="${country}" var="c">
				<option value="${c}">${c}</option>
			</c:forEach>

		</select> <input type="submit" value="save" class="btn btn-primary" />
	</form>
</body>
</html>