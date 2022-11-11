import javax.swing.JOptionPane;

public class LatihanArray {
// { 1,2}
// { 3,4}
	public static void main(String[] args) {
		int k = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan Baris","Form Input",JOptionPane.QUESTION_MESSAGE));
		int j = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan Kolom","Form Input",JOptionPane.QUESTION_MESSAGE));
		int a[][] = new int[k][j];
		JOptionPane input = new JOptionPane();
	
		
		
		for (int i = 0; i < a.length ; i++) {
			for(int x = 0 ; x < a.length ; x++) {
				a[i][x] = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Angka : ", "Input", JOptionPane.QUESTION_MESSAGE));
			}
		}
		
		String output = "";
		for(int y = 0; y<a.length; y++) {
			for (int z = 0; z < a.length; z++) {
				output += " Baris ke - " + y + "Kolom ke - "+ z + " = "+ a[y][z]+"\n";
			}
			
		}
		JOptionPane.showMessageDialog(null,output);
		
	}

//		int b [][] = new int [2][2];
//		
//		b[0][0] = 1;
//		b[0][1] = 2;
//		
//		b[1][0]=3;
//		b[1][1]=4;
//		
//		System.out.println(b[0][0]);
//		System.out.println(b[0][1]);
//		System.out.println(b[1][0]);
//		System.out.println(b[1][1]);
//		
//		System.out.println(" == with loop ==");
//		for (int i = 0; i<2; i ++) {
//			for (int j = 0; j<2; j++) {
//				System.out.println(b[i][j]);
}
		
				
//		int a[][] = {
//				{1,2,3,4},
//				{5,6,7,8},
//		};
//		
//		for(int i =0; i<2; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.println(a[i][j]);
//			}
//		}
		
		
	

