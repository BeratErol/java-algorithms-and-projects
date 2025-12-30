import java.util.Scanner;

public class MantıksalKarsılastırmalar {

	public static void main(String[] args) {
		// TarayÄ±cÄ± nesnesi oluÅŸtur
		Scanner giris = new Scanner (System.in);
		
		// giriÅŸ al
		System.out.println("Bir tamsayÄ± giriniz = ");
		int sayi = giris.nextInt();
		
		if (sayi % 2 == 0 && sayi % 3 == 0)
			System.out.println(sayi + " sayisi 2 VE 3'e bÃ¶lÃ¼nebilir.");
		
		if (sayi % 2 == 0 || sayi % 3 == 0)
			System.out.println(sayi + " sayisi 2 VEYA 3'e bÃ¶lÃ¼nebilir.");
		
		if (sayi % 2 ==0 ^ sayi % 3 ==0)
			System.out.println(sayi + " sayisi 2 VEYA 3'e bÃ¶lÃ¼nebilir , her ikisine birden bÃ¶lÃ¼nemez."); 

	}

}

