<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP DEMO</title>
</head>
<body>
<h1>First JSP Demo</h1>
<% out.print("Hey hi"); %>
<br>
<h2>Scriptlet Example</h2>
<!-- Scriptlet -->
<% String name="Nive Kamal"; %>
<% 
        int a=10;
    int b=20;
    int c  =a+b;
    out.print("Result is : "+c);
%>
<br>
<h2>Expression</h2>
<!-- Expressions -->
<%="My name is: "+name %>
<br>
<!-- -java code -->
<%! int cube(int n){
    
    return n*n*n;
}
%>
<%= "cube of 5 is: "+cube(5) %>
<br>
<%= new java.util.Date() %>
</body>
</html>