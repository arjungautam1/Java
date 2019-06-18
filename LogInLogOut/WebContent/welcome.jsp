<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome Page</title>
</head>
<body background="desert.jpg">
<%
if(session.getAttribute("username")==null)
{
	response.sendRedirect("login.jsp");
}
%>
Welcome ${username}		<!- jstl ->
<form action="Logout">
<input type="submit" value="Logout">

</form>

</body>
</html>