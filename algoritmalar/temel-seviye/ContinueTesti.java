
public class ContinueTesti {

	public static void main(String[] args) {
		
		int top=0;
		int sayi=0;
		
		while (sayi<20) {
				sayi++;
				if (sayi==10 || sayi==11)
					continue;
					top = top+sayi;
		}
		System.out.println("Sayi: " + sayi);
		System.out.println("Top: " + top);
		
	}

}