<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" modelAttribute="items" action="/dbms/admin/adminbuyitem/additems/${catid}">
<table>
<tr><td>ITEM NAME:</td>
<td><form:input path="name" type="text" required="required"/>
<form:errors path="name"></form:errors>
</td></tr>
<tr><td>PRICE:</td>
<td><form:input path="price" type="float" required="required"/>
<form:errors path="price"></form:errors></td></tr>
<tr><td><input type="submit"/></td></tr>
</table>
</form:form>
</body>
</html>