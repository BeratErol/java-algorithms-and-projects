import java.util.Scanner;

public class RastgeleSayiCikarmaOyunu {
	public static void main (String[] args) {
		// 1)İki tane random sayı üret
		int sayi1 = (int)(Math.random() * 10);
		int sayi2 = (int)(Math.random() * 10);
		
		// 2)sayi1<sayi2 ise sayi1 ve sayi2'yi yer değiştir
		if (sayi1<sayi2) {
			int temp = sayi1 ; //sayi1'in değerini kaybetmemek için bir şeye atarız
			sayi1=sayi2 ;
			sayi2=temp;  
			}
			
		// 3)Kullanıcıya sor "sayi1 - sayi2 sonucu nedir?"	
		System.out.println(sayi1 + " - " + sayi2 + " nedir? ");
			
		Scanner input = new Scanner (System.in);
		int cevap = input.nextInt();
			
		// 4)Cevabı değerlendir ve sonucu göster
		if (sayi1 - sayi2 == cevap) 
		System.out.println("Tebrikler , doğru bildiniz.");
		else {
		System.out.println("Cevabınız yanlis!");
		System.out.println(sayi1 + " - " + sayi2 + " sonucu " + (sayi1-sayi2) + " olmalı.");
		}		
		/* System.out.println(sayi1 + " - " + sayi2 + " sonucu " + (sayi1-sayi2 == cevap)); 
		yazıp true false şeklinde de yapabilirdik. */
	}
}

