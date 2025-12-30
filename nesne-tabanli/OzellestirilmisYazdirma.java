import java.util.Scanner;
public class OzellestirilmisYazdirma {

	public static void main(String[] args) {
		 
		Scanner gir = new Scanner (System.in);
		System.out.println("MesajÄ± giriniz: ");
		String mesaj = gir.nextLine();
		
		System.out.println("KaÃ§ kez yazdÄ±rÄ±lsÄ±n: ");
		int n = gir.nextInt();
		
		mesajYazdir(n,mesaj," \n");
	}
		
		public static void mesajYazdir(int sayac, String teks, String opt) {
			for (int i=0; i<sayac; i++)
				System.out.print(teks + opt);
			
		}

}

