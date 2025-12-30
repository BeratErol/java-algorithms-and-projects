
public class CarpimTablosu {
	public static void main(String[] args) {
		//tablonun başlığı
		System.out.println("                Carpim Tablosu");
		
		//sayı başlığı
		System.out.print("    ");
		for (int j=1; j<=9; j++)
			System.out.print("   "+j);
		
		System.out.println("\n----------------------------------------");
		
		//tablonun gövdesi 
		for (int i=1; i<=9; i++) {
			System.out.print(i+ " | ");
			for (int j=1; j<=9; j++) {
				//carpimlar ve düzenli yerlestirme
				System.out.printf("%4d",i*j);
			}
			System.out.println();
		}

	}

}
