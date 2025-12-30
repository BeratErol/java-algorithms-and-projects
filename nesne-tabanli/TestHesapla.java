
public class TestHesapla {

	public static void main(String[] args) {
		System.out.println(Hesapla.kupAl(5));
		System.out.println(Hesapla.kupAl(10));
		System.out.println(Hesapla.kareAl(5));
		System.out.println(Hesapla.kareAl(10));
		
	}
}

class Hesapla{
	
	static int kupAl(int a) {
		return a*a*a;
	}
	
	static int kareAl(int a) {
		return a*a;
	}
	
}