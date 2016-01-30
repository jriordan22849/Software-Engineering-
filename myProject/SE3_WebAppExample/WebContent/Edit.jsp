<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
<h1>Update User information</h1>
</div>
<body>
            <form action="FrontController" method="post">
                <table>
                    <tr>
                        <td> new password  : </td><td> <input name="password" size=15 type="text" /> </td> 
                    </tr>
                </table>
                
                <input type="hidden" name="action" value="Updateaccount" />
                <input type = "hidden" name = "username" value = "${user.username}" />
                <input type="submit" value="Update" />
            </form>

</body>
</html>