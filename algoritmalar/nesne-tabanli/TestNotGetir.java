
public class TestNotGetir {

	public static void main(String[] args) {
		
		System.out.print("Not değeri: " + notGetir(78.5));
		System.out.print("\nNot değeri: " + notGetir(59.5));
	}

	public static char notGetir(double dersnotu) {
		
		if (dersnotu>=90.0)
			return 'A';
		
		else if (dersnotu>=80.0)
			return 'B';
		
		else if (dersnotu>=70.0)
			return 'C';
		
		else if (dersnotu>=60.0)
			return 'D';
		
		else
			return 'F';
	}

}
