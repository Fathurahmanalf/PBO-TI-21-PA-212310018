package com.library.app.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.library.app.connection.ConnectionDB;
import com.library.app.model.users;

public class LoginDao {
	
	// query to database
	private String sqlLogin = "select * from User where NIK = ? and password = ?";
	
	public users checkLogin(users users) throws Exception {
		if(users == null) {
			return null;
		}
		
		ConnectionDB conn = new ConnectionDB();
		Connection c = conn.connect(); // open connection
		PreparedStatement pst = c.prepareStatement(sqlLogin);
		pst.setString(1, users.getNIK()); // entering parameter password to index 2
		pst.setString(2, users.getPassword()); //entering parameter password to index 2
		
		ResultSet rs = pst.executeQuery(); // execute query base prepared statement
		
		if(!rs.next()) {
			return null; // if condition null
		}
		
		users l = new users();
		l.setId(rs.getInt("ID"));
		l.setNIK(rs.getString("NIK"));
		l.setFullname(rs.getString("FullName"));
		l.setPlaceBirth(rs.getString("PlaceBirth"));
		l.setBirthdate(rs.getString("Birthdate"));
		l.setGender(rs.getString("Gender"));
		l.setAddress(rs.getString("Address"));
		l.setEmail(rs.getString("Email"));
		l.setPassword(rs.getString("Password"));
		
		c.close(); //close connection to database
		return l;
	}
}
