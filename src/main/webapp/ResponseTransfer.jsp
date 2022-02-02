<%-- this page the option to the user to choose between  using
 session , cookiee and requestdispatcher methods --%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>There are 3 ways to transfer information from one servlet to another servlet.</h2>
<a href="DispatcherLogin.jsp">RequestDispatcher Example</a><br><br>
<a href="SessionLogin.jsp">Session Example</a><br><br>
<a href="CookiesLogin.jsp">Cookies Example</a><br><br>
</body>
</html>