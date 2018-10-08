 <%@page import="org.springframework.ui.Model"%>
<%@page import="com.ayushi.model.Location"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link href="/dbms/webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet" />
<%@ page isELIgnored="false" %>
<meta charset="UTF-8">
<title>Location</title>
</head>
<body>

	<br>
	<br>
	<br>
<div class="container">



<c:forEach items="${list }" var="loc">
<h2>Name: ${loc.lname } <br> Price: ${loc.price } <br> Address: ${loc.address }</h2>
<!--  <h3><a href="addtocart/${loc.lid }">Add to Cart</a></h3><br>-->
<br>
<br>
</c:forEach> 
</div>
<script src="/dbms/webjars/jquery/1.11.1/jquery.min.js"></script>
<script src="/dbms/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>