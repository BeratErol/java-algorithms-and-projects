
public class KarakterIndisErisimi {

	public static void main(String[] args) {
		
		String mesaj = "Merhaba Dunya";
		
		System.out.print(mesaj.charAt(5));
		System.out.print(mesaj.charAt(4));
		System.out.print(mesaj.charAt(0));
		System.out.print(mesaj.charAt(11));
		System.out.print(mesaj.charAt(12));

		System.out.println("");
		
		//SayÄ±sal bi deÄŸer olarak gÃ¶rmemesi iÃ§in String olarak gÃ¶rmesi iÃ§in bi yere boÅŸluk bÄ±rakmamÄ±z yeterlidir.
		System.out.println("" + mesaj.charAt(5) + mesaj.charAt(4) + mesaj.charAt(0) + mesaj.charAt(11) + mesaj.charAt(12));
		
		//SayÄ±sal bi deÄŸer olarak gÃ¶rÃ¼r.
		System.out.println(mesaj.charAt(5) + mesaj.charAt(4) + mesaj.charAt(0) + mesaj.charAt(11) + mesaj.charAt(12));
	}

}

