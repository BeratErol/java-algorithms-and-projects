import java.util.Scanner;

public class RastgeleSayıCıkarmaOyunu {
	public static void main (String[] args) {
		// 1)Ä°ki tane random sayÄ± Ã¼ret
		int sayi1 = (int)(Math.random() * 10);
		int sayi2 = (int)(Math.random() * 10);
		
		// 2)sayi1<sayi2 ise sayi1 ve sayi2'yi yer deÄŸiÅŸtir
		if (sayi1<sayi2) {
			int temp = sayi1 ; //sayi1'in deÄŸerini kaybetmemek iÃ§in bir ÅŸeye atarÄ±z
			sayi1=sayi2 ;
			sayi2=temp;  
			}
			
		// 3)KullanÄ±cÄ±ya sor "sayi1 - sayi2 sonucu nedir?"	
		System.out.println(sayi1 + " - " + sayi2 + " nedir? ");
			
		Scanner input = new Scanner (System.in);
		int cevap = input.nextInt();
			
		// 4)CevabÄ± deÄŸerlendir ve sonucu gÃ¶ster
		if (sayi1 - sayi2 == cevap) 
		System.out.println("Tebrikler , doÄŸru bildiniz.");
		else {
		System.out.println("CevabÄ±nÄ±z yanlis!");
		System.out.println(sayi1 + " - " + sayi2 + " sonucu " + (sayi1-sayi2) + " olmalÄ±.");
		}		
		/* System.out.println(sayi1 + " - " + sayi2 + " sonucu " + (sayi1-sayi2 == cevap)); 
		yazÄ±p true false ÅŸeklinde de yapabilirdik. */
	}
}

