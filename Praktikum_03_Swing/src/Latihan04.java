import javax.swing.JOptionPane;
import java.util.regex.Pattern;
public class Latihan04 {

	public static void main(String[] args) {
		JOptionPane myBio = new JOptionPane();
		
		String fullname, alamat, age;
		boolean isLanjut = true;
		     
		fullname = JOptionPane.showInputDialog(
				null, 
				"Masukan Nama Lengkap Anda : ",
				"Form Input Nama",
				JOptionPane.QUESTION_MESSAGE
		);
		
		alamat = JOptionPane.showInputDialog(
				null, 
				"Masukan Alamat Rumah Anda : ",
				"Form Input Alamat",
				JOptionPane.QUESTION_MESSAGE
		);
		
		age = JOptionPane.showInputDialog(
				null, 
				"Masukan Umur Anda :",
				"Form Input Umur",
				JOptionPane.QUESTION_MESSAGE
		);
		
		
		if(fullname.isEmpty() && alamat.isEmpty() && age.isEmpty()) {
				JOptionPane.showMessageDialog(
						null, 
						"Field fullname/usia/alamat tidak boleh kosong", 
						"Error Message", 
						JOptionPane.ERROR_MESSAGE);
		}

		else 
			if(!Pattern.matches("^[0-9]+$", age)) {
			JOptionPane.showMessageDialog(
					null, 
					"Isian usia harus angka",
					"Error Message", 
					JOptionPane.ERROR_MESSAGE);
		}
		
		else if(alamat.length() < 10) {
			JOptionPane.showMessageDialog(
					null, 
					"Masukan alamat minimum 10 karakter",
					"Error Message", 
					JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(
					null, 
					"Seluruh informasi telah dimasukan",
					"Output Message", 
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		int keluar = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin keluar?", "Keluar?", JOptionPane.YES_NO_OPTION);
		
		if(keluar == JOptionPane.YES_OPTION) {
			isLanjut = false;
		} else {
			isLanjut = true;
		}
		JOptionPane.showMessageDialog(null, "Program Selesai");
	}
	

	}



