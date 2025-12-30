import java.util.Scanner;
public class MetinGirisCıkısYonetimi {

	public static void main(String[] args) {
		Scanner imput = new Scanner (System.in);
		System.out.print("BoÅŸlukla ayrÄ±lmÄ±ÅŸ 3 kelime yazÄ±nÄ±z: ");
		
		String s1 = imput.next();
		String s2 = imput.next();
		String s3 = imput.next();
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		
	// KONSOLDAN SATIR GÄ°RÄ°ÅÄ°
		
		Scanner giriÅŸ = new Scanner(System.in);
		System.out.print("Bir satir yaziniz: ");
		
		String s = giriÅŸ.nextLine();
		System.out.println("Girilen satir: " + s);
		
	// KONSOLDAN KARAKTER OKUMA
		
		char ch = s.charAt(0);
		System.out.println("Girilen karakter: " + ch);
	}

}

