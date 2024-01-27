<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@ page import ="simpleweb1.studentmodel"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
if(session.getAttribute("username")==null){
	response.sendRedirect("NewFile.jsp");
	
}

%>
<table>
<%try{ %>
<%int i=10/0 ;%>
<%= i %>
        <%}catch(Exception e){} %>   

</table>
</body>
</html>