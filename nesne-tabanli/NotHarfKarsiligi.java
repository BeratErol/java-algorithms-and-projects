import java.util.Scanner;
public class NotHarfKarsiligi {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Bir not değeri giriniz: ");
		double not = input.nextDouble();
		
		System.out.print("Not değeri: ");
		notYazdir(not);
		
		System.out.print("Not değeri: ");
		notYazdir(78.5);
		
		System.out.print("Not değeri: ");
		notYazdir(59.5);
	}

	public static void notYazdir(double dersnotu) {
		
		if (dersnotu<0 || dersnotu>100) {
			System.out.println("Geçersiz ders notu");
			return;
			}
		
		if (dersnotu>=90.0)
			System.out.println('A');
		
		else if (dersnotu>=80.0)
			System.out.println('B');
		
		else if (dersnotu>=70.0)
			System.out.println('C');
		
		else if (dersnotu>=60.0)
			System.out.println('D');
		
		else
			System.out.println('F');
	}
	
}

