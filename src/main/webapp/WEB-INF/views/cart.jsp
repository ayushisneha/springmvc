<%@page import="org.springframework.ui.Model"%>
<%@page import="com.ayushi.model.Category"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<%@ page isELIgnored="false" %>
<meta charset="UTF-8">
<title>Items</title>
</head>
<body>
<h2>ITEMS IN CART</h2>
<c:forEach items="${list }" var="item">

<h2>Name:${item.iid }</h2>

</c:forEach> 
</body>
</html>