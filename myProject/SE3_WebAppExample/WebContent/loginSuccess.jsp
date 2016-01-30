<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Success</title>
</head>
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
<h1>Main Menu</h1>
</div>

	<br/><br/>
	
	<c:set var="user" value="${sessionScope.user}"/>
	<b>Option</b>
	
	<br/><br/>
	
	<form action="FrontController" method="post">
	     <input type="hidden" name="action" value="ListUsers" />
         <input type="submit" value="List Users" />
    </form>
    
    <form action="FrontController" method="post">
	     <input type="hidden" name="action" value="ListMovies" />
         <input type="submit" value="List Movies" />
    </form>  
    
    
    <form action="FrontController" method="post">
	     <input type="hidden" name="action" value="ViewUserProfile" />
         <input type="submit" value="View My Profile" />
    </form>    
    

     <form action="FrontController" method="post">
	     <input type="hidden" name="action" value="EditUser" />
         <input type="submit" value="Edit User" />
     </form>  
		
</body>

</html>