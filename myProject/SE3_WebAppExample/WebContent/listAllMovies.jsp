<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import= "com.example.business.Movie" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movies</title>
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
</head>
<body>
<div id="header">
<h1>Movies Table</h1>
</div>
<table style="width:50%" align="center">
<tr>
    <th>Movie Title</th>
    <th>Director</th> 
    <th>Category</th>
    <th>Rating</th>
    <th>Comment</th>
  </tr>

<% 
	List<Movie> m;
	m = (List)(request.getSession().getAttribute("movies"));
	
	for(int i = 0; i < m.size(); i++) {
		%>
		<tr>
			<td><%=m.get(i).getMoviename() %></td>
			<td><%=m.get(i).getDirector() %></td>
			<td><%=m.get(i).getCategory() %></td>
			<td><%=m.get(i).getRating() %> /10</td>
			<td><%=m.get(i).getComment() %></td>

			<td><form action="FrontController" method="post">
				<input type="hidden" name="movieId" value="<%=m.get(i).getId() %>" />
				<input type="hidden" name="movieName" value="<%=m.get(i).getMoviename() %>" />
				<input type="hidden" name="movieDirector" value="<%=m.get(i).getDirector() %>" />
				<input type="hidden" name="movieCategory" value="<%=m.get(i).getCategory() %>" />
				<input type="hidden" name="movieRating" value="<%=m.get(i).getRating() %>" />
				<input type="hidden" name="movieComment" value="<%=m.get(i).getComment() %>" />
				
			
	     		<input type="hidden" name="action" value="EditMovie" />
         		<input type="submit" value="Edit Movie" />
    		</form>
    		</td>
		</tr>
		<%
		
	}
%>
	
</table>
  	
</body>

</html>