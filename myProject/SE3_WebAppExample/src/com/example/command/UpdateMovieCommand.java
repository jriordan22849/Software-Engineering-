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

import com.example.service.MovieService;

public class UpdateMovieCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String forwardToJsp = "";
		MovieService movieService = new MovieService();
		String rating = request.getParameter("SelectedRating");
		String comment = request.getParameter("addcomment");
		
		HttpSession session = request.getSession(true);
		String movieid = session.getAttribute("movieid").toString();
		
//		System.out.println("For the North");
//		System.out.println(rating);
//		System.out.println(comment);
//		System.out.println(movieid);
		
		
		if(movieid != null && rating != null && comment != null) {
			boolean update = movieService.updatemovie(movieid, rating, comment);
			
			if(update) {
				forwardToJsp = "/loginSuccess.jsp";
			} else {
				forwardToJsp = "/errorPage.jsp";	
			}
			
		}
	
		
		return forwardToJsp;
	}

}
