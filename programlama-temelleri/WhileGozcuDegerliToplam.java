 import java.util.Scanner;
 
 	public class WhileGozcuDegerliToplam {
 		public static void main(String[] args) {
 			Scanner input = new Scanner (System.in);
		
		System.out.print("Bir tam sayi giriniz " + "(0 girilirse giriÅŸ sonlanÄ±r!): ");
		int veri = input.nextInt();
		
		int toplam = 0 ;
		
		while (veri != 0 ) {
			toplam += veri ;
			
			System.out.print("Bir tam sayi giriniz " + "(0 girilirse giriÅŸ sonlanÄ±r!): ");
			veri = input.nextInt();
			
							}
		
		System.out.println("Girilen sayÄ±larÄ±n toplamÄ± = " + toplam);
		
	}

}

