/* 
 * Jonathan Riordan
 * C13432152
 * Software Engineering 3 assignment.
 * Implemented list all the movies, add a comment, add a rating to a movie and edit user password.
 */

package com.example.service;

import com.example.business.Movie;
import com.example.dao.MovieDao;
import com.example.exceptions.DaoException;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class MovieService {

	MovieDao dao = new MovieDao();
	
	public List<Movie> getAllMovies() {
		List<Movie> movieList = new ArrayList<Movie>();
		try {
			movieList = dao.getAllMovies();
		} catch (DaoException e) {
			e.printStackTrace();
		}
		return movieList;
		
	}
	
	public boolean updatemovie(String movieid, String rating, String comment) {
		boolean update = false;
		boolean updateComment = false;
		
		try {
			update = dao.updatemovie(movieid, rating);
			updateComment = dao.updateComment(movieid, comment);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return update;
	}
	
//	public Movie getDetails(String movieID) throws DaoException {
//		Movie m = null;
//		
//		m = dao.getDetails(movieID);
//		return m;
//	}
//	

	
}
