package com.ibik.pbo.praktikum;

import java.sql.*;

import javax.swing.JOptionPane;

public class MainApps {
	
	MainApps(){
		ConnectionDB conn = new ConnectionDB();
		try {
			conn.connect();
			JOptionPane.showMessageDialog(null, "Berhasil");
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Tidak Berhasil");
		}
			
		
		
	}
	public static void main(String[] args) {
		new MainApps();

	}

}
