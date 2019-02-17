<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<style><%@include file="/WEB-INF/css/styles.css"%></style>
<title>Home</title>
</head>
<body>
	<p class="error"> <c:out value="${error}"/> </p>
	<h3>What is the code?</h3>
	<form action="/" method="POST">
		<input type="text" name="code">
		<input type="submit" value="Try Code">
	</form>
</body>
</html>