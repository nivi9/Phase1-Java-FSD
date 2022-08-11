<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
</head>
<body>
<br>

	<form method="post" action="Product">
	<h1>Product Details</h1>
		Product Id: <input type="number" name="id" required>
		<br/>
		<br/>
	Product Name: <input type="text" name="name" required>
		<br/>
		<br/>
		Product Color: <input type="text" name="color" required>
		<br/>
		<br/>
		Product Price: <input type="number" name="price" required>
		<br/>
		<br/>
		<input type="submit" value="Submit">
	</form>


</body>
</html>