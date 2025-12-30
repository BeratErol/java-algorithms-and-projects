
public class KlasikCarpimTablosu {
	public static void main(String[] args) {
		//tablonun baÅŸlÄ±ÄŸÄ±
		System.out.println("                Carpim Tablosu");
		
		//sayÄ± baÅŸlÄ±ÄŸÄ±
		System.out.print("    ");
		for (int j=1; j<=9; j++)
			System.out.print("   "+j);
		
		System.out.println("\n----------------------------------------");
		
		//tablonun gÃ¶vdesi 
		for (int i=1; i<=9; i++) {
			System.out.print(i+ " | ");
			for (int j=1; j<=9; j++) {
				//carpimlar ve dÃ¼zenli yerlestirme
				System.out.printf("%4d",i*j);
			}
			System.out.println();
		}

	}

}

