/* 
 * Jonathan Riordan
 * C13432152
 * Software Engineering 3 assignment.
 * Implemented list all the movies, add a comment, add a rating to a movie and edit user password.
 */

package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import com.example.business.User;
import com.example.exceptions.DaoException;


public class UserDao extends Dao {

    public User findUserByUsernamePassword(String uname, String pword) throws DaoException {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User u = null;
        try {
            con = this.getConnection();
            
            String query = "SELECT * FROM USER WHERE USERNAME = ? AND PASSWORD = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, uname);
            ps.setString(2, pword);
            
            rs = ps.executeQuery();
            if (rs.next()) {
            	int userId = rs.getInt("ID");
                String username = rs.getString("USERNAME");
                String password = rs.getString("PASSWORD");
                String lastname = rs.getString("LAST_NAME");
                String firstname = rs.getString("FIRST_NAME");
                u = new User(userId, firstname, lastname, username, password);
            }
        } catch (SQLException e) {
            throw new DaoException("findUserByUsernamePassword " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                throw new DaoException("findUserByUsernamePassword" + e.getMessage());
            }
        }
        return u;     // u may be null 
    }
    
    public List<User> getAllUsers() throws DaoException {
    	List<User> userList = new ArrayList<User>();
    	Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User u = null;
        
        try {
        	con = this.getConnection();
        	
            String query = "SELECT * from user";
            ps = con.prepareStatement(query);
            
            rs = ps.executeQuery();
            while (rs.next()) {
            	int userId = rs.getInt("ID");
                String username = rs.getString("USERNAME");
                String password = rs.getString("PASSWORD");
                String lastname = rs.getString("LAST_NAME");
                String firstname = rs.getString("FIRST_NAME");
                u = new User(userId, firstname, lastname, username, password);
                userList.add(u);
            }
        } catch (SQLException e) {
            throw new DaoException("List User: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                throw new DaoException("List User" + e.getMessage());
            }
        }
        return userList;  
        	
        }
    
    public User getUserDetails(String username, String password, String lastname, String firstname) throws DaoException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User u = null;
        try {
            con = this.getConnection();
            
            String query = "SELECT * FROM USER WHERE USERNAME = ? AND PASSWORD = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, lastname);
            ps.setString(3, username);
            ps.setString(4, password);
            
            rs = ps.executeQuery();
            if (rs.next()) {
            	int userId = rs.getInt("ID");
                String uname = rs.getString("USERNAME");
                String pword = rs.getString("PASSWORD");
                String lname = rs.getString("LAST_NAME");
                String fname = rs.getString("FIRST_NAME");
                u = new User(userId, fname, lname, uname, pword);
            }
        } catch (SQLException e) {
            throw new DaoException("getUserDetails " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                throw new DaoException("getUserDetails" + e.getMessage());
            }
        }
        return u;     // u may be null 
    }
    
    public boolean updateUser(String username, String password) throws DaoException {
    	boolean updateDB = false;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = this.getConnection();
            
            String query = "UPDATE user SET PASSWORD = ? WHERE USERNAME = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, password);
            ps.setString(2, username);
    
            int check = ps.executeUpdate();
            
            if(check == 1) {
            	updateDB = true;
            }
        } catch (SQLException e) {
            throw new DaoException("updateUser " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                throw new DaoException("updateUser" + e.getMessage());
            }
        }
        return updateDB;    
    }
    
    	
}
   
