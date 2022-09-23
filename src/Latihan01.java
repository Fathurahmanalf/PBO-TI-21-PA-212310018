
public class Latihan01 {

	public static void main(String[] args) {
		int c, r, k;
		 c = 90;
		
		
		
		CelciusToFahrenheit();
		r = CelciusToReamur();
		k = CelciusToKelvin(c);
		System.out.println("Convert Celcius To Reamur");
		System.out.println("r = " + r);
		System.out.println("Convert Celcius To Kelvin");
		System.out.println("k = " + k);
	}
	
	static void CelciusToFahrenheit() {
		int c = 90;
		int f = (9/5 * c) + 32;
		System.out.println("Convert Celcius To Fahrenheint");
		System.out.println("c = " + c);
		System.out.println("f = " + f);
	}
	
	static int CelciusToReamur() {
		int c = 90;
		int r = (5/4 * c);
		return r;
	}
	
	static int CelciusToKelvin(int c) {
		int k = (c + 273);
		return k;
	}

}
