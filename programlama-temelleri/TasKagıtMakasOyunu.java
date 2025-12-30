
import java.util.Scanner;
public class TasKagıtMakasOyunu { //class ismi oluÅŸturuken tÃ¼rkÃ§e karakter kullanma.

	public static void main(String[] args) {
		
		int sistemincevabÄ± = (int)(Math.random()*3);
		
		Scanner input = new Scanner (System.in);
		System.out.println("taÅŸ(0),kaÄŸÄ±t(1),makas(2) hangisi? : ");
		
		int girilensayi = input.nextInt();
		
		if (girilensayi<0 || girilensayi>2)
			System.out.println("GeÃ§erli aralÄ±kta bir sayÄ± giriniz!!!");
		
		else if (girilensayi==0 & sistemincevabÄ±==0)
			System.out.println("Bilgisayar taÅŸ, sen taÅŸ. BERABERE!");
		else if (girilensayi==1 & sistemincevabÄ±==1)
			System.out.println("Bilgisayar kaÄŸÄ±t, sen kaÄŸÄ±t. BERABERE!");
		else if (girilensayi==2 & sistemincevabÄ±==2)
		System.out.println("Bilgisayar makas, sen makas. BERABERE!");
		else if (girilensayi==1 & sistemincevabÄ±==0)
				System.out.println("Bilgisayar taÅŸ, sen kaÄŸÄ±t. KAZANDIN!");
		else if (girilensayi==2 & sistemincevabÄ±==0)
			System.out.println("Bilgisayar taÅŸ, sen makas. KAYBETTÄ°N!");
		else if (girilensayi==0 & sistemincevabÄ±==1)
			System.out.println("Bilgisayar kaÄŸÄ±t, sen taÅŸ. KAYBETTÄ°N!");
		else if (girilensayi==2 & sistemincevabÄ±==1)
			System.out.println("Bilgisayar kaÄŸÄ±t, sen makas. KAZANDIN!");
		else if (girilensayi==0 & sistemincevabÄ±==2)
			System.out.println("Bilgisayar makas, sen taÅŸ. KAZANDIN!");
		else 
			System.out.println("Bilgisayar makas, sen kaÄŸÄ±t. KAYBETTÄ°N!");
	}
}

