 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@page session="true"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
	<div class="container"> 

	<c:if test="${pageContext.request.userPrincipal.name != null}">
        <h2>
            Welcome : ${user} | <a
                href="<c:url value="/j_spring_security_logout" />"> Logout</a>
        </h2>
        <h3>Hello role login works!!</h3>
    </c:if>
    <br>
    <br>
    <h2><a href="./allcat">view all items</a></h2>
    <h2><a href="./location">Locations</a></h2>
    <h2><a href="./stage">Stage</a></h2>
    <h2><a href="buyitem/cart">Go TO CART</a></h2>
    <h2><a href="profile">ADD PROFILE</a></h2>
    </div>
    <script src="webjars/jquery/1.11.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>