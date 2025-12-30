

public class Listeforeach {

	public static void main(String[] args) {
		
		String[] aylar = {"Ocak", "Subat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Agustos", "Eylül", "Ekim", "Kasım", "Aralık"};
		int[] sayilar = {2, 5, 8};
		
		for (String e: aylar) {
			System.out.println(e);
		}
		
		for (int e: sayilar) {
			System.out.println(e);
		}
		
	}

}
