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

import com.example.business.Movie;
import com.example.exceptions.DaoException;


public class MovieDao extends Dao {
    
    public List<Movie> getAllMovies() throws DaoException {
    	List<Movie> movieList = new ArrayList<Movie>();
    	Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Movie m = null;
        
        try {
        	con = this.getConnection();
        	
            String query = "SELECT * from movie";
            ps = con.prepareStatement(query);
            
            rs = ps.executeQuery();
            while (rs.next()) {
            	int movieId = rs.getInt("ID");
                String moviename = rs.getString("Movie_Name");
                String director = rs.getString("Director");
                String category = rs.getString("Category");
                int rating = rs.getInt("Rating");
                String comment = rs.getString("Comment");
                m = new Movie(movieId, moviename, director, category, rating,comment);
                movieList.add(m);
            }
        } catch (SQLException e) {
            throw new DaoException("List Movie: " + e.getMessage());
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
                throw new DaoException("List Movie" + e.getMessage());
            }
        }
        return movieList;  
        	
    }
    
    public boolean updatemovie(String movieid, String rating) throws DaoException {
    	boolean updateDB = false;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = this.getConnection();
            
            String query = "UPDATE movie SET RATING = ? WHERE ID = ?";
            ps = con.prepareStatement(query);
            
            int movieRating = Integer.parseInt(rating);
            int movie_id = Integer.parseInt(movieid);
            ps.setInt(1, movieRating);
            ps.setInt(2, movie_id);
            //ps.setString(3, movieid);

            int check = ps.executeUpdate();
                        
            if(check == 1) {
            	updateDB = true;
            	System.out.println("Updated table");
            }
        } catch (SQLException e) {
            throw new DaoException("updatemovie " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                throw new DaoException("updatemovie" + e.getMessage());
            }
        }
        return updateDB;     // u may be null 
    }
    
    public boolean updateComment(String movieid, String comment) throws DaoException {
    	boolean updateDB = false;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = this.getConnection();
            
            String query = "UPDATE movie SET COMMENT = ? WHERE ID = ?";
            ps = con.prepareStatement(query);
            
            int movie_id = Integer.parseInt(movieid);
            ps.setString(1, comment);
            ps.setInt(2, movie_id);
            //ps.setString(3, movieid);

            int check = ps.executeUpdate();
                        
            if(check == 1) {
            	updateDB = true;
            	System.out.println("Updated comment " + comment);
            }
        } catch (SQLException e) {
            throw new DaoException("updatemovie " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                throw new DaoException("updatemovie" + e.getMessage());
            }
        }
        return updateDB;     // 
    }
    	
}
   
