<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Start page</title>
</head>
<body>
<form action ="controller" method="post">
	<input type="hidden" name="command" value="authorization"/>
	<input type="text" name="login" value="login"/>
	<input type="password" name="pass" value="password"/>
	<input type="submit" name="Sign in" value="Sign in"><br/>
	<input type="submit" name="Registration" value="Registration">
</form>
</body>
</html>