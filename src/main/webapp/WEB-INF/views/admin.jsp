<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<body>
    <h1>Name(Admin) : ${name}</h1>
    <h1>Description : ${description}</h1>
     <a href="admin/items">view all items</a>
    <a href="admin/additem">Add Item</a>
 
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <h2>
            Welcome : ${user} | <a
                href="<c:url value="/j_spring_security_logout" />"> Logout</a>
        </h2>
    </c:if>
</body>
</html>