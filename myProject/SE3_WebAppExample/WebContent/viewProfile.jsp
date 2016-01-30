<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="java.util.*" %>
<%@ page import="com.example.business.Movie" %>



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
</head>
<style>
#header {
    background-color:black;
    color:white;
    text-align:center;
    padding:5px;
}

</style>
</head>
<body>
<div id="header">
<h1>Edit Movie</h1>
</div>

<form action="FrontController" method="post" >
<table align="center">
	<tr>
	  <td>ID:</td><td> <%= session.getAttribute("movieid") %></td>
	</tr>
	<tr>  
	  <td>Movie Name:</td><td><%= session.getAttribute("moviename") %></td>
	</tr>
	<tr>  
	  <td>Director:</td><td><%= session.getAttribute("director") %></td>
	</tr>
	<tr>  
	  <td>Category:</td><td><%= session.getAttribute("category") %></td>
	</tr>
	<tr>
		<td>Rating:</td>
		<td>
			<select name ="SelectedRating">
  				<option value="1">1</option>
  				<option value="2">2</option>
  				<option value="3">3</option>
  				<option value="4">4</option>
  				<option value="5">5</option>
  				<option value="6">6</option>
  				<option value="7">7</option>
  				<option value="8">8</option>
  				<option value="9">9</option>
  				<option value="10">10</option>
  			
			</select>
		</td>
	<tr>  
	  <td>Comment:</td><td> <input name="addcomment" size=15 type="text" /> </td> 
	</tr>

</table>
	     <input type="hidden" name="action" value="UpdateMovie" />
         <input type="submit" value="Update Movie" />
 </form>


</body>
</html>