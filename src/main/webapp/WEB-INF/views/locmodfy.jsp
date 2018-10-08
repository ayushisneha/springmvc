<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${list }" var="loc">
<h2>Name: ${loc.lname } <br> Price: ${loc.price } <br> Address: ${loc.address }</h2>
<h3><a href="book/${loc.lid }">BOOK</a></h3><br>
<br>
<br>
</c:forEach> 
</body>
</html>