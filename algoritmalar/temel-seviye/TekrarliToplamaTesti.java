 import java.util.Scanner;
 
 	public class TekrarliToplamaTesti {
	 public static void main (String [] args) {
	
	int sayi1 = (int)(Math.random()*10);
	int sayi2 = (int)(Math.random()*10);
	
	Scanner input = new Scanner (System.in);
	
	System.out.print(sayi1 + " + " + sayi2 + " sonucu nedir ? ");
	int cevap = input.nextInt();
	
	while (sayi1 + sayi2 != cevap) {
		
		System.out.println("Yanlış cevap, tekrar deneyiniz!\n" + (sayi1 + " + " + sayi2 + " sonucu nedir ?"));
		
		cevap = input.nextInt();
		
		}
	
		System.out.println("Tebrikler , doğru bildiniz.");
	 }
}
