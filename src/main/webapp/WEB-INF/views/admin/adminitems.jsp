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
<h2><a href="additems/${catid }">ADD ITEMS</a></h2>
<div class="list-group">
<c:forEach items="${list }" var="item">
<table>
<td><tr>${item.name } ${item.price } </tr></td><br>
</table>
</c:forEach>
</div> 
</body>
</html>