package firma;

public class Firma {
	
public static void main(String[] args) {
		
		Kadry firma1 = new Kadry(5);
		
		System.out.println("TABLICA\n");

		firma1.wpiszUrzednika(0, "Daniel", "Worciechowski", 1.0, 2200.0, 10.0);
		firma1.wpiszUrzednika(1, "Lukasz", "Kardynal", 1.0, 2300.0, 5.0);
		firma1.wpiszRobotnika(2, "Lukasz", "Kardynal", 1.0, 260.0, 15.0);
		firma1.wpiszRobotnika(3, "Jan", "Kowalski", 2.0, 260.0, 15.0);
		firma1.wpiszRobotnika(4, "Kamil", "Lasockiicwsa", 1.0, 180.0, 12.0);

		firma1.usunPracownika("Kamil", "Trelowski");

		System.out.println("\nIlosc zatrudnionych Urzednikow: " + firma1.ileUrzednikow());
		System.out.println("Ilosc zatrudnionych Robotnikow: " + firma1.ileRobotnikow() + System.lineSeparator());

		firma1.wydrukListyUrzednikow();
		firma1.wydrukListyRobotnikow();
		
		System.out.println("\nSuma plac zatrudnionych Urzednikow: " + String.format("%.2f", firma1.sumaWyplatUrzednikow()));
		System.out.println("Suma plac zatrudnionych Robotnikow: " + String.format("%.2f", firma1.sumaWyplatRobotnikow()));

		firma1.wydrukListyPracownikow();
		
		firma1.wydrukListyPlac();
	}
	
}
