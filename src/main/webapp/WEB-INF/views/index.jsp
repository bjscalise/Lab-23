<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/slate/bootstrap.min.css" 
rel="stylesheet" 
integrity="sha384-ywjdn7N8uoxzIfGl7jlEBlqw2BNicOSzZDgo7A2ffvbM24Ct9plRp7KwtaIqZ33j" 
crossorigin="anonymous">

</head>
<body>

	
	<h1>Welcome to Java.com</h1>
	<h3> ${firstPage } </h3>
	<h2>Please enter your info</h2>
	<form action="/userlist">
		First name: <input type="text" name="fname"><br> Last
		name: <input type="text" name="lname"><br> Phone number:
		<input type="text" name="phonenum"><br> E-mail: <input
			type="text" name="email"><br> <input type="submit"
			value="add">
			</form>
</body>
</html>