<%@page import="java.util.Iterator"%>
<%@page import="org.springframework.ui.Model"%>
<%@page import="com.ayushi.model.Category"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Category</title>
</head>
<body>
<%
List<Category> list=(List<Category>)  request.getAttribute("list");
Iterator itr=list.iterator();
while(itr.hasNext())
{
	Category category=(Category)itr.next();
	out.println("<div style=\"background-color:red;float:left;width:30%;margin-left:5%;margin-top:5%\"><h4>"+category.getCname() +"<a href=\"buyitem/"+category.getCid() +"\">Buy this item</a></h4></div>");
	
}

%>
</body>
</html>