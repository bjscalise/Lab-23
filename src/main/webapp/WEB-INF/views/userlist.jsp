<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/slate/bootstrap.min.css" 
rel="stylesheet" 
integrity="sha384-ywjdn7N8uoxzIfGl7jlEBlqw2BNicOSzZDgo7A2ffvbM24Ct9plRp7KwtaIqZ33j" 
crossorigin="anonymous">
</head>
<body>

<h1> Please select from the following users.</h1>
<form>
		<table class="table">
			<thead>
				<tr>
					<th>Name</th>
					<td>
					<th>Phone number</th>
					<td>
					<th>E-mail</th>
					<td>
					<th>Update</th>
					<td>
					<th>Remove</th>
				<tr>
			</thead>
			<tbody>
				<c:forEach items="${users}" var="u">
					<tr>
						<td>${u.fname} <p> <p> ${u.lname}
						<td>
						<td>${u.phoneNum}
						<td>
						<td>${u.email}
						<td>
						<td><a class="btn btn-primary" href="/update?id=${f.id}">Edit</a></td>
						<td>
						<td><a class="btn btn-primary" href="/delete?id=${f.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</form>
<!-- 	<div> -->
<!-- 		<h1>Add another user</h1> -->
<!-- 		<a href="add-food" class="btn btn-secondary"> Add </a> -->
<!-- 	</div> -->

</body>
</html>