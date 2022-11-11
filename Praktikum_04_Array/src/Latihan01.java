import javax.swing.JOptionPane;
public class Latihan01 {
//tipedata[] namaArray = new tipeData[panjang array]
	//int [] angka = new int [3]
	//int [] angka = [0,1,2];
	// 0 1 2
	public static void main(String[] args) {
		int i = Integer.parseInt(JOptionPane.showInputDialog(null, " Masukan Panjang Angka : ","Masuk", JOptionPane.QUESTION_MESSAGE));
		int array[] = new int[i];
		
		for(int x= 0; x<array.length; x++) {
			array[x] = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Angka : ", "Input", JOptionPane.QUESTION_MESSAGE));
		}
		
		String output = "";
		for(int x = 0; x<array.length; x++) {
			output += " Array ke - " + x + "="+ array[x]+"\n";
		}
		
		JOptionPane.showMessageDialog(null, output);
		
		
		
//		int [] angka = new int[3];
//		angka[0] = 3;
//		angka[1] = 4;
//		angka[2] = 5;
//		
//		String output = "";
//		
//		
//		for(int i = 0; i<3; i++) {
//			output += ("\n index ke - " + i +" adalah "+angka[i]);
//		}
//		
//		JOptionPane.showMessageDialog(null, output, " Hasil Benar", JOptionPane.PLAIN_MESSAGE);
//		System.out.println(angka[0]);
//		System.out.println(angka[1]);
//		System.out.println(angka[2]);
//		
//		System.out.println(" with loop = ");
//		for(int i = 0; i<3; i++) {
//			System.out.println("index ke - " + i+" adalah"+angka[i]);
//		}
//		
//		System.out.println(" ==foreach==");
//		//for (int value : dataArray)
//		for (int value : angka) {
//			System.out.println(value);
//		}
	}

}
