
public class MetinKarsılastırmaMetotları {

	public static void main(String[] args) {
		
		String s1 = "Merhaba Dunya";
		String s2 = "Merhaba Dunya";
		String s3 = "Merhaba Mars";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s3.compareTo(s1)); 
		/* s3 dizisi ile s1 dizisini karşılaştırır farklılıklar s3 dizisinde M ile başlar s1'de D , M D'den ilerde olduğu için pozitif döner */
		
		System.out.println(s1.startsWith("Me"));
		System.out.println(s1.startsWith("me"));
		
		System.out.println(s1.endsWith("ya"));
		System.out.println(s1.endsWith("y"));
		
		System.out.println(s1.contains("Du"));
		System.out.println(s1.contains("du"));
		
	}

}

