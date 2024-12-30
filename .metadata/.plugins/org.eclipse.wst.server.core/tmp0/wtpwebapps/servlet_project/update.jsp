<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Page</title>
</head>
<body>
	<%
	ResultSet rs = (ResultSet) request.getAttribute("rs");
	%>
	<h1>Update the Data</h1>
	<form action="update">
		<label>Enter Employee id: </label> <input type="text"
			value="<%=rs.getString(1)%>" name="id" placeholder="Enter your id">
		<br> <br> <label>Enter your Name: </label> <input
			type="text" value="<%=rs.getString(2)%>" name="name"
			placeholder="Enter your Name"> <br> <br> <label>Enter
			your Email </label> <input type="email" value="<%=rs.getString(3)%>"
			name="email" placeholder="Enter your Email"> <br> <br>
		<label>Enter your Salary: </label> <input type="text"
			value="<%=rs.getString(4)%>" name="salary"
			placeholder="Enter your salary"> <br> <br> <label>Enter
			your password: </label> <input type="password" value="<%=rs.getString(5)%>"
			name="password" placeholder="Enter your password"> <br>
		<br>
		<button type="submit" target="_blank">Update</button>
	</form>
</body>
</html>