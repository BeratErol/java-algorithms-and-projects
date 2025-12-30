import java.util.Scanner;

public class FormatliDiziYazdirma {
	public static void main(String[] args) {
		
		double[] benimDizi = new double [5];
		Scanner input = new Scanner(System.in);
		
		System.out.print("LÃ¼tfen " + benimDizi.length + " sayi giriniz: ");
		
		for(int i=0; i<benimDizi.length; i++) {
			benimDizi[i] = input.nextDouble();
			System.out.printf("benimDizi[%d]: %-5.1f \n",i,benimDizi[i]);
		}
		
		
		for(int i=0; i<benimDizi.length; i++) 
			System.out.printf("benimDizi[%d] = %5.1f\n",i,benimDizi[i]);
		
	}

} 	
