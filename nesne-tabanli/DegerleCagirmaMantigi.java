
public class DegerleCagirmaMantigi {

	public static void main(String[] args) {
		int x = 1;
		System.out.println("Metodu çağırmadan önce x: " + x);
		arttir(x);
		System.out.println("Metodu çağırdıktan sonra x: " + x);

	}

	public static void arttir (int n) {
		n++;
		System.out.println("Metodun içinde n: " + n);
	}
	
}

