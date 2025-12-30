
public class charkarsilastirma {

	public static void main(String[] args) {
		
		char ch = 'a' ;
		
		// Character SINIFINDAKİ METOTLAR:
		
		System.out.println("isDigit('a') " + Character.isDigit('a')); //Belirtilen karakter sayı ise true döndürür.
		System.out.println("isLetter('a') " + Character.isLetter('a')); //Belirtilen karakter harf ise true döndürür.
		System.out.println("isLetterofDigit('0') " + Character.isLetterOrDigit('0')); //Belirtilen karakter sayı veya harf ise true döndürür.
		System.out.println("isLowerCase('a') " + Character.isLowerCase('a')); //Belirtilen karakter küçük harf ise true döndürür.
		System.out.println("isUpperCase('a') " + Character.isUpperCase('a')); //Belirtilen karakter BÜYÜK harf ise true döndürür.
		System.out.println("toLowerCase('Z') " + Character.toLowerCase('Z')); //Belirtilen karakteri küçük harfe çevirir.
		System.out.println("toUpperCase('a') " + Character.toUpperCase('a')); //Belirtilen karakteri BÜYÜK harfe çevirir.
		
		
		
	}

}
