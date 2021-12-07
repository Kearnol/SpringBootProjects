<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Counter</title>
</head>
<body>
	You have visited this page <c:out value="${count}"/> times.
	<button><a href="/addtwo">Add two</a></button>
	<button><a href="/reset">Reset Counter</a></button>
</body>
</html>