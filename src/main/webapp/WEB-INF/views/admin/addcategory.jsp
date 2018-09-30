<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" modelAttribute="category" action="addcat">
<table>
<tr><td>Category Name:</td>
<td><form:input path="cname" type="text" required="required"/>
<form:errors path="cname"></form:errors>
</td></tr>
<tr><td><input type="submit"/></td></tr>
</table>
</form:form>
</body>
</html>