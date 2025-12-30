
public class DiziHataYonetimi {

	public static void main(String[] args) {
		
		int dizimiz[] = {1,3,5,7,9};
		int toplam = 0;
		
		try {
			for (int i=0; i<=dizimiz.length; i++) 
				toplam += dizimiz[i];
				
				System.out.println(toplam);
						
		}catch (IndexOutOfBoundsException ex) {
			System.out.println("Dizinin sÄ±nÄ±rlarÄ± aÅŸÄ±ldÄ±!");
		}
		
	}

}

