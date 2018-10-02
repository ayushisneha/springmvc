<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
<title>ADMIN</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
<div class="container">
<div class="jumbotron">
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <h2>
            Welcome to the admin page :<mark>${user}</mark>  | <a
                href="<c:url value="/j_spring_security_logout" />"> Logout</a>
        </h2>
    </c:if>
    </div>
    <h2> <a href="admin/allusers">All USERS</a></h2>
    <h2> <a href="admin/allcat">All Category</a></h2>
    <h2><a href="admin/alllocation">Location</a></h2>
    <h2><a href="admin/allstage">Stage</a></h2>
    </div>
</body>
</html>
