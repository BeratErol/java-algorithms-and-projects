import java.util.Scanner;

public class EBOBHesaplama {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	
		System.out.print("Ilk tamsayÄ±yÄ± giriniz: ");
		int sayi1 = input.nextInt();
		System.out.print("Ikinci tamsayÄ±yÄ± giriniz: ");
		int sayi2 = input.nextInt();
		
		int ebob = 1;  // baslangic ebob (sayÄ±lar asal olsa bile ebob en kÃ¼Ã§Ã¼k 1 olur.)
		int k = 2 ;    // potansiyel ebob
		
		while(k <= sayi1 && k <= sayi2) {
			if(sayi1 % k == 0 && sayi2 % k == 0)
				ebob = k;    // ebob guncelle
			k++;
		}
		
		System.out.println(sayi1 + " ve " + sayi2 + " icin " + "En buyuk ortak bolen: " + ebob);
	}

}

