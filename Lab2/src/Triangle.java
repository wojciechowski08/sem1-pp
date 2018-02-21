class Triangle {
	
	private double a;
	private double b;
	private double c;
	
	public Triangle() {
		a = 1.0;
		b = 1.0;
		c = 1.0;
	}
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean isTriangle() {
		if ( a + b > c && a + c > b && c + b > a ) {
			return true;
		} else {
			return false;
		}
	}
	
	public double perimeter() {
		return a + b + c;
	}
	
	public double area() {
		double p = (a + b + c) / 2;
		return Math.sqrt( p*(p-a)*(p-b)*(p-c) );
	}
	
	public void whatKindSides() {
		if ( isTriangle() )	{
			if (a == b && b == c) {
				System.out.println("This triangle is equilateral.");
			} else if ( a == b || b == c || a == c) {
				System.out.println("This triangle is isosceles.");
			} else {
				System.out.println("This triangle is scalene.");
			}
		} else {
			System.out.println("This is not triangle.");
		}
	}
	
	public void whatKindAngles() {
		
		if ( isTriangle() )	{
			
			/*		SINUSY NIE DZIALAJA DLA > 90deg
			// wzor P = 1/2*b*c*sin(alpha) = 1/2*a*c*sin(beta) = 1/2*a*b*sin(gamma)
			double tempArea = area();
			double Alpha = Math.toDegrees(Math.asin(2*tempArea/(b*c)));
			double Beta  = Math.toDegrees(Math.asin(2*tempArea/(a*c)));
			double Gamma = Math.toDegrees(Math.asin(2*tempArea/(a*b)));
			*/
			
			double Alpha = Math.toDegrees(Math.acos( (b*b+c*c-a*a)/(2*b*c) ));
			double Beta  = Math.toDegrees(Math.acos( (a*a+c*c-b*b)/(2*a*c) ));
			double Gamma = Math.toDegrees(Math.acos( (a*a+b*b-c*c)/(2*a*b) ));
			
			if (Alpha == 90.0 || Beta == 90.0 || Gamma == 90.0) {
				System.out.println("This triangle is right.");
			} else if (Alpha > 90.0 || Beta > 90.0 || Gamma > 90.0) {
				System.out.println("This triangle is angled.");
			} else {
				System.out.println("This triangle is chevron.");
			}
		} else {
			System.out.println("This is not triangle.");
		}
	}	

	
	
	
	
	
	public static void main(String[] args) {
		Triangle trojkat1 = new Triangle(0,0,0);
		System.out.println(
				trojkat1.isTriangle() + "\n" +
				trojkat1.perimeter() + "\n" +
				trojkat1.area() + "\n" );
		trojkat1.whatKindSides();
		trojkat1.whatKindAngles();
		
		System.out.println("-------------------------------------\n\n");
		
		Triangle trojkat2 = new Triangle(1,1,1);
		System.out.println(
				trojkat2.isTriangle() + "\n" +
				trojkat2.perimeter() + "\n" +
				trojkat2.area() + "\n" );
		trojkat2.whatKindSides();
		trojkat2.whatKindAngles();
		
		System.out.println("-------------------------------------\n\n");
		
		Triangle trojkat3 = new Triangle(3,4,5);
		System.out.println(
				trojkat3.isTriangle() + "\n" +
				trojkat3.perimeter() + "\n" +
				trojkat3.area() + "\n" );
		trojkat3.whatKindSides();
		trojkat3.whatKindAngles();
		
		System.out.println("-------------------------------------\n\n");
		
		Triangle trojkat4 = new Triangle(1,1,10);
		System.out.println(
				trojkat4.isTriangle() + "\n" +
				trojkat4.perimeter() + "\n" +
				trojkat4.area() + "\n" );
		trojkat4.whatKindSides();
		trojkat4.whatKindAngles();
		
		System.out.println("-------------------------------------\n\n");
		
		Triangle trojkat5 = new Triangle(5,5,9.5);
		System.out.println(
				trojkat5.isTriangle() + "\n" +
				trojkat5.perimeter() + "\n" +
				trojkat5.area() + "\n" );
		trojkat5.whatKindSides();
		trojkat5.whatKindAngles();
		
		System.out.println("-------------------------------------\n\n");
		
	}

}

