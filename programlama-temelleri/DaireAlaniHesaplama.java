
import java.util.Scanner;
public class DaireAlaniHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("LÃ¼tfen capÄ± giriniz: ");
		int cap = input.nextInt();
		
		if (cap<0)
			System.out.println("YanlÄ±ÅŸ giriÅŸ!");
		
		else {     //cift if'le de yapabilirsin ama if else'le yaparsan else'in yanÄ±na karÅŸÄ±laÅŸtÄ±rma yapmazsÄ±n.
			double alan = cap * cap * 3.14159 ; 
			System.out.println("Alan = " + alan);
		}

	}
}

