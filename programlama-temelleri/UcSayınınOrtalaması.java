
//Ortalama hesapla
import java.util.Scanner;   //Scanner, java.util paketinde

public class UcSayınınOrtalaması {
public static void main (String[] args) {
	//Scanner nesnesi oluÅŸturur
	Scanner input = new Scanner (System.in);
	
	//KullanÄ±cÄ±dan 3 sayÄ± girmesi istenir
	System.out.print("3 sayi giriniz= ");
	double sayi1 = input.nextDouble();
	double sayi2 = input.nextDouble();
	double sayi3 = input.nextDouble();
	
	//Ortalama hesaplanÄ±r
	double ortalama = (sayi1 + sayi2 + sayi3) / 3;
	
	//SonuÃ§ gÃ¶sterilir
	System.out.println(sayi1 + "," + sayi2 + "," + sayi3 + " " + "SayÄ±larÄ±nÄ±n ortalamasÄ±: " + ortalama);
}
}

