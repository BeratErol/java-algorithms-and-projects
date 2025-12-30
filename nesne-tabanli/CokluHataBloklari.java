
public class CokluHataBloklari {

	public static void main(String[] args) {
		
		try {
			CemberIstisnaIle c1 = new CemberIstisnaIle (5);
		}
		catch(IllegalArgumentException ex) {
			System.out.println(ex);
		}
		
		try {
			CemberIstisnaIle c2 = new CemberIstisnaIle (-5);
		}
		catch(IllegalArgumentException ex) {
			System.out.println(ex);
		}
		
		try {
			CemberIstisnaIle c3 = new CemberIstisnaIle (0);
		}
		catch(IllegalArgumentException ex) {
			System.out.println(ex);
		}
		
		System.out.println("Olusturulan nesne sayisi: " + CemberIstisnaIle.getNesneSayisi());
		
	}

}

