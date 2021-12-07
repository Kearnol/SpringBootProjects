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
	<h3>Login</h3>
	<form action='/omikuji/fortune' method='POST'>
		<label>Pick any number 5 to 25:</label>
		<input type="number" name='number'><br/>
		<label>Enter the name of any City:</label>
		<input type="text" name="city"><br/>
		<label>Enter the name of any real person:</label>
		<input type="text" name="person"><br/>
		<label>Enter professional endeavor or hobby:</label>
		<input type="text" name="endeavor"><br/>
		<label>Enter any type of living thing:</label>
		<input type="text" name="thing"><br/>
		<label>Say something nice to someone:</label>
		<input type="textarea" name="nicety"placeholder="Say something nice"><br/>
		<p>Send and show a friend</p>
		<input type="submit" value="send">
	</form>
</body>
</html>