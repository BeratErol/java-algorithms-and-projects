
public class CarpimTablosuIndis {
	public static void main (String [] args) {
		
	System.out.println("          Carpim Tablosu Indisleri");
		
	System.out.print("    ");
		
	for (int j=1; j<10; j++) 
		System.out.print("   " + j);
		
	System.out.println("\n----------------------------------------");
		
	for (int i=1; i<10; i++) {
		System.out.print(i + " | ");
		
		for(int j=1; j<10; j++) {
			System.out.printf("  %d%d", i,j);
			}	
		System.out.println();
		}
	}
}
