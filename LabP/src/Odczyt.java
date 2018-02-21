import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Odczyt {
	
	public Odczyt() {
		
	}
	
	public boolean wczytajIloscZPliku(String nPliku) {
		try {
			BufferedReader read = new BufferedReader(new FileReader(new File(nPliku)));
			String linia = null;
			int psy = 0;
			int koty = 0;
			while( (linia = read.readLine()) != null) {
				String[] tab = linia.split(" ");
//				System.out.println("while");
				for (int i = 0; i < tab.length-1; i++) {
//					System.out.println("for");
//					System.out.println(tab[i+1]);
					if ( (tab[i+1].equals("psy")) || (tab[i+1].equals("psa")) || (tab[i+1].equals("psow")) ) {
//						System.out.println(psy);
						psy += Integer.parseInt(tab[i]);
					}
					if ( (tab[i+1].equals("koty")) || (tab[i+1].equals("kota")) || (tab[i+1].equals("kotow")) ) {
//						System.out.println(koty);
						koty += Integer.parseInt(tab[i]);
					}
				}
			}
			System.out.printf("Razem maja %d psow i %d kotow.", psy, koty);
			return true;
		} catch (IOException e) {
			return false;
		}
	}
	
	
	
	public static void main(String[] args) {
		Odczyt a = new Odczyt();
		a.wczytajIloscZPliku("test.txt");
	}

}

