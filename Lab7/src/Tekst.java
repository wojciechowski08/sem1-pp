import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tekst {

	public static boolean wczytajPlik(String nPliku) {
		boolean zwraca;
		int znaki = 0;
    	int slowa = 0;
    	int wierszy = 0;
    	int temp;
    	int najwiecejZnakow = 0;
		try {
			
	    	BufferedReader czytaj = new BufferedReader(new FileReader(new File (nPliku)));
	    	String wiersz = null;
	    	
	    	znaki = 0;
	    	slowa = 0;
	    	
	    	najwiecejZnakow = 0;
	    	
	    	while( (wiersz = czytaj.readLine()) != null ) {
	    		wierszy++;
	    		temp = 0;											//wyzerowanie dlugosci wiersza
	    		for (int i = 0; i < wiersz.length(); i++) {
	    			znaki++;										//++ dla kazdego znaku
	    			temp++;											//++ dla kazdego znaku do daleszego porownania dlugosci wierszy
	    		}
	    		if (temp > najwiecejZnakow) {						//porownanie dlugosci
	    			najwiecejZnakow = temp;							//nowy najdluzszy wiersz
	    		}
	    		if (!wiersz.isEmpty()) {
	    			String[] slowaWiersza = wiersz.split(" ");		//podzial wiersza na slowa
		    		slowa += slowaWiersza.length;					//ilosc plikow
	    		}
	    		
	        }
	    } catch (Exception e) {
	    	zwraca = false;
	    } finally {
	    	System.out.println("Ilosc znakow w pliku: " + znaki + "\n" +
	    			"Ilosc slow w pliku: " + slowa + "\n" +
	    			"Dlugosc najdluzszego wiersza w pliku: " + najwiecejZnakow + "\n" +
	    			"Ilosc wierszy: " + wierszy);
	    }
	    zwraca = true;
	    return zwraca;
	}
	
	
	public static int ileRazy(String nPliku) {
		
		int ile = 0;
		try {
			System.out.println("\nWpisz ponizej szukany wyraz");
			BufferedReader wczytaj = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader czytaj = new BufferedReader(new FileReader(new File (nPliku)));
			String wiersz = null;
			String slowo = wczytaj.readLine();
			while( (wiersz = czytaj.readLine()) != null ) {
				String[] slowaWiersza = wiersz.split(" ");
				
				for (int i = 0; i < slowaWiersza.length; i++) {
					//System.out.println(slowaWiersza[i]);
					if (slowaWiersza[i].equals(slowo)) {
						ile ++;
					}
				}
			}
		}
		catch (IOException e) {
			return 0;
		}
		System.out.println("\nWystapil " + ile + " razy");
		return ile;
	}
	
	
//	public static boolean przepisz(String nPliku, String nNowegoPliku) {
//		
//	}
	
	public static void main(String[] args) {
		wczytajPlik("plikTestowy.txt");
		ileRazy("plikTestowy.txt");
	}
}
