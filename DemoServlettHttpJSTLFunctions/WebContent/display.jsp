<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>New Title</title>
</head>
<body>
	<c:set var="str" value="Navin Reddy is a Java Trainer" />
	Length : ${fn:length(str)}
	<c:forEach items="${fn:split(str,' ')}" var="s">
	<br>
	${s}
	</c:forEach>
	<br>
	index :  ${fn:indexOf(str, "is")}
	<br>
	is there : ${fn:contains(str, "Java")}
	<br>
	<c:if test="${fn:contains(str,'Trainer')}">
		Trainer is there
	</c:if>
</body>
</html>