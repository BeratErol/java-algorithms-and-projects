
//Ortalama hesapla
import java.util.Scanner;   //Scanner, java.util paketinde

public class UcSayınınOrtalaması {
public static void main (String[] args) {
	//Scanner nesnesi oluşturur
	Scanner input = new Scanner (System.in);
	
	//Kullanıcıdan 3 sayı girmesi istenir
	System.out.print("3 sayi giriniz= ");
	double sayi1 = input.nextDouble();
	double sayi2 = input.nextDouble();
	double sayi3 = input.nextDouble();
	
	//Ortalama hesaplanır
	double ortalama = (sayi1 + sayi2 + sayi3) / 3;
	
	//Sonuç gösterilir
	System.out.println(sayi1 + "," + sayi2 + "," + sayi3 + " " + "Sayılarının ortalaması: " + ortalama);
}
}

