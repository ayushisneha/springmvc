<%@page import="java.util.Iterator"%>
<%@page import="org.springframework.ui.Model"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" />

<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" style="background: #3366cc !important">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">RANJAN DECORATORS</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="/dbms/user">Home</a></li>
				<li><a href="addcat">ADD CATEGORY</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
			<c:if test="${pageContext.request.userPrincipal.name != null}">
				<li><a href="<c:url value="/j_spring_security_logout" />"><span class="glyphicon glyphicon-log-out"></span>
						Logout</a></li>
						</c:if>
			</ul>
		</div>
	</nav>
	<br>
	<br>
	<br>
<%
List<Item> list=(List<Item>)  request.getAttribute("list");
Iterator itr=list.iterator();
while(itr.hasNext())
{
	Item item=(Item)itr.next();
	out.println("<div style=\"background-color:#2196F3;;float:left;width:30%;margin-left:5%;margin-top:5%\"><h4>"+item.getName() +"<a href=\"buyitem/"+item.getItemId() +"\">Buy this item</a></h4></div>");
	
}

%>
<script src="webjars/jquery/1.11.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>