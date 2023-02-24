<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
</head>
<body>


	<nav class="navbar navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Egyptair.a330-200.su-gce.arp.jpg/1200px-Egyptair.a330-200.su-gce.arp.jpg"
				alt="" width="80" height="44" class="d-inline-block align-text-top">
	
			</a> <a href="index.jsp" class="btn btn-success">Home</a>

		</div>

	</nav>

	<h1>Search by ID</h1>
	
	<h4 style="color: red">${msg }</h4>
	<form action="search">
	<input type="text" name="id">
	<input type="submit" value="Search" class="btn btn-primary">
	</form>
	
	<h5 style="color: blue">
	
	Company:${DTO.company}<br>
	Name:${DTO.name }<br>
	Cost:${DTO.cost }<br>
	Type:${DTO.type }<br>
	Country:${DTO.country }
	</h5>
</body>
</html>