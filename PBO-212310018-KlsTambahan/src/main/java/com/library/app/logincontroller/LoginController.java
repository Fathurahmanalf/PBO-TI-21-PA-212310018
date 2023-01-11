package com.library.app.logincontroller;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Panel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import com.library.app.connection.ConnectionDB;
import com.library.app.model.users;
//import com.ibik.library.app.dashboard.Dashboard;

public class LoginController {

	private JFrame frameMain;
	private JTextField textUsername;
	private JPasswordField textPassword;
	private static users user;
	
	public String getTextUsername() {
		return textUsername.getText();
	}

	public void setTextUsername(JTextField textUsername) {
		this.textUsername = textUsername;
	}
	public String getTextPassword() {
		return String.valueOf(textPassword.getPassword());
	}

	public void setTextPassword(JPasswordField textPassword) {
		this.textPassword = textPassword;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginController window = new LoginController();
					window.frameMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginController() {
		//call the ConnectionDB class using error handling : try_catch
		ConnectionDB conn = new ConnectionDB(); //init object
		
		try {
			System.out.println("test");
			conn.connect();
			initialize();
		} catch (SQLException e) { 		//error handling for if connection is connected will show window dialog, the connection is failed
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		//end call
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameMain = new JFrame();
		frameMain.getContentPane().setForeground(SystemColor.textHighlight);
		frameMain.setTitle("Login");
		frameMain.setBounds(100, 100, 292, 494);
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMain.getContentPane().setLayout(null);
		
		JLabel labelIcon = new JLabel("");
		labelIcon.setIcon(new ImageIcon("C:\\Users\\Spectre\\Downloads\\_MG_0478.jpg"));
		labelIcon.setBounds(80, 11, 109, 150);
		frameMain.getContentPane().add(labelIcon);
		
		JLabel labelTitle = new JLabel("Sistem Informasi Perpustakaan");
		labelTitle.setForeground(Color.BLACK);
		labelTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelTitle.setBounds(10, 163, 256, 31);
		frameMain.getContentPane().add(labelTitle);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Login to your account", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 227, 256, 159);
		frameMain.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel labelUsername = new JLabel("Username");
		labelUsername.setBounds(10, 35, 70, 14);
		panel.add(labelUsername);
		
		textUsername = new JTextField();
		textUsername.setBounds(90, 32, 138, 20);
		panel.add(textUsername);
		textUsername.setColumns(10);
		
		JLabel labelPassword = new JLabel("Password");
		labelPassword.setBounds(10, 74, 70, 14);
		panel.add(labelPassword);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(90, 71, 138, 20);
		panel.add(textPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textUsername.getText();
				String password = String.valueOf(textPassword.getPassword());
				
				MyResults result = new LoginController().ValidationForm(username, password);
				if(result.getResponse()) {
					JOptionPane.showMessageDialog(null,"Anda masuk ke menu dashboard");
				}
			}
		});
				btnLogin.setBounds(139, 114, 89, 23);
		panel.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
				btnCancel.setBounds(36, 114, 89, 23);
		panel.add(btnCancel);
		
		JLabel labelCopyright = new JLabel("(c) 2021 Raihan Dwi Pratama");
		labelCopyright.setBounds(10, 430, 149, 14);
		frameMain.getContentPane().add(labelCopyright);		
	}
	
private MyResults ValidationForm(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

public class MyResults extends LoginController {
	private boolean Response;
	private String Label;
	public boolean getResponse() {
		return Response;
	}
	public void setResponse(boolean response) {
		Response = response;
	}
	public String getLabel() {
		return Label;
	}
	public void setLabel(String label) {
		Label = label;
	}
}
}




