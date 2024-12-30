<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<style>

table, th, td{
border:2px solid;
align: center;
border-collapse: collapse;
}
</style>
</head>
<body>
	<%
	ResultSet rs = (ResultSet) request.getAttribute("rs");
	%>
	<!-- (%<) this tag is used to write java code -->
	<h1>Home Page/All employees Details</h1>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Salary</th>
			<th>Password</th>
			<th colspan=2>Action</th>
		</tr>
		<%
		while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString(1)%></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString(3)%></td>
			<td><%=rs.getString(4)%></td>
			<td><%=rs.getString(5)%></td>
			<td><a href="delete?id=<%=rs.getString(1)%>" target="_blank"><button>Delete</button></a></td>
			<td><a href="updatepage?id=<%=rs.getString(1)%>" target="_blank"><button>Update</button></a></td>
		<tr>
			<%
			}
			%>		
	</table>
</body>
</html>