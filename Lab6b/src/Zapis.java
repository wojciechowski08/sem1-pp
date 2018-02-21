//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Random;

public class Zapis {
	
	private double[][] tab;
	
//	public Zapis(int wiersze, int kolumny, double min, double max) {
//		
//		tab = new double[wiersze][kolumny];
//		Random r = new Random();
//		
//		for (int i = 0; i< tab.length; i++) {
//			for (int j = 0; j < tab[i].length; j++) {
//				tab[i][j] = (double) ( (r.nextDouble() * (max - min + 1)) + min );
//			}
//		}
//		System.out.println("Tablica wygenerowana.\n");
//	}
//
//	
//	public void wyswietlTablice() {
//		
//		System.out.println("Tablica:\n");
//		
//		for (int i = 0; i< tab.length; i++) {
//			for (int j = 0; j < tab[i].length; j++) {
//				System.out.println(tab[i][j] + "\t");
//			} System.out.println("\n");
//		}
//	}
//	
//	public boolean zapiszTablice(String nPliku) {
//		
//		try (PrintWriter out = new PrintWriter(new FileOutputStream(nPliku))) {
//		       out.println("Macierz");
//		       out.printf("Liczba wierszy: %d", tab.length);
//		       out.printf("Liczba kolumn: %d", tab[0].length);
//		       for (int i = 0; i< tab.length; i++) {
//					for (int j = 0; j < tab[i].length; j++) {
//						out.printf("%d", tab[i][j]);
//					} out.printf("");
//				}
//		     } catch (IOException e) {
//		       return false;
//		     }
//		     return true;
//		
//	}
	
	public static void main(String[] args) {
		System.out.println("testczydzialacokolwiek\n\n");
//		Zapis test = new Zapis(4, 5, 1.0, 500.0);
//		test.wyswietlTablice();
//		test.zapiszTablice("test");
	}
		
}
