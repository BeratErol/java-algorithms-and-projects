import java.io.*;
import java.util.*;

public class MetinDegisme {

	public static void main(String[] args) throws Exception {
		
		// Komut satırı parametre kullanımını kontrol etme
		if(args.length != 4) {
		    System.out.println("Kullanim: java MetinDegisme Bolumler Bolumler_v1 Bilgisayar Yazilim");
		    System.exit(1);
		}
		
		// Kaynak dosya mevcut mu?
		File Bolumler = new File(args[0]);
		if(!Bolumler.exists()) {
			System.out.println("Kaynak dosya " + args[0] + " mevcut degil");
			System.exit(2);
		}
		
		// Hedef dosya mevcut mu?
		File Bolumler_v1 = new File(args[1]);
		if(!Bolumler_v1.exists()) {
			System.out.println("Hedef dosya " + args[1] + " mevcut degil");
			System.exit(3);
		}
		try(
			// giris ve cikis dosyalarini oluşturma
			Scanner giris = new Scanner (Bolumler);
			PrintWriter cikis = new PrintWriter(Bolumler_v1);
			){
			while (giris.hasNext()) {
				String s1 = giris.nextLine();
				String s2 = s1.replaceAll(args[2], args[3]);
				cikis.println(s2);
			}
		}
			
	}
}


