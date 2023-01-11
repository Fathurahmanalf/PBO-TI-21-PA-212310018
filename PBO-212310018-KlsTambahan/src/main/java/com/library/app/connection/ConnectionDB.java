package com.library.app.connection;

import java.sql.*;

import javax.swing.JOptionPane;
public class ConnectionDB {
	private Connection conn;
	
	public Connection connect() throws SQLException {
		String host = "localhost::336";
		String dbName = "kelastambahan";
		String dbuser = "root";
		String dbpassword = "";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			JOptionPane jop = new JOptionPane();
			jop.showMessageDialog(null, "berhasil connect");
		} catch (ClassNotFoundException e) {
			JOptionPane jop = new JOptionPane();
			jop.showMessageDialog(null, "koneksi gagal");
			e.printStackTrace();
		}
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://"+host+"/"+dbName,
					dbuser, dbpassword);
		
		return conn;		
	}	
	
	public Connection close() throws SQLException {
		conn.close();
		return conn;
	}
}
	