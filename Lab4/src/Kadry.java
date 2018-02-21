
public class Kadry {

private Pracownik[] kadry;
	
	public Kadry(int ilosc) {
		kadry = new Pracownik[ilosc];
	}
	
	public boolean zatrudnijPracownika(Pracownik p) {
		for(int i = 0; i < kadry.length; i++) {
			if (kadry[i] == null) {
				kadry [i] = p;
				return true;
			}
		}
		return false;
	}
	
	public boolean zwolnijPracownika(String nazwisko) {
		for (int i = 0; i < kadry.length; i++) {
			if (kadry[i] != null) {
				if (kadry[i].getNazwisko().equals(nazwisko)) {
					kadry[i] = null;
					return true;
				}
			}
		}
		return false;
	}
	
	public void iluPracownikow() {
		int ilosc = 0;
		int iloscRobotnikow = 0;
		int iloscUrzednikow = 0;
		for (int i = 0; i < kadry.length; i++) {
			if (kadry[i] != null) {
				
				ilosc ++;
				if (kadry[i] instanceof Robotnik) {
					iloscRobotnikow ++;
				}
				if (kadry[i] instanceof Urzednik) {
					iloscUrzednikow ++;
				}
			}
			
		}
		System.out.println("Pracownikow: " + ilosc + "\t Robotnikow: " + iloscRobotnikow + "\t Urzednikow: " + iloscUrzednikow);
	}
	
	public void drukujListePracownikow() {
		int ilosc = 0;
		String grupa = new String();
		for (int i = 0; i < kadry.length; i++) {
			if (kadry[i] != null) {
				ilosc++;
				if (kadry[i] instanceof Robotnik) {
					grupa = "Robotnik";
				} else if (kadry[i] instanceof Urzednik) {
					grupa = "Urzednik";
				}else {
					grupa = "Pracownik";
				}
				System.out.println(ilosc + ". " + kadry[i].getNazwisko() + "\t" + grupa + "\t Etat: " + kadry[i].getEtat());
			}
		}
	}
	
	public void drukujListePlac() {
		int ilosc = 0;
		String grupa = new String();
		for (int i = 0; i < kadry.length; i++) {
			if (kadry[i] != null) {
				ilosc++;
				if (kadry[i] instanceof Robotnik) {
					grupa = "Robotnik";
				} else if (kadry[i] instanceof Urzednik) {
					grupa = "Urzednik";
				}else {
					grupa = "Pracownik";
				}
				System.out.println(ilosc + ". " + kadry[i].getNazwisko() + "\t"
									+ grupa + "\t Etat: "
									+ kadry[i].getEtat() + "\t Placa: " + kadry[i].getPlace());
			}
		}
	}

	public void sumaWyplat() {
		int suma = 0;
		for (int i = 0; i < kadry.length; i++) {
			if (kadry[i] != null) {
				suma += kadry[i].getPlace();
			}
		}
		System.out.println("Suma plac w firmie: " + suma);
	}

	public void drukujRobotnikow() {
		int ilosc = 0;
		for (int i = 0; i < kadry.length; i++) {
			if (kadry[i] != null && kadry[i] instanceof Robotnik) {
				ilosc++;
				System.out.println(ilosc + ". " + kadry[i].getNazwisko() + "\t Etat: " + kadry[i].getEtat());
			}
		}
	}
	
	public void drukujUrzednikow() {
		int ilosc = 0;
		for (int i = 0; i < kadry.length; i++) {
			if (kadry[i] != null && kadry[i] instanceof Urzednik) {
				ilosc++;
				System.out.println(ilosc + ". " + kadry[i].getNazwisko() + "\t Etat: " + kadry[i].getEtat());
			}
		}
	}

}
