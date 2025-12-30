import java.util.Scanner;

public class DesteKaristirmaAlgoritmasi {
	public static void main(String[] args) {
		int[] deste = new int [52];
		String[] gruplar = {"Maca", "Kupa", "Karo", "Sinek"};
		String[] siralar = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Joker", "Kiz", "Papaz"};
		
		// kartlarin baslangici
		for (int i=0; i<deste.length; i++)
			deste[i] = i;
		
		// kartlari karistir
		for (int i=0; i<deste.length; i++) {
			// rastgele bir indeks oluştur
			int index = (int)(Math.random() * deste.length);
			int temp = deste[i];
			deste[i] = deste[index];
			deste [index] = temp;
		}
		
		// Ilk dort karti göster
		for (int i=0; i<4; i++) {
			String grup = gruplar[deste[i]/13];
			String sira = siralar[deste[i]%13];
			System.out.println("Kart numarasi " + deste[i] + ": " + sira + " - " + grup);
		}

	}

}

