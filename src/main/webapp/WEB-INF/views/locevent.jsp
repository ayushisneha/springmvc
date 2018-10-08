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
<h2>${loc.event }</h2>
<h2><a href="./select/${loc.event }">SELECT</a></h2>
<br>
<br>
</c:forEach> 
</body>
</html>