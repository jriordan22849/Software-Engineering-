<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import= "com.example.business.User" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Users</title>
<style>
#header {
    background-color:black;
    color:white;
    text-align:center;
    padding:5px;
}
table, th, td  { 
   border: 1px solid black; }
table {
	display: table;
    border-collapse: separate;
    border-spacing: 4px;
    border-color: gray;}
</style>
</head>
<body>

<div id="header">
<h1>Users Table</h1>
</div>

<table style="width:50%" align="center">
<tr>
    <th>First Name</th>
    <th>Surname</th> 
    <th>Username</th>
  </tr>

<% 
	List<User> users;
	users = (List)(request.getSession().getAttribute("users"));
	
	for(int i = 0; i < users.size(); i++) {
		%>
		<tr>
			<td><%=users.get(i).getFirstName() %></td>
			<td><%=users.get(i).getLastName() %></td>
			<td><%=users.get(i).getUsername() %></td>
		</tr>
		<%
		
	}
%>
	
</table>	
</body>

</html>