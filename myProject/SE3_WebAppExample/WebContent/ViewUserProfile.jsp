<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import= "com.example.business.User" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

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
    border-spacing: 2px;
    border-color: gray;}
</style>

<body>
<div id="header">
<h1>View Profile</h1>
</div>
<table style="width:50%" align="center">


<% 
	User users;
	users = (User)(request.getSession().getAttribute("user"));
		%>
		<tr>
			<td>First Name: </td><td><%=users.getFirstName() %></td>
		</tr>
		<tr>
			<td>Last Name:</td><td><%=users.getLastName() %></td>
		</tr>
		<tr>
			<td>User name:</td><td><%=users.getUsername() %></td>
		</tr>
		<tr>
			<td>Password:</td><td><%=users.getPassword() %></td>
		</tr>
		<%
%>
	
</table>	
</body>

</html>