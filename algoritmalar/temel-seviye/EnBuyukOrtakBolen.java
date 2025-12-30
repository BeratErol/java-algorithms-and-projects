import java.util.Scanner;

public class EnBuyukOrtakBolen {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	
		System.out.print("Ilk tamsayıyı giriniz: ");
		int sayi1 = input.nextInt();
		System.out.print("Ikinci tamsayıyı giriniz: ");
		int sayi2 = input.nextInt();
		
		int ebob = 1;  // baslangic ebob (sayılar asal olsa bile ebob en küçük 1 olur.)
		int k = 2 ;    // potansiyel ebob
		
		while(k <= sayi1 && k <= sayi2) {
			if(sayi1 % k == 0 && sayi2 % k == 0)
				ebob = k;    // ebob guncelle
			k++;
		}
		
		System.out.println(sayi1 + " ve " + sayi2 + " icin " + "En buyuk ortak bolen: " + ebob);
	}

}
