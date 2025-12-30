
public class MetinAramaMetotları {

	public static void main(String[] args) {
	
		System.out.println("Merhaba Dunya".indexOf('M'));
		System.out.println("Merhaba Dunya".indexOf('a'));
		System.out.println("Merhaba Dunya".indexOf('a',5));
		
		System.out.println("Merhaba Dunya".indexOf("haba"));
		System.out.println("Merhaba Dunya".indexOf("Dunya" , 5));
		System.out.println("Merhaba Dunya".indexOf("dunya" , 5) );
		
		System.out.println("Merhaba Dunya".lastIndexOf('M'));
		System.out.println("Merhaba Dunya".lastIndexOf('a'));
		
		//BaÅŸtan 5 hane sayÄ±p 5.haneden yani bu Ã¶rnekte 'b' den baÅŸlayÄ±p baÅŸa doÄŸru tarama yapar.
		System.out.println("Merhaba Dunya".lastIndexOf('a',5));
		
		System.out.println("Merhaba Dunya".lastIndexOf("haba"));
		System.out.println("Merhaba Dunya".lastIndexOf("Dunya" , 5));
		System.out.println("Merhaba Dunya".lastIndexOf("dunya" , 5));
		
	}

}

