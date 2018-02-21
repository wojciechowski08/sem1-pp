package firmaArrayList;

import java.util.*;

public class KadryArrayList {

	ArrayList<Pracownik> kadry= new ArrayList<Pracownik>();
	
	public void wpiszUrzednika(int indeks, String imie, String nazwisko, double czescEtatu, double placaPodstawowa, double premia) {
		
		Pracownik pracownikObiekt = new Urzednik(imie, nazwisko, czescEtatu, placaPodstawowa, premia);
		
		if (!kadry.contains(pracownikObiekt)) {
			kadry.add(pracownikObiekt);
			System.out.println("Zatrudniono Urzednika.");
		}
	}
		
	public void wpiszRobotnika(int indeks, String imie, String nazwisko, double czescEtatu, double iloscGodzin, double stawkaGodzinowa) {
		
		Pracownik pracownikObiekt = new Robotnik(imie, nazwisko, czescEtatu, iloscGodzin, stawkaGodzinowa);
		
		if (!kadry.contains(pracownikObiekt)) {
			kadry.add(pracownikObiekt);
			System.out.println("Zatrudniono Robotnika.");
		}
	}
	
	public void usunPracownika(String imie, String nazwisko) {
		Pracownik pracownikObiekt = new Urzednik(imie, nazwisko, 0.0, 0.0, 0.0);
		
		if (kadry.contains(pracownikObiekt)) {
			System.out.println("Usunieto pracownika: " + pracownikObiekt.imie + " " + pracownikObiekt.nazwisko);
			kadry.remove(kadry.indexOf(pracownikObiekt));
		}
	
	}
	
	//przechodzenie indeksowe
	public int ileUrzednikow() {
		int ile = 0;
		
		for (int i=0; i<kadry.size(); i++) {
			if (kadry.get(i) instanceof Urzednik)
				ile++;
		}
		return ile;
	}
	
	//iterator
	public int ileRobotnikow() {
		
		Iterator <Pracownik> iterator = kadry.iterator();
	
		int ile = 0;
		
		while (iterator.hasNext()) {
			if (iterator.next() instanceof Robotnik)
				ile++;
		}
		
		return ile;
	}
	
	//foreach
	public void wydrukListyUrzednikow() {
		int lp = 0;
		
		System.out.println(System.lineSeparator() + "WYDRUK LISTY URZEDNIKOW" + System.lineSeparator());
		System.out.println("LP\t\tIMIE\t\tNAZWISKO\t\tETAT\t\tGRUPA");
		
		for (Pracownik a: kadry) {
			if(a instanceof Urzednik)
			{
				lp++;
				System.out.println(lp + "\t\t" + a.toString());
			}
		}
	}

	//foreach
	public void wydrukListyRobotnikow() {
		int lp = 0;
		
		System.out.println(System.lineSeparator() + "WYDRUK LISTY ROBOTNIKOW" + System.lineSeparator());
		System.out.println("LP\t\tIMIE\t\tNAZWISKO\t\tETAT\t\tGRUPA");
		
		for (Pracownik a: kadry) {
			if ( a instanceof Robotnik ) {
				lp++;
				System.out.println(lp + "\t\t" + a.toString());
			}
		}
	}
	
	public double sumaWyplatUrzednikow() {
		double suma=0;
		
		for (Pracownik a: kadry) {
			if ( a instanceof Urzednik ) {
				suma+=a.obliczWyplate();
			}
		}
		return suma;
	}
	
	public double sumaWyplatRobotnikow() {
		double suma=0;
		
		for (Pracownik a: kadry) {
			if(a instanceof Robotnik) {
				suma+=a.obliczWyplate();
			}
		}
		return suma;
	}
	
	public void wydrukListyPracownikow() {
		int lp=0;
		System.out.println(System.lineSeparator() + "WYDRUK LISTY PRACOWNIKOW");
		
		System.out.println("LP\t\tIMIE\t\tNAZWISKO\t\tETAT\t\tGRUPA");
		
		for (Pracownik a: kadry) {	
				lp++;
				System.out.println(lp + "\t\t" + a.toString());
		}
	}
	
	public void wydrukListyPlac() {
		int lp=0;
		System.out.println(System.lineSeparator() + "WYDRUK LISTY PLAC");
		System.out.println("LP\t\tIMIE\t\t\\ttNAZWISKO\t\t\tETAT\t\t\tGRUPA\t\t\t\tPLACA");
		
		for (Pracownik a: kadry) {
			lp++;
			System.out.println(lp + "\t\t" + a.toString() + "\t\t" + a.wyplataFormat());
		}
	}
}
