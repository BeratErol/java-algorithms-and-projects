import java.util.Scanner;

public class SayiTahminOyunuDoWhile {
	public static void main(String[] args) {
		
		int sayi = (int)(Math.random()*101);
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("0 ile 100 arasında sihirli bir sayı tahmin ediniz. ");
		
		int tahmin = -1;
		
		do {
			System.out.print("Tahmininiz: ");
			tahmin = input.nextInt();
			
			if (tahmin == sayi)
				System.out.println("Evet, sayi: " + sayi);
			
			else if (tahmin > sayi+30)
				System.out.println("Tahmininiz çok yüksek.");
			
			else if (tahmin > sayi)
				System.out.println("Tahmininiz yüksek.");
			
			else if (tahmin < sayi-30)
				System.out.println("Tahmininiz çok düşük.");
			
			else 
				System.out.println("Tahmininiz düşük.");
		} while (tahmin != sayi);
	
	}

}

