<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<style>
.box {
	text-align: center;
}
</style>
</head>
<body background="desert.jpg">
	<div class="box">
		<h1>
			<b>e-Banking</b>
		</h1>
		<br>
		<br>
		<h2>Login</h2>
		<h3>
			<form action="coorporateLogin" method="get">
				<br> Enter your name : <input type="text" name="uname"><br>
				<br>Enter your pin : <input type="password" name="pass"><br>
				<br> <input type="submit" value="Corporate Login"
					name="Corporate Login">
			</form>
			<form action="Customer" method="get">
				<br> <input type="submit" value="Customer login"
					name="Customer Login">
			</form>
			<form>
				<form action="Account"  method="get">
					<input type="submit" value="Sign up" name="Create Account">
				</form>
		</h3>
	</div>

</body>
</html>