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
<title>Category</title>
</head>
<body>
<h2>ALL CATEGORY</h2>
<c:forEach items="${list }" var="cat">
<table>
<tr><td><a href="buyitem/${cat.cid }">${cat.cname }</a></td></tr><br>
</table>
</c:forEach> 
</body>
</html>