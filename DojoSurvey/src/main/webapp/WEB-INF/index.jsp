<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOME</title>
</head>
<body>
<form action="/result" method="POST">
<p>Your Name: <input type="text" name="name"></p>
<p>Dojo Location:   <select name="location">
						<option value="Oakland">Oakland</option>
						<option value="San Jose">San Jose</option>
						<option value="Burbank">Burbank</option>
					</select></p>
<p>Favorite Language: <select name="language">
						<option value="Java">Java</option>
						<option value="Python">Python</option>
						<option value="JavaScript">JavaScript</option>
					</select></p>
<p>Comment(optional): <textarea name="comment"></textarea></p>
<input type="submit" value="SUBMIT">
</form>
</body>
</html>