import  java.util.Scanner;
public class Latihan03 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Menu Sarapan");
		System.out.println("1. Nasi Goreng");
		System.out.println("2. Bubur Ayam");
		System.out.println("3. Soto Ayam");
		System.out.print("Pilihlah Menu Diatas : ");
		int pilihan = input.nextInt();
		
		switch (pilihan) {
		case 1 : 
			System.out.println("Anda Memesan Nasi Goreng Dengan Harga Rp22.000 ");
			break;
		case 2: 
			System.out.println("Anda Memesan Bubur Ayam Dengan Harga Rp15.000");
			break;
		case 3 :
			System.out.println("Anda Memesan Soto Ayam Dengan Harga Rp25.000");
		default:
			System.out.println("Maaf Menu Yang Anda Masukan Tidak Tersedia / Salah");
		}
	}

}
