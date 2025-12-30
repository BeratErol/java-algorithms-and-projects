
public class MetotIleSayiToplama {

	public static int top(int i1, int i2) {
		int sonuc = 0;
		for(int i=i1; i<=i2; i++)
			sonuc += i ;
		return sonuc;
	}
	
	public static void main(String[] args) {
		System.out.println("1â€™den 10â€™a kadar toplam " + top(1,10));
		System.out.println("20â€™den 37â€™ye kadar toplam " + top(20,37));
		System.out.println("35â€™den 49â€™a kadar toplam " + top(35,49));	
		
		int z = top(2,5);
		System.out.println(z);
		
		System.out.println(TestEnBuyuk.enBuyuk(9,2));
	}

}


