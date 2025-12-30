import java.util.Scanner;

public class MantıksalKarsılastırmalar {

	public static void main(String[] args) {
		// Tarayıcı nesnesi oluştur
		Scanner giris = new Scanner (System.in);
		
		// giriş al
		System.out.println("Bir tamsayı giriniz = ");
		int sayi = giris.nextInt();
		
		if (sayi % 2 == 0 && sayi % 3 == 0)
			System.out.println(sayi + " sayisi 2 VE 3'e bölünebilir.");
		
		if (sayi % 2 == 0 || sayi % 3 == 0)
			System.out.println(sayi + " sayisi 2 VEYA 3'e bölünebilir.");
		
		if (sayi % 2 ==0 ^ sayi % 3 ==0)
			System.out.println(sayi + " sayisi 2 VEYA 3'e bölünebilir , her ikisine birden bölünemez."); 

	}

}

