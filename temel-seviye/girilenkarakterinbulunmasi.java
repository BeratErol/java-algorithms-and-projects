
import java.util.Scanner;
public class girilenkarakterinbulunmasi {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Bir karakter giriniz: ");
		
		String s = input.nextLine();
		char ch = s.charAt(0);
		
		System.out.println("Girilen karakter: " + ch);
		System.out.println("Girilen karakterin ASCII kodu: " + (int)ch);
		
		if (48<=ch && ch<=57)
			System.out.println("Girilen karakter bir sayidir.");
		
		else if (65<=ch && ch<=90)
			System.out.println("Girilen karakter büyük harftir.");
		
			else if (97<=ch && ch<=122) 
		System.out.println("Girilen karakter küçük harftir.");
			
			else
		System.out.println("Küçük harf , büyük harf ya da sayi olmayan bir karakter girdiniz.");	
	}
}
