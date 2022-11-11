import javax.swing.JOptionPane;

public class Latihan04 {

	public static void main(String[] args) {
		int k = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan jumlah array","Form Input",JOptionPane.QUESTION_MESSAGE));
		int a[]= new int[k];
	
		
		for (int i = 0; i < a.length ; i++) {
				a[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Angka : ", "Input", JOptionPane.QUESTION_MESSAGE));
		}
		String output = "";
		for (int i = 0; i < a.length ; i++) {
			output += "x[" + i +"] = "+a[i]+"\n";
		}
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		int min=a[0];
		for(int i=0;i<a.length; i++) {
			if(a[i] < min) {
				min = a[i];
		
			}
		}
	
		JOptionPane.showMessageDialog(null, output + "Angka terbesar adalah "+max+"\n"+"Angka Terkecil adalah "+min);
	}
	
}

