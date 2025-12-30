import java.util.Scanner;
public class IkiSehirSiralama {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Ilk sehri giriniz: ");
		String sehir1 = input.nextLine();
		System.out.print("Ikinci sehri giriniz: ");
		String sehir2 = input.nextLine();
		
		if (	sehir1.compareTo(sehir2)<0)
			System.out.println("Sehirlerin alfabetik sirasi: " + sehir1 + ", " + sehir2);
		
		else 
			System.out.println("Sehirlerin alfabetik sirasi: " + sehir2 + ", " + sehir1);
	}

}
