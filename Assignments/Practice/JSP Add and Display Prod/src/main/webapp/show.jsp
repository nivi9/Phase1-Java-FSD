<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ProductClass"%>
<%@page import="java.util.Iterator"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product </title>

</head>
<body>

	<%
		ArrayList<ProductClass> p1 = (ArrayList) request.getAttribute("data");
	%>

	
		<table border="1">
		
		<h1>List of Products</h1>
		<br>
		<br>

			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Color</th>
				<th>Price</th>
			</tr>
			<%
				if (request.getAttribute("data") != null) {
					Iterator<ProductClass> iterator = p1.iterator();
					while (iterator.hasNext()) {
						ProductClass pc = iterator.next();
			%>
			<tr>
				<td><%=pc.getId()%></td>
				<td><%=pc.getName()%></td>
				<td><%=pc.getColor()%></td>
				<td><%=pc.getPrice()%></td>
			</tr>
			<%
				}
				}
			%>
		</table>

</body>
</html>