<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script><%@include file="/WEB-INF/js/date.js"%></script>
	<style><%@include file="/WEB-INF/css/styles.css"%></style>

<meta charset="UTF-8">
<title>Date</title>
</head>
<body>
	<p class="date"> <c:out value="${date}"/> </p>
</body>
</html>