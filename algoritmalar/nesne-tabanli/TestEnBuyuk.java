
public class TestEnBuyuk {

	public static void main(String[] args) {
		
		int i = 5;
		int j = 2;
		int k = enBuyuk(i, j);
		System.out.println(i + " ve " + j + "'nin en büyüğü " + k + "'dir");
			
	}
	
	public static int enBuyuk(int sayi1, int sayi2) {
		int sonuc = 0;
		
		if (sayi1 > sayi2)
			sonuc = sayi1;
		
		else
			sonuc = sayi2;
		
		return sonuc;
	}

}
