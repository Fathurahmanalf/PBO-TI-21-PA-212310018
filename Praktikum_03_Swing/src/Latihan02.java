import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Latihan02 {

	public static void main(String[] args) {
		 Biodata myBio = new Biodata();
		
		
		myBio.setFullname(JOptionPane.showInputDialog(
				null, 
				"Masukan Nama Lengkap Anda : ",
				"Form Input Nama",
				JOptionPane.QUESTION_MESSAGE
		));
		
		myBio.setAge(Integer.parseInt(JOptionPane.showInputDialog(
				null, 
				"Masukan Umur Anda : ",
				"Form Input Umur",
				JOptionPane.QUESTION_MESSAGE
		)));
		
		myBio.setAlamat(JOptionPane.showInputDialog(
				null, 
				"Masukan Alamat Rumah Anda : ",
				"Form Input Alamat",
				JOptionPane.QUESTION_MESSAGE
		));

		JOptionPane.showMessageDialog(
				null, 
				"Nama Lengkap : " + myBio.getFullname() 
				+ "\nUmur : " + myBio.getAge() + " Tahun " 
				+ "\nAlamat : " + myBio.getAlamat());

	}

}
