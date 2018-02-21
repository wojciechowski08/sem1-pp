package firma;

public class Kadry {

	Pracownik kadry[];
	int liczbaPracownikow;	
	
	public Kadry () {
		this.liczbaPracownikow = 100;
		kadry = new Pracownik[liczbaPracownikow];
	}
	
	public Kadry (int liczbaPracownikow) {
		this.liczbaPracownikow = liczbaPracownikow;
		kadry = new Pracownik[liczbaPracownikow];
	}
	

	//METODY
	public void wpiszUrzednika(int indeks, String imie, String nazwisko, double czescEtatu, double placaPodstawowa, double premia) {
		for (int i = 0; i<liczbaPracownikow; i++) {
			if (kadry[i]!=null && kadry[i].getNazwisko().equals(nazwisko) && kadry[i].getImie().equals(imie)) {
				System.out.println("Pracownik o takim nazwisku istnieje - NIE ZATRUDNIONO");
				break;
			} else {
				kadry[indeks] = new Urzednik(imie, nazwisko, czescEtatu, placaPodstawowa, premia);
				break;
			}
		}
	}
	
	public void wpiszRobotnika(int indeks, String imie, String nazwisko, double czescEtatu, double iloscGodzin, double stawkaGodzinowa) {
		for (int i = 0; i<liczbaPracownikow; i++) {
			if (kadry[i]!=null && kadry[i].getNazwisko().equals(nazwisko) && kadry[i].getImie().equals(imie))
				;
			else {
				kadry[indeks] = new Robotnik(imie, nazwisko, czescEtatu, iloscGodzin, stawkaGodzinowa);
				break;
			}
		}
	}
	
	public void usunPracownika(String imie, String nazwisko) {
		for (int i=0; i<liczbaPracownikow; i++) {
			try {
				if (kadry[i].nazwisko.equals(nazwisko) && kadry[i].imie.equals(imie)) {
					System.out.println(System.lineSeparator() + kadry[i].getClass().getSimpleName() + " " + imie + " " + nazwisko + " usuniety.");
					kadry[i] = null;
					break;
				}
			} catch (NullPointerException e) {
				;
			}
		}
	}
	
	public int ileUrzednikow() {
		int ile = 0;
		
		for (int i=0; i<liczbaPracownikow; i++) {
			try {
				if (kadry[i]!=null && kadry[i] instanceof Urzednik)
					ile++;
			} catch (NullPointerException e) {
				;
			}
		}
		return ile;
	}
	
	public int ileRobotnikow() {
		int ile = 0;
		
		for (int i=0; i<liczbaPracownikow; i++) {
			try {
				if (kadry[i]!=null && kadry[i] instanceof Robotnik)
					ile++;
			}
			catch (NullPointerException e) {
				;
			}
		}
		return ile;
	}

	public void wydrukListyUrzednikow() {
		int lp=0;
		System.out.println(System.lineSeparator() + "WYDRUK LISTY URZEDNIKOW");
		
		System.out.println("LP\t\tIMIE\t\tNAZWISKO\t\tETAT\t\tGRUPA");
		
		for (int i=0; i<liczbaPracownikow; i++) {
			if (kadry[i]!=null && kadry[i] instanceof Urzednik) {
				try {	
					lp++;
					System.out.println(lp + "\t\t" + kadry[i].toString());
				}
				catch (NullPointerException e) {
					;
				}
			}
		}
	}
	
	public void wydrukListyRobotnikow() {
		int lp=0;
		
		System.out.println(System.lineSeparator() + "WYDRUK LISTY ROBOTNIKOW");
		System.out.println("LP\t\tIMIE\t\tNAZWISKO\t\tETAT\t\tGRUPA");
		for (int i=0; i<liczbaPracownikow; i++) {
			if (kadry[i]!=null && kadry[i] instanceof Robotnik) {
				try {	
					lp++;
					System.out.println(lp + "\t\t" + kadry[i].toString());
				} catch (NullPointerException e) {
					;
				}
			}
		}
	}
	
	public double sumaWyplatUrzednikow() {
		double suma=0;
		
		for (int i=0; i<liczbaPracownikow; i++) {
			try {
				if (kadry[i] instanceof Urzednik) {
					suma+=kadry[i].obliczWyplate();
				}
			}
			catch (NullPointerException e) {
				;
			}
		}
		
		return suma;
	}
	
	public double sumaWyplatRobotnikow() {
		double suma=0;
		
		for (int i=0; i<liczbaPracownikow; i++) {
			try {
				if (kadry[i] instanceof Robotnik) {
					suma+=kadry[i].obliczWyplate();
				}
			} catch (NullPointerException e) {
				;
			}
		}
		
		return suma;
	}
	
	public void wydrukListyPracownikow() {
		int lp=0;
		System.out.println(System.lineSeparator() + "WYDRUK LISTY PRACOWNIKOW");
		
		System.out.println("LP\t\tIMIE\t\tNAZWISKO\t\tETAT\t\tGRUPA");
		for (int i=0; i<liczbaPracownikow; i++) {
			if (kadry[i]!=null) {
				try {	
					lp++;
					System.out.println(lp + "\t\t" + kadry[i].toString());
				} catch (NullPointerException e) {
					;
				}
			}
		}
	}

	public void wydrukListyPlac() {
		int lp=0;
		System.out.println(System.lineSeparator() + "WYDRUK LISTY PLAC");
		System.out.println("LP\t\tIMIE\t\tNAZWISKO\t\tETAT\t\tGRUPA\t\t\tPLACA");
		for (int i=0; i<liczbaPracownikow; i++) {
			if (kadry[i]!=null) {
				try  {
					lp++;
					System.out.println(lp + "\t\t" + kadry[i].toString() + "\t\t" + kadry[i].wyplataFormat());
				} catch (NullPointerException e) {
					;
				}
			}
		}
	}
	
}
