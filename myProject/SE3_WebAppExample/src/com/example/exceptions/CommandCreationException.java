/* 
 * Jonathan Riordan
 * C13432152
 * Software Engineering 3 assignment.
 * Implemented list all the movies, add a comment, add a rating to a movie and edit user password.
 */

package com.example.exceptions;

public class CommandCreationException extends Exception {

	private static final long serialVersionUID = 1L;

	public CommandCreationException() {
    }

    public CommandCreationException(String aMessage) {
        super(aMessage);
    }	
	
}
