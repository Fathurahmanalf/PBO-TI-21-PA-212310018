import javax.print.ServiceUIFactory;
import java.util.Scanner;
public class Latihan01 {

	public static void main(String[] args) {
		// if
		
		int nilai = 10;
		System.out.println("Nilai = " + nilai);
		
		if (nilai ==5) {
			System.out.println("Ini adalah " + nilai);
		}
		else {
			System.out.println("Program berakhir");
		}
		
		
		//else if else
		
		int b = 20;
		if (b == 7) {
			System.out.println(" Ini adalah " +b);
		}
		else if (b == 9) {
		System.out.println("ini adalah " +b);
		}
		else if (b == 20) {
		System.out.println("Ini adalah " +b);
		}
		else {
		System.out.println("Program end");
		}
		
		
		//switch case
		int input;
		Scanner inputuser = new Scanner (System.in);
		System.out.println("Menu : ");
		System.out.println("1. Fathur");
		System.out.println("2. AlFaridzi");
		System.out.println("3. Facthur");
		System.out.println("Masukan Menu : ");
		input = inputuser.nextInt();
		
		switch(input) {
		case 1: 
			System.out.println("Saya Adalah Fathur ");
			break;
			
		case 2:
			System.out.println("Kamu Adalah AlFaridzi");
			break;
			
		case 3:
			System.out.println("Saya Adalah Facthur");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	   
	
		
}
