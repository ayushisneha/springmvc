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
<c:forEach items="${list }" var="order">
<h2>Order</h2>
<h2><a href="order/${order.bid }/${order.cid }">SELECT</a></h2>
<br>
<br>
</c:forEach> 
</body>
</html>