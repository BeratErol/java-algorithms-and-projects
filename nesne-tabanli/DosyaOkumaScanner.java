import java.util.Scanner;

public class DosyaOkumaScanner {

	public static void main(String[] args) throws Exception {
		// File örneği oluşturma
		java.io.File dosya = new java.io.File("puan_listesi.txt");
		
		// Dosya için bir Scanner oluşturma
		Scanner giris = new Scanner(dosya);
		
		// Dsoyadan veri okuma
		while(giris.hasNext()) {
			String isim = giris.next();
			String soyIsim = giris.next();
			String dersAdi = giris.next();
			int notDegeri = giris.nextInt();
			System.out.println(isim+ " " + soyIsim + " " + dersAdi + " " + notDegeri);
		}

		// Dosyayı kapatma
		giris.close();
	}

}

