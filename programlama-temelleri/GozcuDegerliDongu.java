import java.util.Scanner;
 
 	public class GozcuDegerliDongu {
 		public static void main(String[] args) {
 			Scanner input = new Scanner (System.in);
		
 		System.out.print("Bir tam sayÄ± giriniz " + "(0 girilirse giriÅŸ sonlanÄ±r!): ");
		int veri = input.nextInt() ;
		
		int toplam = 0 ;
		
		do {
			toplam += veri;
			
			System.out.print("Bir tam sayÄ± giriniz " + "(0 girilirse giriÅŸ sonlanÄ±r!): ");
			veri = input.nextInt();
			
			
			}	while (veri != 0);
		
		System.out.println("Girilen sayÄ±larÄ±n toplamÄ± = " + toplam);
	}

}
