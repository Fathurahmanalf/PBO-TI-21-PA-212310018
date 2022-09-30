import java.util.Scanner;
public class Latihan02 {

	public static void main(String[] args) {
		int npm;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Masukan NPM Anda : ");
		npm = input.nextInt();
		
		if (npm %2 == 1) {
			System.out.println("Termasuk Bilangan Prima");
		}else {
			System.out.println("Bukan Termasuk Bilangan Prima");
		}

	}

}
