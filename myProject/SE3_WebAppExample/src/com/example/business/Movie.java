/* 
 * Jonathan Riordan
 * C13432152
 * Software Engineering 3 assignment.
 * Implemented list all the movies, add a comment, add a rating to a movie and edit user password.
 */

package com.example.business;

import java.io.Serializable;

public class Movie implements Serializable{


	private static final long serialVersionUID = 1L;
	private int id;
	private String moviename;
	private String director;
	private String category;
	private int rating;
	private String comment;
	
	


	public Movie(int movieID, String moviename, String director,
			String category, int rating, String comment) {
		
		setId(movieID);
		setMoviename(moviename);
		setDirector(director);
		setCategory(category);
		setRating(rating);
		setComment(comment);
	}
	
	public String getMoviename() {
		return moviename;
	}


	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
