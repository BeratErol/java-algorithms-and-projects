
import java.util.Scanner;

public class TemelIfDemo {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.print("Bir tamsayi giriniz: ");
	int sayi = input.nextInt();
	
	if (sayi%5 == 0)
		System.out.println("HiFive");
	
	if (sayi%2 == 0)
		System.out.println("HiEven");
	}

}
