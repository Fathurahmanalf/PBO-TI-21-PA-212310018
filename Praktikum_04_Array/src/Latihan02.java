import javax.swing.JOptionPane;
public class Latihan02 {

	public static void main(String[] args) {
		int [] angka = new int[3];
		angka[0] = 3;
		angka[1] = 4;
		angka[2] = 5;
		
		
		System.out.println("with loop = ");
		for(int i = 0; i<3; i++) {
			System.out.println("index ke - " + i +" adalah"+angka[i]);
		}

	}

}
