
import java.util.Scanner;
public class AlanHesapla {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Lütfen capı giriniz: ");
		int cap = input.nextInt();
		
		if (cap<0)
			System.out.println("Yanlış giriş!");
		
		else {     //cift if'le de yapabilirsin ama if else'le yaparsan else'in yanına karşılaştırma yapmazsın.
			double alan = cap * cap * 3.14159 ; 
			System.out.println("Alan = " + alan);
		}

	}
}
