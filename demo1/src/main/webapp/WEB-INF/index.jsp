<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello!</title>
</head>
<body>
	<h1>Hello World!</h1>
	<c:out value ="${2+2}"/>
	<h1>Welcome to Coding Dojo<c:out value="${dojoName}"/></h1>
</body>
</html>