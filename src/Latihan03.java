
public class Latihan03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1 = 12;
		double d2 = 15;	
		
		double luasLayang = Luas(d1, d2);
		double kelilingLayang = Keliling(d1, d2);
		
		System.out.println("Keliling layang-layang = " + kelilingLayang);
		System.out.println("Luas layang-layang = " + luasLayang);
		
		prisma();
	}
	
	static double Luas(double d1, double d2) {
		double luas = 0.5 * (d1 * d2);
		double luasTotal = 4 * luas;
		return luasTotal;
	}
	
	static double Keliling(double val1, double val2) {
		double keliling = 2 * (val1 + val2);
		return keliling;
	}
	
	static void prisma() {
		int L;
		int la = 8;
		int t = 2;
		int a1 = 2;
		int a2 =3;
		int a3= 2;
		
		int V;
		int a = 6;
		int tp = 2;
		
		
		System.out.println("Luas Prisma Segitiga");
		L = t*(a1+a2+a3) + (2*la);
		System.out.println("Luas Prisma Segitiga adalah= "+L);
	
	    System.out.println("Volume Prisma");
	    V = (a*t/2) *tp;
	    System.out.println("Volumenya = "+V);
	}
	

}
