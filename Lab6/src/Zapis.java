import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Zapis {
	
	private double[][] tab;
	
	public Zapis(int wiersze, int kolumny, double min, double max) {
		
		tab = new double[wiersze][kolumny];
		Random r = new Random();
		
		for (int i = 0; i< tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = (double) ( (r.nextDouble() * (max - min + 1)) + min );
			}
		}
		System.out.println("Tablica wygenerowana.\n");
	}

	
	public void wyswietlTablice() {
		
		System.out.println("Tablica:\n");
		
		String showup = new String();
		
		for (int i = 0; i< tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				showup += String.format("%.2f\t\t", tab[i][j]) ;
//				System.out.println(tab[i][j] + "\t");
			} showup += "\n";
		}
		System.out.print(showup);
	}
	
	public boolean zapiszTablice(String nPliku) {
		
		try (PrintWriter out = new PrintWriter(new FileOutputStream(nPliku))) {
			out.print("Macierz");
			out.printf("%nLiczba wierszy: %d", tab.length);
			out.printf("%nLiczba kolumn: %d%n", tab[0].length);
		       
		    for (int i = 0; i< tab.length; i++) {
		    	
				for (int j = 0; j < tab[i].length; j++) {
						
					out.printf("%.2f\t\t", tab[i][j]);	
				} 
				out.printf("%n");
			}
		} catch (IOException e) {
			System.out.println("\nTablica niezapisana.");
			return false;
		}
		System.out.println("\nTablica zapisana.");
		return true;
		 	
		
	}
	
	public static void main(String[] args) {
		System.out.println("test czy dziala cokolwiek\n");
		Zapis test = new Zapis(4, 5, 1.0, 500.0);
		test.wyswietlTablice();
		test.zapiszTablice("test.txt");
//		wczytajTabele("test.txt");
	}
		
}
