<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hi I am student
<% 
if(session.getAttribute("username")==null){
	response.sendRedirect("Login.jsp");
}
%>
<form action="getsampledata" method="GET">
 get data from server

  <input type="submit" value="Submit">
  
</form>
<form action="logout" method="POST">
 Log out

  <input type="submit" value="Submit">
  
</form>
</body>
</html>