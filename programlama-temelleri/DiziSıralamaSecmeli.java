import java.util.Scanner;

public class DiziSıralamaSecmeli–dev1c {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int[] dizi = new int [20];
		
		System.out.print("Sayilari giriniz: ");
		// 1 1 4 5 2 6 5 5 6 7 1 2 2 2 2 6 9 6 2 8
		for(int i=0; i<dizi.length; i++) 
			dizi[i] = input.nextInt();
		
		
		 // Diziyi kÃ¼Ã§Ã¼kten bÃ¼yÃ¼ÄŸe sÄ±ralayalÄ±m.
        for (int i = 0; i < dizi.length - 1; i++) {
            // Dizideki en kÃ¼Ã§Ã¼k elemanÄ± bulalÄ±m.
            int minIndex = i;
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[j] < dizi[minIndex]) {
                    minIndex = j;
                }
            }

            // En kÃ¼Ã§Ã¼k elemanÄ± dizinin baÅŸÄ±ndaki elemanla yer deÄŸiÅŸtirelim.
            int temp = dizi[i];
            dizi[i] = dizi[minIndex];
            dizi[minIndex] = temp;
        }	
			

		for(int e:dizi)
				System.out.print(e);
	}

}

