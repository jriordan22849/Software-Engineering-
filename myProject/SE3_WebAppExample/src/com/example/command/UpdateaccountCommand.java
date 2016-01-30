/* 
 * Jonathan Riordan
 * C13432152
 * Software Engineering 3 assignment.
 * Implemented list all the movies, add a comment, add a rating to a movie and edit user password.
 */

package com.example.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.service.UserService;

public class UpdateaccountCommand implements Command {

	
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String forwardToJsp = "";
		UserService userservice = new UserService();
		String uname = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(uname != null && password != null) {
			boolean test = userservice.updateUser(uname,password);
			
			if(test) {
				forwardToJsp = "/loginSuccess.jsp";
			} else {
				forwardToJsp = "/errorPage.jsp";	
			}
			
		}
	
		
		return forwardToJsp;
	}

}
