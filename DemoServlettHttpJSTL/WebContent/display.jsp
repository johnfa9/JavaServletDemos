<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% 
	String name = request.getAttribute("label").toString(); 
	out.println(name);
	%>
	${label} <br>
	<c:out value="Hello World" />
	<c:out value="${label}" />
	<c:import url="http://www.google.com"></c:import>
	
	${student.name} <br>
	${student} <br>
	
	<c:forEach items="${students}" var = "s">
		${s}
		<br>
		${s.name}
		<br>
	</c:forEach>
</body>
</html>