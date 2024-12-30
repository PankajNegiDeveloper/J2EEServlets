<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index Page</title>
</head>
<body>
	<h1>Index Page</h1>
	<form action="save">
		<label>Enter Employee id: </label> <input type="text" name="id"
			placeholder="Enter your id"> <br> <br> <label>Enter
			your Name: </label> <input type="text" name="name"
			placeholder="Enter your Name"> <br> <br> <label>Enter
			your Email </label> <input type="email" name="email"
			placeholder="Enter your Email"> <br> <br> <label>Enter
			your Salary: </label> <input type="text" name="salary"
			placeholder="Enter your salary"> <br> <br> <label>Enter
			your password: </label> <input type="password" name="password"
			placeholder="Enter your password"> <br> <br>
		<button target="_blank" type="submit">Submit</button>
		<br>
		<br>
		<h3>
			<a href="findall">View all Employee data</a>
		</h3>
	</form>
</body>
</html>