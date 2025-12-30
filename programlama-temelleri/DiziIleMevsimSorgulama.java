import java.util.Scanner;
public class DiziIleMevsimSorgulama¼tünlemeMevsimler {

	public static void main(String[] args) {
		
		String[] mevsimler = {"Ilkbahar","Yaz","Sonbahar","Kis"};
		Scanner input = new Scanner (System.in);
		System.out.print("Bir mevsim no giriniz(1-4): ");
		int giris = input.nextInt();
		
		System.out.println(mevsimler[giris-1]);
		
	}

}

