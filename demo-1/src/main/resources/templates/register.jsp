<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style><%@include file="/WEB-INF/resources/css/templatemo_style.css"%></style>
</head>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
     width: 100%;
  }
}
</style>
<body>

<sf:form method="post" style="border:1px solid #ccc" modelAttribute="user">
  <div class="container">
		<h1 align="center">user Sign Up</h1>
		  <p>Please fill in this form to create an Account</p>
			<table style="background-color: green; margin: auto;">
			<tr>
				<td>Enter User Address</td>
				<td><sf:input  path="address"/></td>
			</tr>
		   <tr>
				<td>Enter User Name</td>
				<td><sf:input  path="customeName"/></td>
			</tr>
			<tr>
				<td>Enter User Email</td>
				<td><sf:input  path="customerEmail"/></td>
			</tr>
			<tr>
				<td>Enter User Phone Number</td>
				<td><sf:input  path="customerPhone"/></td>
			</tr>
			<tr>
				<td>Enter User Password</td>
				<td><sf:input type="password" path="password"/></td>
			</tr>
			<tr>
				<td>Enter User UserName</td>
				<td><sf:input  path="userName"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register Me" /></td>
			</tr>
		</table>
		</div>
	</sf:form>

</body>
</html>