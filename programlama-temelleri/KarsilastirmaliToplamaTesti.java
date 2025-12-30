
import java.util.Scanner;

public class KarsilastirmaliToplamaTesti {
	public static void main(String[] args) {
		int sayi1 = (int)(System.currentTimeMillis() % 10);
		int sayi2 = (int)(System.currentTimeMillis() / 7 % 10);
		int sayi3 = (int)(System.currentTimeMillis());
				
		//Scanner oluÅŸturma (klavyeden/konsoldan giriÅŸ iÃ§in)
		Scanner input = new Scanner (System.in);
		
		System.out.println(sayi3);
		System.out.print(sayi1 + " + " + sayi2 + " sonucu nedir? ");
		
		int cevap = input.nextInt();
		
		System.out.println(sayi1 + " + " + sayi2 + " = " + cevap + " sonucu " + (sayi1 + sayi2 == cevap));
		//(sayi1 + sayi2 == cevap) ifadesi karÅŸÄ±laÅŸtÄ±rma yapÄ±p true false veriyor.)
		//sayi1 + sayi2 cevabe eÅŸitse true deÄŸilse false.
	}
}

