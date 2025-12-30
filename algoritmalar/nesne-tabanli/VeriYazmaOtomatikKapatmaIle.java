import java.io.*;

public class VeriYazmaOtomatikKapatmaIle {

	public static void main(String[] args) throws Exception {
		
		File dosya3 = new File("puan_listesi2.txt");
		
			if(dosya3.exists()) {
				System.out.println("Dosya mevcut.");
				System.exit(0);
			}

			try (
				// Dosya oluşturma
				PrintWriter cikis = new PrintWriter(dosya3);
			){
				// Dosyaya yazma
				cikis.print("Yaman Akbulut Algoritma ");
				cikis.println(85);
				cikis.print("Diger Kisi Algoritma ");
				cikis.println(90);
			}
			
	}

}
