/* 
 * Jonathan Riordan
 * C13432152
 * Software Engineering 3 assignment.
 * Implemented list all the movies, add a comment, add a rating to a movie and edit user password.
 */

package com.example.command;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.business.User;

public class ViewUserProfileCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse repsonse){
		
		String forwardToJsp = "";		
		
		User mUser = null;

		HttpSession session = request.getSession();
		//String clientSessionId = session.getId();
		mUser = (User)session.getAttribute("user");
	
			
		if(mUser != null) {
			
			forwardToJsp = "/ViewUserProfile.jsp";
		} else {
			forwardToJsp = "/errorPage.jsp";	
		}
	
		return forwardToJsp;
	}

}