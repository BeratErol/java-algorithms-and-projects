import java.util.Scanner;

public class SayıTahminOyunuWhile {

	public static void main(String[] args) {
		
		int sayi = (int)(Math.random()*101);
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("0 ile 100 arasÄ±nda sihirli bir sayÄ± tahmin ediniz. ");
		
		int tahmin = -1;
		
		while (tahmin != sayi) {
			System.out.print("Tahmininiz: ");
			tahmin = input.nextInt();
			
			if (tahmin == sayi)
				System.out.println("Evet, sayi: " + sayi);
			
			else if (tahmin > sayi+30)
				System.out.println("Tahmininiz Ã§ok yÃ¼ksek.");
			
			else if (tahmin > sayi)
				System.out.println("Tahmininiz yÃ¼ksek.");
			
			else if (tahmin < sayi-30)
				System.out.println("Tahmininiz Ã§ok dÃ¼ÅŸÃ¼k.");
			
			else 
				System.out.println("Tahmininiz dÃ¼ÅŸÃ¼k.");
							}		
		
	}

}

