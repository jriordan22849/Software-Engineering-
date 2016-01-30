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

import com.example.business.Movie;
import com.example.business.User;
import com.example.service.MovieService;
import com.example.service.UserService;

public class EditMovieCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse repsonse){
		
		MovieService movieService = new MovieService();
		String forwardToJsp = "";		

		String movieid = request.getParameter("movieId");
		String moviename = request.getParameter("movieName");
		String director = request.getParameter("movieDirector");
		String category = request.getParameter("movieCategory");
		String rating = request.getParameter("movieRating");
		String comment = request.getParameter("movieComment");
		
		System.out.println(movieid);
		System.out.println(moviename);
		System.out.println(director);
		System.out.println(category);
		System.out.println(rating);
		System.out.println(comment);
		
		
		if(movieid != null && moviename != null && director != null) {

			HttpSession session = request.getSession();
			session.setAttribute("movieid", movieid);
			session.setAttribute("moviename", moviename);
			session.setAttribute("director", director);
			session.setAttribute("category", category);
			session.setAttribute("rating", rating);
			session.setAttribute("comment", comment);
						
			forwardToJsp = "/viewProfile.jsp";
		} else {
			forwardToJsp = "/errorPage.jsp";	
		}
	
		return forwardToJsp;
	}

}
