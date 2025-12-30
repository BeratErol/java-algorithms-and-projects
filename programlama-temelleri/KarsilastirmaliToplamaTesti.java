
import java.util.Scanner;

public class KarsilastirmaliToplamaTesti {
	public static void main(String[] args) {
		int sayi1 = (int)(System.currentTimeMillis() % 10);
		int sayi2 = (int)(System.currentTimeMillis() / 7 % 10);
		int sayi3 = (int)(System.currentTimeMillis());
				
		//Scanner oluşturma (klavyeden/konsoldan giriş için)
		Scanner input = new Scanner (System.in);
		
		System.out.println(sayi3);
		System.out.print(sayi1 + " + " + sayi2 + " sonucu nedir? ");
		
		int cevap = input.nextInt();
		
		System.out.println(sayi1 + " + " + sayi2 + " = " + cevap + " sonucu " + (sayi1 + sayi2 == cevap));
		//(sayi1 + sayi2 == cevap) ifadesi karşılaştırma yapıp true false veriyor.)
		//sayi1 + sayi2 cevabe eşitse true değilse false.
	}
}

