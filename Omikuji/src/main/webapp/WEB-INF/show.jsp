<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>Results</h1>
		<h3>In <c:out value="${number}"/> years, you will live in <c:out value="${city}"/> with <c:out value="${person}"/> as your roommate, <c:out value="${endeavor}"/> for a living. The next time you see a <c:out value="${thing}"/> you will have good luck. Also, <c:out value="${nicety}"/></h3>
	</div>
	
	<a href="/omikuji">Go Back</a>
	
</body>
</html>