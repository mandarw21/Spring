<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2> ${loginError}</h2>
<form action="valid" method="post">
	<table>
		<tr>
			<td>Username:</td>
			<td><input type="text" name="username" value="Username" onclick="this.select();"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password" value="Password" onclick="this.select();"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" name="submit" value="submit"></td>
		</tr>
	</table>
</form>

</body>
</html>