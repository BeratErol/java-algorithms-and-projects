
import java.util.Scanner;
public class TasKagitMakasOyunu { //class ismi oluşturuken türkçe karakter kullanma.

	public static void main(String[] args) {
		
		int sistemincevabı = (int)(Math.random()*3);
		
		Scanner input = new Scanner (System.in);
		System.out.println("taş(0),kağıt(1),makas(2) hangisi? : ");
		
		int girilensayi = input.nextInt();
		
		if (girilensayi<0 || girilensayi>2)
			System.out.println("Geçerli aralıkta bir sayı giriniz!!!");
		
		else if (girilensayi==0 & sistemincevabı==0)
			System.out.println("Bilgisayar taş, sen taş. BERABERE!");
		else if (girilensayi==1 & sistemincevabı==1)
			System.out.println("Bilgisayar kağıt, sen kağıt. BERABERE!");
		else if (girilensayi==2 & sistemincevabı==2)
		System.out.println("Bilgisayar makas, sen makas. BERABERE!");
		else if (girilensayi==1 & sistemincevabı==0)
				System.out.println("Bilgisayar taş, sen kağıt. KAZANDIN!");
		else if (girilensayi==2 & sistemincevabı==0)
			System.out.println("Bilgisayar taş, sen makas. KAYBETTİN!");
		else if (girilensayi==0 & sistemincevabı==1)
			System.out.println("Bilgisayar kağıt, sen taş. KAYBETTİN!");
		else if (girilensayi==2 & sistemincevabı==1)
			System.out.println("Bilgisayar kağıt, sen makas. KAZANDIN!");
		else if (girilensayi==0 & sistemincevabı==2)
			System.out.println("Bilgisayar makas, sen taş. KAZANDIN!");
		else 
			System.out.println("Bilgisayar makas, sen kağıt. KAYBETTİN!");
	}
}

