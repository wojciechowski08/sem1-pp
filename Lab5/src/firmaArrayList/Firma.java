package firmaArrayList;

public class Firma {

	public static void main(String[] args) {
		
		KadryArrayList firmaA = new KadryArrayList();
		
		System.out.println("ARRAYLISTA\n");
		
		//1
		firmaA.wpiszUrzednika(0, "Daniel", "Worciechowski", 1.0, 2200.0, 10.0);
		firmaA.wpiszUrzednika(1, "Lukasz", "Kardynal", 1.0, 2300.0, 5.0);
		firmaA.wpiszRobotnika(2, "Ziemowit", "Szczypinski", 1.0, 260.0, 15.0);
		firmaA.wpiszRobotnika(3, "Jan", "Kowalski", 2.0, 260.0, 15.0);
		firmaA.wpiszRobotnika(4, "Kamil", "Los", 1.0, 180.0, 12.0);
		
		
		//2
		firmaA.usunPracownika("Kamil", "Trelowski");
		
		
		//3
		System.out.println("\nIlosc zatrudnionych Urzednikow: " + firmaA.ileUrzednikow());
		System.out.println("Ilosc zatrudnionych Robotnikow: " + firmaA.ileRobotnikow()+ System.lineSeparator());
		
		
		//4
		firmaA.wydrukListyUrzednikow();
		firmaA.wydrukListyRobotnikow();
		
		
		//5
		System.out.println("\nSuma plac zatrudnionych Urzednikow: " + String.format("%.2f", firmaA.sumaWyplatUrzednikow()));
		System.out.println("Suma plac zatrudnionych Robotnikow: " + String.format("%.2f", firmaA.sumaWyplatRobotnikow()));
		
		
		//6
		firmaA.wydrukListyPracownikow();
		
		
		//7
		firmaA.wydrukListyPlac();
	}
	
}
