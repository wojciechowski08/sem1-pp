package firmaArrayList;

public abstract class Pracownik {

	protected String imie;
	protected String nazwisko;
	protected double czescEtatu;
	protected double pensja;
	
	public Pracownik() {
		this.imie = "Robert";
		this.nazwisko = "Lewandowski";
		this.czescEtatu = 1.0;
		this.pensja = 2000;
	}

	public Pracownik(String imie, String nazwisko, double czescEtatu) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.czescEtatu = czescEtatu;
	}
	
	public String getImie() 			{ return imie; }
	public String getNazwisko() 		{ return nazwisko; }
	public String getImieNazwisko() 	{ return imie + " " + nazwisko; }
	public double getCzescEtatu() 		{ return czescEtatu; }
	public double getPensja() 			{ return pensja; }
	
	public void setImie(String imie) 				{ this.imie = imie; }
	public void setNazwisko(String nazwisko) 		{ this.nazwisko = nazwisko; }
	public void setCzescEtatu(double czescEtatu) 	{ this.czescEtatu = czescEtatu; }
	public void setPensja(double pensja) 			{ this.pensja = pensja; }
	
	
	public abstract double obliczWyplate();
	
	public abstract String wyplataFormat();
	
	@Override
	public String toString() {
		return this.imie + "\t\t" + this.nazwisko + "\t\t" + this.czescEtatu;
	}

	@Override
	public boolean equals(Object pracownik) {
		Pracownik pracownik1 = (Pracownik) pracownik;
		return this.imie.equals(pracownik1.imie) && this.nazwisko.equals(pracownik1.nazwisko);
	}
}
