<%@page import="org.springframework.ui.Model"%>
<%@page import="com.ayushi.model.Location"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<%@ page isELIgnored="false" %>
<meta charset="UTF-8">
<title>Location</title>
</head>
<body>
<c:forEach items="${list }" var="loc">
<h2>Name: ${loc.lname } <br> Price: ${loc.price } </h2>
<h3><a href="addtocart/${loc.lid }">Add to Cart</a></h3><br>
</c:forEach> 
</body>
</html>