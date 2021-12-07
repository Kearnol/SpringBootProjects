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
	<table>
		<thead>
			<tr>
				<td>Name</td>
				<td>Price</td>
			</tr>
			<c:forEach var="fruit" items="${fruits}">
				<tr>
					<td><c:out value="${fruit.name}"/></td>
					<td><c:out value="${fruit.price}"/></td>
				</tr>
			</c:forEach>
		</thead>
	</table>
	<button><a href="/counter"> Go to Counter </a></button>
</body>
</html>