public class Tablica {
	
	private int[] tab;
	
	public Tablica(int a) {
		this.tab = new int[a];
	}
	
	public void wypelnijLosowo(int min, int max) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] = (int) (Math.random() * (max - min + 1)) + min;
		}
	}
	
	public void wyswietl() {
		String tablica = new String();
		for (int i = 0; i < tab.length; i++) {
			tablica += tab[i] + "  " ;
		}
		System.out.println(tablica);								/////////////////////
	}
	
	public int szukaj(int a) {
		for (int i =0; i < tab.length; i++) {
			if (tab[i] == a) {
				return i;
			}
		} return -1;
	}
	
	public void skrajne() {
		int maxV = Integer.MIN_VALUE;
		int minV = Integer.MAX_VALUE;
		int maxI = 0;
		int minI = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > maxV) {
				maxV = tab[i];
				maxI = i;
			}
			if (tab[i] < minV) {
				minV = tab[i];
				minI = i;
			}
		}
		System.out.println(
				"Maksymalna wartosc: " + maxV + ", indeks: " + maxI +
				"\nMinimalna wartosc: " + minV + ", indeks: " + minI );
	}
	
	public boolean czyRoznowartosciowa() {
		boolean odp = false;
		for (int i = 0; i < tab.length; i++) {
			for (int j = i+1; j < tab.length; j++) {
				if (tab[i] != tab[j]) {
					odp = true;
				} else {
					odp = false;
					return odp;
				}
			}
		} return odp;
	}
	
	public void zrobRoznowartosiowa() {

		int temp;
		int ilosc = 0;
		boolean isDuplicate;
		for (int i = 0; i < tab.length; i++) {
			temp = tab[i];
			isDuplicate = false;
			for (int j = i+1 ; j < tab.length; j++) {
				if (temp == tab[j]) {
					isDuplicate = true; break;
				}
			}
			if (!isDuplicate) {
				ilosc++;
			}
		}
		
		int tempIndeks = ilosc-1;
		int[] newT = new int[ilosc];
		for (int i = tab.length-1; i >= 0; i--) {
			temp = tab[i];
			isDuplicate = false;
			for (int j = i-1 ; j >= 0; j--) {
				if (temp == tab[j]) {
					isDuplicate = true; break;
				}
			}
			if (!isDuplicate) {
				newT[tempIndeks] = tab[i];
				tempIndeks--;
			}
		}
		tab = newT;
	}
	
	public static void main(String[] args) {
		
		Tablica tablica1 = new Tablica(20);
		tablica1.wypelnijLosowo(0, 15);
		tablica1.wyswietl();
		System.out.println(tablica1.czyRoznowartosciowa());
		tablica1.wyswietl();
		System.out.println(tablica1.szukaj(10));
		System.out.println(tablica1.szukaj(20));
		tablica1.skrajne();
		tablica1.zrobRoznowartosiowa();
		tablica1.wyswietl();
		System.out.println(tablica1.czyRoznowartosciowa());
		
	}
}
