
public class JavaKütüphanesiSiniflari {

	public static void main(String[] args) {
		
		// Date class
		java.util.Date date = new java.util.Date();
		System.out.println("The elapsed time since Jan1, 1970 is " + date.getTime() + " milliseconds");
		System.out.println(date.toString() + "\n");

		// Random class
		java.util.Random random1 = new java.util.Random(3);
		System.out.print("From random1: ");
		for (int i=0; i<10; i++)
			System.out.print(random1.nextInt(1000) + " ");
		
		java.util.Random random2 = new java.util.Random(3);
		System.out.print("\nFrom random2: ");
		for (int i=0; i<10; i++)
			System.out.print(random2.nextInt(1000) + " ");
	}

}
