/* 
 * Jonathan Riordan
 * C13432152
 * Software Engineering 3 assignment.
 * Implemented list all the movies, add a comment, add a rating to a movie and edit user password.
 */

package com.example.service;

import com.example.business.User;
import com.example.dao.UserDao;
import com.example.exceptions.DaoException;

import java.util.ArrayList;
import java.util.List;



public class UserService {

	UserDao dao = new UserDao();
	
	public User login(String username, String password){
		
		User u = null;
		try {			
			u = dao.findUserByUsernamePassword(username, password);
		} 
		catch (DaoException e) {
			e.printStackTrace();
		}
		return u;
		
	}
	
	public User userDetails(String username, String password, String lastname, String firstname) {
		User u = null;
		try {
			u = dao.getUserDetails(username, password, lastname, firstname);
		} catch (DaoException e) {
			e.printStackTrace();
		}
		return u;
	}
	
	public List<User> getAllUsers() {
		List<User> userList = new ArrayList<User>();
		try {
			userList = dao.getAllUsers();
		} catch (DaoException e) {
			e.printStackTrace();
		}
		return userList;
		
	}
	
	public boolean updateUser(String user, String password) {
		boolean update = false;
		
		try {
			update = dao.updateUser(user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return update;
		
	}
		
}
