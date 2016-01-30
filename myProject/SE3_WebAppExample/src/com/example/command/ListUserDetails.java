/* 
 * Jonathan Riordan
 * C13432152
 * Software Engineering 3 assignment.
 * Implemented list all the movies, add a comment, add a rating to a movie and edit user password.
 */

package com.example.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.business.User;
import com.example.service.UserService;

public class ListUserDetails implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse repsonse){
		
		UserService userService = new UserService();
		String forwardToJsp = "";		

		String username;
		String password;
		String firstname;
		String lastname;
		
		//if(!usersList.isEmpty()) {
			
			//If login successful, store the session id for this client...
			HttpSession session = request.getSession();
			String clientSessionId = session.getId();
			session.setAttribute("loggedSessionId", clientSessionId);

			//session.setAttribute("users", usersList);
//			
//			forwardToJsp = "/viewProfile.jsp";
//		} else {
//			forwardToJsp = "/errorPage.jsp";	
//		}
	
		return forwardToJsp;
	}

}
