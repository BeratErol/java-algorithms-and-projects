
import java.util.Scanner ;

public class ToplamaTesti {
	public static void main (String[] args) {
		int sayi1 = (int)(System.currentTimeMillis() % 10);
		int sayi2 = (int)(System.currentTimeMillis() / 7 % 10);
		/*milisaniye 1/1000 demektir bu yüzden 10'a göre modunu istersek tek haneli 100'e göre modunu istersek çift haneli
		verir vb.*/
		//(System.currentTimeMillis()); bize milisaniyede geçen zamana göre rastgele bir sayı verir.
		
		//Scanner oluşturma (klavyeden/konsoldan giriş için)
		Scanner input = new Scanner (System.in);
	
		System.out.print(sayi1 + " + " + sayi2 + " sonucu nedir? ");
		
		int cevap = input.nextInt();
		
		System.out.println(sayi1 + " + " + sayi2 + " = " + cevap + " sonucu " + (sayi1 + sayi2 == cevap));
	}
}
