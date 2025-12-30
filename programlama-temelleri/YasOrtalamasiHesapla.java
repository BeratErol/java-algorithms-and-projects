
import java.util.Scanner ;

public class YasOrtalamasiHesapla {
	public static void main(String[]args) {
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("İki kardeşin yaşlarını giriniz:");
	double yas1 = input.nextInt();
	double yas2 = input.nextInt();
	
	double kardeslerinYaslaritoplami = yas1 + yas2 ;
	System.out.println("Kardeşlerin yaşları toplamı= " + kardeslerinYaslaritoplami );
	//System.out.println("Kardeşlerin yaşları toplamı= " + (yas1 + yas2)); şeklinde yazıp da tek satırda birirebilirsin.
	
	double kardeslerinYaslariortalamasi = (yas1 + yas2) / 2 ;
	System.out.println("Kardeşlerin yaşları ortalaması= " + kardeslerinYaslariortalamasi);
}
}

