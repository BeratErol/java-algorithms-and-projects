import java.util.Scanner;
public class TestMesajYazdir {

	public static void main(String[] args) {
		 
		Scanner gir = new Scanner (System.in);
		System.out.println("Mesajı giriniz: ");
		String mesaj = gir.nextLine();
		
		System.out.println("Kaç kez yazdırılsın: ");
		int n = gir.nextInt();
		
		mesajYazdir(n,mesaj," \n");
	}
		
		public static void mesajYazdir(int sayac, String teks, String opt) {
			for (int i=0; i<sayac; i++)
				System.out.print(teks + opt);
			
		}

}
