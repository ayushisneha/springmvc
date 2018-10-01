<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@page session="true"%>
<html>
<body>
	<h1>Name(user) : ${name}</h1>
    <h1>Description : ${description}</h1>
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
    
</body>
</html>