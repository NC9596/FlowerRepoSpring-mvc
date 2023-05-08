<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flower View Page</title>
</head>
<body>

<h2>Welcome to Flower View Page</h2>

<table border=2>

<tr>
	<th>Id</th>
	<td>${objOfFlower.id}</td>
</tr>
<tr>
	<th>name</th>
	<td>${objOfFlower.name}</td>
</tr>
<tr>
	<th>phNum</th>
	<td>${objOfFlower.colour}</td>
</tr>
<tr>
	<th>email</th>
	<td>${objOfFlower.cost}</td>
</tr>

<tr>
	<th>Delete</th>
	<td>
		<a href="/FlowerSpringBootCRUDProj/delete?id=${emp.id}">Delete</a>
	</td>
</tr>
<tr>
	<th>Update</th>
	<td>
		<a href="/FlowerSpringBootCRUDProj/getUpdate?id=${emp.id}">Update</a>
	</td>
</tr>

</table>

<a href="/FlowerSpringBootCRUDProj/all">View All</a> &nbsp;
<a href="/FlowerSpringBootCRUDProj/reg">Register</a> &nbsp;
<a href="/FlowerSpringBootCRUDProj/">Home</a>

${msg}

</body>
</html>