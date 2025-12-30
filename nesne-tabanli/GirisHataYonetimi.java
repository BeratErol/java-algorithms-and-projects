import java.util.InputMismatchException;
import java.util.Scanner;

public class GirisHataYonetimi {

	public static void main(String[] args) {
		Scanner giris = new Scanner (System.in);
		boolean giriseDevamEt = true;
		
		
		do {
			try {
				System.out.print("Bir tam sayi giriniz: ");
				int sayi = giris.nextInt();
				
				// Sonucu gÃ¶sterme
				System.out.println("Girilen sayi " + sayi + " dir.");
				giriseDevamEt = false;
			}
			catch (InputMismatchException ex){
				System.out.println("Tekrar deneyin. (Gecersiz giris: bir tam sayi gerekiyor)");
				
				giris.nextLine();  // Girisi sil
			}
			
		} while(giriseDevamEt);
		
		
	}

}

