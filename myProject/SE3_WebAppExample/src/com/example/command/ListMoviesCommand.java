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
import com.example.service.MovieService;

public class ListMoviesCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse repsonse){
		
		MovieService movieService = new MovieService();
		String forwardToJsp = "";		

		List<Movie> movieList = new ArrayList<Movie>();
		
		movieList = movieService.getAllMovies();
		
		if(!movieList.isEmpty()) {
		
			HttpSession session = request.getSession();

			session.setAttribute("movies", movieList);
			
			forwardToJsp = "/listAllMovies.jsp";
		} else {
			forwardToJsp = "/errorPage.jsp";	
		}
	
		return forwardToJsp;
	}

}
