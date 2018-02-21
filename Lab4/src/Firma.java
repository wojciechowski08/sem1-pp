
public class Firma {

public static void main(String[] args) {
		
		Urzednik u1 = new Urzednik("Korman", 1.0, 0.1);
		Urzednik u2 = new Urzednik("Gudel", 0.5, 0.2);
		Urzednik u3 = new Urzednik("Dudek", 1.25, 0.3);
		Urzednik u4 = new Urzednik("Nowak", 0.75, 0.5);
		Robotnik r1 = new Robotnik("Kowalski", 1.0);
		Robotnik r2 = new Robotnik("Makowski", 0.5);
		Robotnik r3 = new Robotnik("Tulipan", 1.25);
		Robotnik r4 = new Robotnik("Drewno", 0.75);
		r1.setLPG(160);
		r2.setLPG(100);
		r3.setLPG(185);
		r4.setLPG(140);
		
		Kadry k = new Kadry(10);
		
		k.zatrudnijPracownika(u1);
		k.zatrudnijPracownika(u2);
		k.zatrudnijPracownika(u3);
		k.zatrudnijPracownika(u4);
		k.zatrudnijPracownika(r1);
		k.zatrudnijPracownika(r2);
		k.zatrudnijPracownika(r3);
		k.zatrudnijPracownika(r4);
		
		k.iluPracownikow();
		System.out.println("------------------------------------");
		k.drukujListePracownikow();
		System.out.println("------------------------------------");
		k.drukujListePlac();
		System.out.println("------------------------------------");
		k.sumaWyplat();
		System.out.println("------------------------------------");
		k.zwolnijPracownika("Gudel");
		k.zwolnijPracownika("Tulipan");
		k.drukujRobotnikow();
		System.out.println("------------------------------------");
		k.drukujUrzednikow();
		System.out.println("------------------------------------");
		
		
	}
	
}
