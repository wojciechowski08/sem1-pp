
public class Tablica2 {
	
	private int[][] tab;
	
	public Tablica2(int a, int b, int min, int max) {
		
		tab = new int[a][b];
		
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = (int) (Math.random() * (max - min + 1)) + min;
			}
		}
	}
	
	public void wyswietlWierszami() {
		String tekst = new String();
		System.out.println("Wierszami:\n");
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tekst += tab[i][j] + "\t";
			}
			tekst += "\n";
		}
		System.out.println(tekst);
	}
	
	public void wyswietlKolumnami() {
		String tekst = new String();
		System.out.println("Kolumnami:\n");
		for (int i = 0; i < tab[0].length; i++) {
			for (int j = 0; j < tab.length; j++) {
				tekst += tab[j][i] + "\t";
			}
			tekst += "\n";
		}
		System.out.println(tekst);
	}
	
	public void suma() {
		int odp = 0;
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				odp += tab[i][j];
			}
		}
		System.out.println("Suma: "+ odp);
	}
	
	public void skrajne() {
		int maxV = Integer.MIN_VALUE;
		int minV = Integer.MAX_VALUE;
		String maxI = new String();
		String minI = new String();
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (tab[i][j] > maxV) {
					maxV = tab[i][j];
					maxI = "[" + i + "][" + j + "]";
				}
				if (tab[i][j] < minV) {
					minV = tab[i][j];
					minI = "[" + i + "][" + j + "]";
				}
			}
		}
		System.out.println(
				"Maksymalna wartosc: " + maxV + ", indeks: " + maxI +
				"\nMinimalna wartosc: " + minV + ", indeks: " + minI );
	}
	
	public void maxWiersz() {
		int indeks = 0;
		int suma = 0;
		int temp = 0;
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				temp += tab[i][j];
			}
			if (temp >= suma) {
				suma = temp;
				temp = 0;
				indeks = i;
			} else {temp = 0;}
		}
		System.out.println("Najwieksza suma elementow w wierszu: " + suma + " , wiersz: " + indeks + ".");
	}
	
	public String znajdz(int a) {
		String odp = new String();
		odp = "[-1,-1]";
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (a == tab[i][j]) {
					odp = "[" + i + "," + j + "]";
					return odp;
				}
			}
		} return odp;
	}
	
	public static void main(String[] args) {
		Tablica2 tablica1 = new Tablica2(5,8,0,50);
		tablica1.wyswietlWierszami();
		tablica1.wyswietlKolumnami();
		tablica1.suma();
		tablica1.skrajne();
		tablica1.maxWiersz();
		System.out.println(tablica1.znajdz(5));
		System.out.println(tablica1.znajdz(100));
	}
}
