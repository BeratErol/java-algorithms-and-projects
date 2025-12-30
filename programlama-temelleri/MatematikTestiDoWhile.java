import java.util.Scanner;

public class MatematikTestiDoWhile {
	public static void main(String[] args) {
	
		int sayi1 = (int)(Math.random()*10);
		int sayi2 = (int)(Math.random()*10);
		
		Scanner input = new Scanner (System.in);
		
		System.out.print(sayi1 + " + " + sayi2 + " sonucu nedir ? ");
		int cevap = input.nextInt();
		
		do {
			if (sayi1 + sayi2 != cevap) {
			System.out.println("YanlÄ±ÅŸ cevap , tekrar deneyiniz!\n" + (sayi1 + " + " + sayi2 + " sonucu nedir ?"));
			
			cevap = input.nextInt();}
			
			if (sayi1 + sayi2 == cevap) 
				System.out.println("Tebrikler doÄŸru bildiniz.");
			
		} while (sayi1 + sayi2 != cevap);
		
	}
}

