import java.util.Scanner;

public class dizilerÖdev1c {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int[] dizi = new int [20];
		
		System.out.print("Sayilari giriniz: ");
		// 1 1 4 5 2 6 5 5 6 7 1 2 2 2 2 6 9 6 2 8
		for(int i=0; i<dizi.length; i++) 
			dizi[i] = input.nextInt();
		
		
		 // Diziyi küçükten büyüğe sıralayalım.
        for (int i = 0; i < dizi.length - 1; i++) {
            // Dizideki en küçük elemanı bulalım.
            int minIndex = i;
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[j] < dizi[minIndex]) {
                    minIndex = j;
                }
            }

            // En küçük elemanı dizinin başındaki elemanla yer değiştirelim.
            int temp = dizi[i];
            dizi[i] = dizi[minIndex];
            dizi[minIndex] = temp;
        }	
			

		for(int e:dizi)
				System.out.print(e);
	}

}
