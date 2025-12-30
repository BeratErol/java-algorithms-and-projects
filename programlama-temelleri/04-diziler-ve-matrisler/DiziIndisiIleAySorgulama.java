import java.util.Scanner;

public class DiziIndisiIleAySorgulama {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		String[] aylar = {"Ocak", "Subat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Agustos", "Eylül", "Ekim", "Kasım", "Aralık"};
		
		System.out.print("Bir ay no giriniz (1-12) : ");
		int ayNo = input.nextInt();
		System.out.println("Ay: " + aylar[ayNo-1]);
		
	
	}

}

