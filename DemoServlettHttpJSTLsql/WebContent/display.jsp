<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Title</title>
</head>
<body>
<sql:setDataSource	var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/publications" user="root" password=""/>
	<sql:query var="rs" dataSource="${db}">select * from users</sql:query>
	<c:forEach items="${rs.rows}" var="row">
		<c:out value="${row.forename}"></c:out> : <c:out value="${row.surname}"></c:out><br>
	</c:forEach>
	
</body>
</html>