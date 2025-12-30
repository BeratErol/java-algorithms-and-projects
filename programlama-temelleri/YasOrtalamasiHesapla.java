
import java.util.Scanner ;

public class YasOrtalamasiHesapla {
	public static void main(String[]args) {
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("Ä°ki kardeÅŸin yaÅŸlarÄ±nÄ± giriniz:");
	double yas1 = input.nextInt();
	double yas2 = input.nextInt();
	
	double kardeslerinYaslaritoplami = yas1 + yas2 ;
	System.out.println("KardeÅŸlerin yaÅŸlarÄ± toplamÄ±= " + kardeslerinYaslaritoplami );
	//System.out.println("KardeÅŸlerin yaÅŸlarÄ± toplamÄ±= " + (yas1 + yas2)); ÅŸeklinde yazÄ±p da tek satÄ±rda birirebilirsin.
	
	double kardeslerinYaslariortalamasi = (yas1 + yas2) / 2 ;
	System.out.println("KardeÅŸlerin yaÅŸlarÄ± ortalamasÄ±= " + kardeslerinYaslariortalamasi);
}
}

