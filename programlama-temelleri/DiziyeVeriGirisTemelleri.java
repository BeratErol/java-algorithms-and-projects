import java.util.Scanner;

public class DiziyeVeriGirisTemelleri {
	public static void main(String[] args) {
		
		double[] benimDizi = new double [5];
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen " + benimDizi.length + " sayi giriniz: ");
		
		for(int i=0; i<benimDizi.length; i++) 
			benimDizi[i] = input.nextDouble();
			
		for(int i=0; i<benimDizi.length; i++) 
			System.out.println(benimDizi[i] + " ");
		
	}

}

