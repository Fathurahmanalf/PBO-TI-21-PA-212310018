package com.ibik.pbo.praktikum;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class SwingApp extends JFrame  {
	
	SwingApp() {

	
		//menampilkan frame
		setVisible(true);
		
		// agar posisi ditengah
		pack();
		setLocationRelativeTo(null);
		
		// mengatur layout
		setSize(300, 300);
		
		// menambahkan judul frame
		setTitle("Window Frame");
		
		// menutup operasi
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// memanggil fungsi GeneratedUI
		GeneratedUI(this);
		
		//agar ukuran menjadi tetap
		
		
	}
	public static void main(String[] args) {
		new SwingApp();

	}
	
//	private void GeneratedUI(JFrame frame) {
//		JButton button1 = new JButton("NORTH");
//		JButton button2 = new JButton("SOUTH");
//		JButton button3 = new JButton("EAST");
//		JButton button4 = new JButton("WEST");
//		JButton button5 = new JButton("CENTER");
//		
//			add(button1, BorderLayout.NORTH);
//			add(button2, BorderLayout.SOUTH);
//			add(button3, BorderLayout.EAST);
//			add(button4, BorderLayout.WEST);
//			add(button5, BorderLayout.CENTER);
//			
//			// LEFT, RIGHT, CENTER, LEADING, TRAILING
//			//setLayout(new FlowLayout(FlowLayout.CENTER));
//			
//			
//	}
	
	private void GeneratedUI (JFrame frame) {
		JButton button1 = new JButton("NORTH");
		JButton button2 = new JButton("SOUTH");
		JButton button3 = new JButton("EAST");
		JButton button4 = new JButton("WEST");
		JButton button5 = new JButton("CENTER");
		button5.setText("Klik saya");
		button5.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\iconn.png"));
		add(button1, BorderLayout.NORTH);
		add(button2, BorderLayout.SOUTH);
		add(button3, BorderLayout.EAST);
		add(button4, BorderLayout.WEST);
		add(button5, BorderLayout.CENTER);
		
		button5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Anda Baru Saja Klik");
				
			}
		});
//		setLayout(new FlowLayout(FlowLayout.CENTER));
//		
	}

}
	//    SwingApp(){
//        JFrame frame = new JFrame();
//        frame.setVisible(true);
//        frame.pack();
//        frame.setLocationRelativeTo(null);
//        frame.setSize(300, 300);
//        frame.setTitle("Contoh Window Frame");
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setResizable(false);
//        GenerateUI(frame);
//    }
//    public static void main(String[] args) {
//        new SwingApp();
//    }
//
//    private void GenerateUI(JFrame frame){
//        JButton button1 = new JButton("North");
//        JButton button2 = new JButton("South");
//        JButton button3 = new JButton("East");
//        JButton button4 = new JButton("West");
//        JButton button5 = new JButton("Centre");
//
//        
//      
//
//        //add component button to frame
//        frame.add(button1); frame.add(button2);
//        frame.add(button3); frame.add(button4);
//
//        //setting container
//        frame.setLayout(new FlowLayout());
//        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
//
//    }
//}
