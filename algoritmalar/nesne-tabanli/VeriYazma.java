import java.io.*;

public class VeriYazma {

	public static void main(String[] args) throws IOException {
		
		File dosya2 = new File("puan_listesi.txt");
			
			if (dosya2.exists()) {
				System.out.println("Dosya mevcut");
				System.exit(1);
			}
		
		// Dosya oluşturma
		PrintWriter cikis = new PrintWriter(dosya2);
		
		// Dosyaya yazma 
		cikis.print("Yaman Akbulut Algoritma ");
		cikis.println(85);
		cikis.print("Diger Kisi Algoritma ");
		cikis.println(90);
		
		// Dosyayı kapatma
		cikis.close();

	}

}
