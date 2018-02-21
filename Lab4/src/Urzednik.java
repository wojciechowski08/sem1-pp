
public class Urzednik extends Pracownik{

	private double premia;
	private int placaPodstawowa;
	
	public Urzednik (String nazwisko, double etat, double premia) {
		
		super(nazwisko, etat);
		this.premia = premia;
		
		if 		(etat == 1)							{this.placaPodstawowa = 5000; }
		else if (etat >= 0.75 && etat < 1) 			{this.placaPodstawowa = 3750; }
		else if (etat >= 0.5 && etat < 0.75) 		{this.placaPodstawowa = 2500; }
		else if (etat < 0.5) 						{this.placaPodstawowa = 1500; }
		else 										{this.placaPodstawowa = 5500; }
	}
	
	public int getPlace() {
		return (int)( placaPodstawowa + placaPodstawowa * premia );
	}
	
	public String toString() {
		return "Urzednik: " + super.toString();
	}

	
}
