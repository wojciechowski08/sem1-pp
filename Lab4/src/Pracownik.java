
abstract class Pracownik {
	
	private String nazwisko;
	private double etat;
	abstract int getPlace();
		
	public Pracownik(String nazwisko, double etat) {
		this.nazwisko = nazwisko;
		this.etat = etat;
	}
	
	public String getNazwisko() {
		return this.nazwisko;
	}
	
	public double getEtat() {
		return this.etat;
	}
	
	public String toString() {
		return "Pracownik: " + nazwisko;
	}
	

}

