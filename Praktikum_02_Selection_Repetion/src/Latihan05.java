import java.util.Scanner;
public class Latihan05 {

	public static void main(String[] args) {
		//deklarasi variabel
		
		Scanner input = new Scanner (System.in);
		System.out.print("Masukan Jumlah Baris : ");
		int k = input.nextInt();

		int n = 7;
		for(int i = 1; i<n; i++) {
			for(int j = i; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j =1; j<i; j++) {
				if(j==1)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			}
		  
		for(int i = 1; i<n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j =i; j<n; j++) {
				if(j==i)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j = i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
			}
		
		
		  
			
		} 
		
	
	
} 

		
	


