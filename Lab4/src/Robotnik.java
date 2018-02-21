
public class Robotnik extends Pracownik{

	private int LPG;			//liczba przepracowanych godzin
	private int limit;
	private int stawka = 20;
	
	public Robotnik (String nazwisko, double etat) {
		
		super(nazwisko, etat);
		
		if 		(etat == 1)							{this.limit = 160;}
		else if (etat >= 0.75 && etat < 1) 			{this.limit = 120;}
		else if (etat >= 0.5 && etat < 0.75) 		{this.limit = 80; }
		else if (etat < 0.5) 						{this.limit = 40; }
		else 										{this.limit = 200;}
	}
	
	public void setLPG (int LPG) {
		this.LPG = LPG;
	}
	
	public int getPlace() {
		
		if (LPG > limit) 			{ return (limit * stawka) + (LPG - limit) * (stawka * 3/2); }
		else 						{ return (LPG * stawka); }
	}
	
	public String toString() {
		return "Robotnik " + super.toString();
	}
}
