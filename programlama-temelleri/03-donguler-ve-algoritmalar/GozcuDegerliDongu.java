import java.util.Scanner;
 
 	public class GozcuDegerliDongu {
 		public static void main(String[] args) {
 			Scanner input = new Scanner (System.in);
		
 		System.out.print("Bir tam sayı giriniz " + "(0 girilirse giriş sonlanır!): ");
		int veri = input.nextInt() ;
		
		int toplam = 0 ;
		
		do {
			toplam += veri;
			
			System.out.print("Bir tam sayı giriniz " + "(0 girilirse giriş sonlanır!): ");
			veri = input.nextInt();
			
			
			}	while (veri != 0);
		
		System.out.println("Girilen sayıların toplamı = " + toplam);
	}

}
