<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flower Register/Edit Page</title>
</head>
<body>

<c:choose>
	<c:when test="${'edit' eq mode }">
		<h3>Welcome to Flower Edit Page</h3>
		<c:set var="eid"  value="${id}" ></c:set>
	</c:when>
	<c:otherwise>
		<h3>Welcome to Flower Registration Page</h3>
	</c:otherwise>
</c:choose>

<pre>
<form:form action="save" method="post" modelAttribute="objOfFlower">

<c:if test="${'edit' eq mode }">
Id     : <form:input path="id"  readOnly="true"/>	
</c:if>

name     : <form:input path="name"/>

colour   	 : <form:input path="colour"/>

cost   : <form:input path="cost"/>

<c:choose>
	<c:when test="${'edit' eq mode }">
		<input type="submit" value="Update Flower">
	</c:when>
	<c:otherwise>
		<input type="submit" value="Register Flower">
	</c:otherwise>
</c:choose>

</form:form>

</pre>

${msg}

<a href="/FlowerSpringBootCRUDProj/all">Show All</a> &nbsp;
<a href="/FlowerSpringBootCRUDProj/">Home</a>



</body>
</html>