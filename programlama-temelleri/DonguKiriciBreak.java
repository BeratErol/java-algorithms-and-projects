
public class DonguKiriciBreak {

	public static void main(String[] args) {
		
		int top=0;
		int sayi=0;
		
		while (sayi<20) {
				sayi++;
				top += sayi;
				if (top>100)
					break;
		}
		System.out.println("Sayi: " + sayi);
		System.out.println("Top: " + top);
		
	}

}

