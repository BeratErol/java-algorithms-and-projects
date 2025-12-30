import java.util.Scanner;

public class DiziOrtalamaHesaplayıcı–dev2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int[] dizi = new int [20];
		
		System.out.print("Sayilari giriniz: ");
		// 1 1 4 5 2 6 5 5 6 7 1 2 2 2 2 6 9 6 2 8
		
		int toplam=0;
		for(int i=0; i<dizi.length; i++) {
			dizi[i] = input.nextInt();
			toplam += dizi[i];
		}
		double ortalama = toplam / 20.0;
		
		System.out.println("Sayilarin toplami: " + toplam + "\nSayilarin ortalamasi: " + ortalama);
		
	}

}

