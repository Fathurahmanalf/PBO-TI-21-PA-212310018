import javax.swing.JOptionPane;

public class Latihan03 {

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
		JOptionPane.showMessageDialog(null, output);
		}

	}


