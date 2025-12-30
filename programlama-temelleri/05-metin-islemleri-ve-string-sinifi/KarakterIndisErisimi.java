
public class KarakterIndisErisimi {

	public static void main(String[] args) {
		
		String mesaj = "Merhaba Dunya";
		
		System.out.print(mesaj.charAt(5));
		System.out.print(mesaj.charAt(4));
		System.out.print(mesaj.charAt(0));
		System.out.print(mesaj.charAt(11));
		System.out.print(mesaj.charAt(12));

		System.out.println("");
		
		//Sayısal bi değer olarak görmemesi için String olarak görmesi için bi yere boşluk bırakmamız yeterlidir.
		System.out.println("" + mesaj.charAt(5) + mesaj.charAt(4) + mesaj.charAt(0) + mesaj.charAt(11) + mesaj.charAt(12));
		
		//Sayısal bi değer olarak görür.
		System.out.println(mesaj.charAt(5) + mesaj.charAt(4) + mesaj.charAt(0) + mesaj.charAt(11) + mesaj.charAt(12));
	}

}

