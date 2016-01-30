/* 
 * Jonathan Riordan
 * C13432152
 * Software Engineering 3 assignment.
 * Implemented list all the movies, add a comment, add a rating to a movie and edit user password.
 */

package com.example.exceptions;

import java.sql.SQLException;


public class DaoException extends SQLException {

	private static final long serialVersionUID = 1L;

	public DaoException() {
    }

    public DaoException(String aMessage) {
        super(aMessage);
    }
    
}
