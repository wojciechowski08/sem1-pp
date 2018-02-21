import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Odczyt {


	public boolean wczytajTabele(String nPliku) {
		try {
			BufferedReader czytaj = new BufferedReader(new FileReader(new File (nPliku)));
	    	String wiersz = null;
	    	String[] temp = new String[3];
	    	double[][] tab;
	    	int w = 0;
	    	int k = 0;
//	    	String[] wierszMacierzy;
	    	
	    	while ( (wiersz = czytaj.readLine()) != null ) {									//gdy wiersz jest niepusty
	    		if (wiersz == "Macierz") {														//rozpoczecie czytania macierzy					
	    			wiersz = czytaj.readLine();													//next line
	    			temp = wiersz.split(" ");
	    			w = Integer.parseInt(temp[2]);												//odczyt ilosci wierszy
	    			wiersz = czytaj.readLine();
	    			temp = wiersz.split(" ");
	    			k = Integer.parseInt(temp[2]);												//odczyt ilosci kolumn
	    			tab = new double[w][k];
//	    			wierszMacierzy = new String[k];
	    			for (int i = 0; i < w; i++) {
	    				wiersz = czytaj.readLine();
	    				String[] wierszMacierzy = wiersz.split("\t\t");
	    				for (int j = 0; j < k; j++) {
	    					tab[i][j] = Double.parseDouble(wierszMacierzy[j]);					//dodawanie wartosci
	    				}
	    			}
	    		}
	    	}
	    } catch (Exception e) {
	    	return false;
	    }
	    return true;
	}
	
}
