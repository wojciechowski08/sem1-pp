package test;
public class Obliczenia {
	public static void main(String[] args) {
//		Rownanie(0,0,0);
//		System.out.println(nwd(100, 75));
//		System.out.println(eToXth(2,3));
//		System.out.println(howManyDigits(1000004076673765l));
//		System.out.println(howManyImportantDigits(100000407600000l));
//		System.out.println(sinus(2d, 0.1));
//		System.out.println(factorial(0));
		
	}
	
	public static void Rownanie(double a, double b, double c) {
		
		double Final0;
		double Final1;
		double Final2;
		double delta = b*b - 4*a*c;
		String message = new String();
		
		if (a==0&&b==0&&c==0) {
			message = "Nieskonczona ilosc rozwiazan";
		} else if (a==0&&b==0&&c!=0) {
			message = "Brak rozwiazan";
		} else if (a==0) {
			Final0 = (-c)*(1/b);
		} else {
			if (delta == 0) {
				Final0 = (-b)/(2d*a);
				message = "Rozwiazanie: " + Final0;
			} else if (delta > 0 ) {
				Final1 = (-b-Math.sqrt(delta))/(2d*a);
				Final2 = (-b+Math.sqrt(delta))/(2d*a);
				message = "Rozwiazania: " + Final1 + ", " + Final2;
			} else {
				message = "Brak rozwiazan";
			}
		}
		System.out.println(message);
	}
	
	public static int nwd(int a, int b) {
		while (a!=b) {
			if (a>b) {
				a -= b;
			} else {
				b -= a;
			}
		} return a;
	}
	
	public static double eToXth(double x, int n) {
		
		double suma = 1d;
		double Licz = 1d;
		double Mian = 1d;
		short k = 1;
		
		while (k <= n) {
			Licz *= x;
			Mian *= k;
			suma += Licz/Mian;
			k++;
		} return suma;
	}

	public static short howManyDigits(long n) {
		
		long k = 10;
		short d = 1;
		while (!(n < k)) {
			k *= 10;
			d++;
		} return d;
	}

	public static short howManyImportantDigits(long n) {
		if (n == 0) {
			return 1;
		} else {
			while (n%10 == 0) { n /= 10; }
			short d = 0;
			while (n > 0) {
				n /= 10;
				d++;
			} return d;
		}
	}

	public static double sinus(double x, double epsilon) {
		
		short k = 0;
		double l = x;
		double m = 1;
		double s = 0;
		double d = l/m;
		
		s += d;
		while (d >= epsilon) {
			l = l*x*x*(-1);
			m = m*(2*k)*(2*k+1);
			d = l/m;
			s += d;
		} return s;
	}

	public static long factorial(long n) {
		 if (n == 0 && n == 1) {
			long x = 1;
			return x;
		} else {
			return n*factorial(n-1);
		}
	}
}
