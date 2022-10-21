import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Latihan {

	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		ImageIcon icon = new ImageIcon("C:/Users/User/Downloads/icon2.png");
		ImageIcon icon2 = new ImageIcon("C:/Users/User/Downloads/icon.png");
		
		jop.showMessageDialog(null, "Silahkan Masuk", "masuk",jop.PLAIN_MESSAGE,icon);
		String nama = jop.showInputDialog(null, "Masukan Nama ; ");
		jop.showMessageDialog(null, nama , " nama " , jop.PLAIN_MESSAGE,icon2);
		
		
		int confirm = jop.showConfirmDialog(null, "Apakah Ini  " + nama ,"konfirmasi Pilihan", jop.YES_NO_OPTION);
		if(confirm == 0) {
			jop.showMessageDialog(null, "Ini adalah " + nama, nama, jop.PLAIN_MESSAGE,icon2);
		}else {
			jop.showMessageDialog(null, "Ini bukan " + nama, nama, jop.PLAIN_MESSAGE, icon2);
	
		}
		
		
//		String pilihan = jop.showInputDialog(null, "Masukan Pilihan : ");
//		jop.showMessageDialog(null, pilihan );
//		int confirm = jop.showConfirmDialog(null, "Apakah Pilihan Sudah Benar ?","konfirmasi Pilihan", jop.YES_NO_CANCEL_OPTION);
//		if(confirm == 0) {
//			jop.showMessageDialog(null, "Anda memilih YES");
//		}else if(confirm == 1) {
//			jop.showMessageDialog(null, "Anda memilih NO");
//		}else {
//			jop.showMessageDialog(null, "Anda memilih Cancel");
		}
//		jop.showMessageDialog(null, "ini java swing");
//		jop.showMessageDialog(null, "ini java swing", "swing", jop.INFORMATION_MESSAGE);
//		jop.showMessageDialog(null, "ini java swing", "swing", jop.WARNING_MESSAGE);
//		jop.showMessageDialog(null, "ini java swing", "swing", jop.ERROR_MESSAGE);
//		jop.showMessageDialog(null, "ini java swing", "swing", jop.PLAIN_MESSAGE);
		
//		ImageIcon icon = new ImageIcon("")
//		jop.showMessageDialog(null, "java with icon", "swing icon", jop.Warning_);

	}


