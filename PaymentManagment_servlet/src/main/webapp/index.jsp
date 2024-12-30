<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Form CSS</title>
</head>
<style>
* {
	box-sizing: border-box;
}

body {
	font-family: Verdana, Geneva, Tahoma, sans-serif;
	margin: 15px 30px;
	font-size: 15px;
	padding: 10px;
}

.container {
	background-color: #f2f2f2;
	width: 700px;
	border: 2px solid lightgray;
	border-radius: 5px;
	padding: 5px 15px 15px 15px;
}

input[type="text"], input[type="email"], input[type="passowrd"], input[type="date"],
	select, textarea {
	width: 100%;
	background-color: #fff;
	padding: 7px 10px 7px 10px;
	border: 1px solid gray;
	border-radius: 5px;
	margin: 5px;
}

fieldset {
	width: 100%;
	background-color: #fff;
	padding: 7px 10px 7px 10px;
	border: 1px solid gray;
	border-radius: 5px;
}

.main_head {
	text-align: center;
	text-shadow: 5px 5px rgba(0, 0, 0, 0.259);
	font-size: 35px;
}

button {
	background-color: #dad7d7;
	padding: 10px;
	border: none;
	width: 100%;
	font-size: 20px;
	font-weight: bold;
	border-radius: 5px;
	cursor: pointer;
}

button:hover {
	background-color: #afadad;
}
</style>

<body>
	<div class="container">
		<form action="save">
			<h1 class="main_head">Payment Form</h1>
			<hr>
			<h1>User Information</h1>
			<br> <label for="fname">First Name: *</label> <input type="text"
				id="fname" placeholder="First Name" required> <br>
			<br> <label for="lname">Last Name: *</label> <input type="text"
				id="lname" placeholder="Last Name" required> <br>
			<br>
			<fieldset>
				<legend>
					<strong>Gender</strong>
				</legend>
				<label for="Gender">Gender: </label> <input type="radio"
					name="Gender" id="Gender">Male <input type="radio"
					name="Gender" id="Gender">Female
			</fieldset>
			<br> <label for="Add">Address:</label> <br>
			<textarea name="" id="" placeholder="Enter your Address" rows="5"
				cols="100"></textarea>
			<br>
			<br> <label for="Email">Email:</label> <input type="email"
				id="Email" placeholder="Pankaj@gmail.com"> <br>
			<br> <label for="Password">Password:</label> <input
				type="password" id="Password" placeholder="1111-2222-3333-4444">
			<h1>Payment Information</h1>
			<fieldset>
				<legend>
					<strong>Card Details</strong>
				</legend>
				<label for="Card">Card Type:</label> <select name="" id="Card">
					<option value="">---Select Card---</option>
					<option value="Visa">Visa</option>
					<option value="Master">Master</option>
					<option value="Credit">Credit</option>
					<option value="Credit">Rupey</option>
				</select> <br>
				<br> <label for="Cnumber">Card Number:*</label> <input
					type="text" id="Cnumber" required> <br>
				<br> <label for="Expiration">Expiration date:</label> <input
					type="date" id="Expiration" required> <br>
				<br> <label for="CVV">CVV:</label> <input type="text" id="CVV"
					required>
			</fieldset>
			<br>
			<!-- <input type="button"> -->
			<button type="submit">Submit</button>
			<br>
			<br> <a href="findall" target="_blank"><button type="submit">See
					all records</button></a>
		</form>
	</div>
</body>
</html>