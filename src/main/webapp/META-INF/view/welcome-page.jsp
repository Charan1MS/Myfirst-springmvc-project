<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center;">${Pageheading}</h1>
<hr>
<form action="processorder" style="text-align:center;" method="POST">
<label for="item_name">Item Name:</label>
<input type="text" name="foodtype" placeholder="food type??" id="item_name">
<input type="submit" value="Order">
</form>
</body>
</html>