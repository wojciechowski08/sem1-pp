package firma;

public class Urzednik extends Pracownik {

	private double placaPodstawowa;
	private double premia;
	
	public Urzednik() {
		super();
		this.placaPodstawowa = 2000;
		this.premia = 10;
	}
	
	public Urzednik(String imie, String nazwisko, double czescEtatu, double placaPodstawowa, double premia) {
		super (imie, nazwisko, czescEtatu);
		this.placaPodstawowa = placaPodstawowa;
		this.premia = premia;
		System.out.println("Nowy Urzednik zatrudniony.");
	}	

	public double getPlacaPodstawowa() 			{ return placaPodstawowa; }
	public double getPremia() 					{ return premia; }
	
	public void setPlacaPodstawowa(double placaPodstawowa) 		{ this.placaPodstawowa = placaPodstawowa; }
	public void setPremia(double premia) 						{ this.premia = premia; }

	@Override
	public double obliczWyplate() {
		return (this.czescEtatu*this.placaPodstawowa*(100+this.premia)/100);
	}
	
	@Override
	public String wyplataFormat() {
		return String.format("%.2f", obliczWyplate());
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t\tUrzednik";
	}
	
}
