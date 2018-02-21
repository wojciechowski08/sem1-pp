package firmaTreeSet;

public class Firma {

public static void main(String[] args) {
		
		KadryTreeSet firmaT = new KadryTreeSet();
		
		System.out.println("TREESET\n");
		
		//1
		firmaT.wpiszUrzednika(0, "Daniel", "Worciechowski", 1.0, 2200.0, 10.0);
		firmaT.wpiszUrzednika(1, "Lukasz", "Kardynal", 1.0, 2300.0, 5.0);
		firmaT.wpiszRobotnika(2, "Ziemow", "Szczypins", 1.0, 260.0, 15.0);
		firmaT.wpiszRobotnika(3, "Jan", "Kowalski", 2.0, 260.0, 15.0);
		firmaT.wpiszRobotnika(4, "Kamil", "Losowyyy", 1.0, 180.0, 12.0);
		
		
		//2
		firmaT.usunPracownika("Kamil", "Trelowski");
		
		
		//3
		System.out.println("\nIlosc zatrudnionych Urzednikow: " + firmaT.ileUrzednikow());
		System.out.println("Ilosc zatrudnionych Robotnikow: " + firmaT.ileRobotnikow()+ System.lineSeparator());
		
		
		//4
		firmaT.wydrukListyUrzednikow();
		firmaT.wydrukListyRobotnikow();
		
		
		//5
		System.out.println("\nSuma plac zatrudnionych Urzednikow: " + String.format("%.2f", firmaT.sumaWyplatUrzednikow()));
		System.out.println("Suma plac zatrudnionych Robotnikow: " + String.format("%.2f", firmaT.sumaWyplatRobotnikow()));
		
		
		//6
		firmaT.wydrukListyPracownikow();
		
		
		//7
		firmaT.wydrukListyPlac();
	}
	
}
