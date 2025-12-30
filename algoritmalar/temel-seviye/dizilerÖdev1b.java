import java.util.Scanner;

public class dizilerÖdev1b {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int[] diziyiSenBelirle = new int [20];
		
		System.out.print("Sayilari giriniz: ");
		// 1 1 4 5 2 6 5 5 6 7 1 2 2 2 2 6 9 6 2 8
		for(int i=0; i<diziyiSenBelirle.length; i++) 
			diziyiSenBelirle[i] = input.nextInt();
	
		
		int enKucuk = diziyiSenBelirle[0];
		int enKucukIndeks = 0;
		for(int i=1; i<diziyiSenBelirle.length; i++) 
		{
			if(enKucuk>diziyiSenBelirle[i]) 
			{
				enKucuk = diziyiSenBelirle[i];
				enKucukIndeks = i ;
			}
		}		

		System.out.println("En küçük sayi = " + enKucuk + " ve indisi = " + enKucukIndeks);

	}

}
