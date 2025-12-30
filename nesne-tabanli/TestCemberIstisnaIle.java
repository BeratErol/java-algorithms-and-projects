
public class TestCemberIstisnaIle {

	public static void main(String[] args) {
		
		try {
			CemberIstisnaIle c1 = new CemberIstisnaIle (5);
			CemberIstisnaIle c2 = new CemberIstisnaIle (-5);
			CemberIstisnaIle c3 = new CemberIstisnaIle (0);
		}
		catch(IllegalArgumentException ex) {
			System.out.println(ex);
		}
  
		// 2.nesne catche girdikten sonra 3.nesne geçildiği için oluşturulan nesne sayısı 1 olur.
		System.out.println("Olusturulan nesne sayisi: " + CemberIstisnaIle.getNesneSayisi());
		
	}

}
