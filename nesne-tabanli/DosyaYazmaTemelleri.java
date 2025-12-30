import java.io.*;

public class DosyaYazmaTemelleri {

	public static void main(String[] args) throws IOException {
		
		File dosya2 = new File("puan_listesi.txt");
			
			if (dosya2.exists()) {
				System.out.println("Dosya mevcut");
				System.exit(1);
			}
		
		// Dosya oluÅŸturma
		PrintWriter cikis = new PrintWriter(dosya2);
		
		// Dosyaya yazma 
		cikis.print("Yaman Akbulut Algoritma ");
		cikis.println(85);
		cikis.print("Diger Kisi Algoritma ");
		cikis.println(90);
		
		// DosyayÄ± kapatma
		cikis.close();

	}

}

