
public class IndisVeToplamAnalizi {
	public static void main(String[] args) {
		
		System.out.println("                Tablo Indisleri ve Indis Toplamlari");
		
		System.out.print("  |");
		for (int j=1; j<=9; j++)
			System.out.print("      " + j);
		
		System.out.println("\n--|---------------------------------------------------------------");
		
		for (int i=1; i<=9; i++) {
			System.out.print(i + " |");
			for (int j=1; j<=9; j++) {
				System.out.printf("  %d%d-",j,i);
				System.out.printf("%2d",(j+i));
			}	
			System.out.println();
			
		}	
	}

}

