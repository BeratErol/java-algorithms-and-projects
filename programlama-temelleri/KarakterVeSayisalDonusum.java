
public class KarakterVeSayisalDonusum {

	public static void main(String[] args) {
		char ch = (char) 0xAB0041; 
		System.out.println(ch);

		char ch2 = (char)65.25; // ondalÄ±k kÄ±smÄ± atÄ±p tam kÄ±smÄ± Ã§evirir
		System.out.println(ch2);
		
		int i = (int)'A';
		System.out.println(i);
		
		int j = '2' + '3' ;
		System.out.println(j);
		
		int k = 2 + 'a';
		System.out.println(k + "," + (char)k + " nin Unicode karakteridir.");
	
		System.out.println("Chapter " + '2');
	}

}

