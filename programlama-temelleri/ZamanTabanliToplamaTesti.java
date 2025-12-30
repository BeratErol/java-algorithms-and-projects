
import java.util.Scanner ;

public class ZamanTabanliToplamaTesti {
	public static void main (String[] args) {
		int sayi1 = (int)(System.currentTimeMillis() % 10);
		int sayi2 = (int)(System.currentTimeMillis() / 7 % 10);
		/*milisaniye 1/1000 demektir bu yÃ¼zden 10'a gÃ¶re modunu istersek tek haneli 100'e gÃ¶re modunu istersek Ã§ift haneli
		verir vb.*/
		//(System.currentTimeMillis()); bize milisaniyede geÃ§en zamana gÃ¶re rastgele bir sayÄ± verir.
		
		//Scanner oluÅŸturma (klavyeden/konsoldan giriÅŸ iÃ§in)
		Scanner input = new Scanner (System.in);
	
		System.out.print(sayi1 + " + " + sayi2 + " sonucu nedir? ");
		
		int cevap = input.nextInt();
		
		System.out.println(sayi1 + " + " + sayi2 + " = " + cevap + " sonucu " + (sayi1 + sayi2 == cevap));
	}
}

