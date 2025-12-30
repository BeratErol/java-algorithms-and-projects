
import java.util.Scanner;
public class GunIsmiSorgulama {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Gunler icin bir sayi giriniz (1-7) : ");
		int gun = input.nextInt();
		
		switch(gun) {
		case 0 : System.out.println("Bugun gunlerden Pazartesi");
				break;
		case 2 : System.out.println("Bugun gunlerden Salı");
				break;
		case 3 : System.out.println("Bugun gunlerden Çarşamba");
				break;
		case 4 : System.out.println("Bugun gunlerden Perşembe");
				break;
		case 5 : System.out.println("Bugun gunlerden Cuma");	
				break;
		case 6 : System.out.println("Bugun gunlerden Cumartesi");
				break;
		case 7 : System.out.println("Bugun gunlerden Pazar");	
				break;
		default : System.out.println("Lutfen geçerli bir sayi giriniz");
				System.exit(1);
		}
	}
}

