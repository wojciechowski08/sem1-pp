package firma;

public class Robotnik extends Pracownik {

	private double iloscGodzin;
	private double stawkaGodzinowa;
	private static final double LIMIT = 180;
	
	public Robotnik() {
		super();
		this.iloscGodzin = 160;
		this.stawkaGodzinowa = 15;
	}
	
	public Robotnik (String imie, String nazwisko, double czescEtatu, double iloscGodzin, double stawkaGodzinowa) {
		super (imie, nazwisko, czescEtatu);
		this.iloscGodzin = iloscGodzin;
		this.stawkaGodzinowa = stawkaGodzinowa;
		System.out.println("Nowy Robotnik zatrudniony.");
	}
	
	public double getIloscGodzin() { return iloscGodzin; }
	public double getStawkaGodzinowa() { return stawkaGodzinowa; }
	
	public void setIloscGodzin(double iloscGodzin) { this.iloscGodzin = iloscGodzin; }
	public void setStawkaGodzinowa(double stawkaGodzinowa) { this.stawkaGodzinowa = stawkaGodzinowa; }

	@Override
	public double obliczWyplate() {
		if ( this.iloscGodzin <= (LIMIT*czescEtatu) ) {
			return (this.iloscGodzin*this.stawkaGodzinowa);
		} else {
			return (LIMIT*czescEtatu*this.stawkaGodzinowa+(this.iloscGodzin-(LIMIT*czescEtatu))*this.stawkaGodzinowa*1.5);
		}
	}
	
	@Override
	public String wyplataFormat() {
		return String.format("%.2f", obliczWyplate());
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t\tRobotnik";
	}
}
