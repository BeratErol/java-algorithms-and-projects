
public class MantıksalHataAnalizi {
public static void main (String[] args) {
	System.out.print("Celcius 35 is Fahrenheit degree = ");
	System.out.println((9.0/5.0)*35+32);
	//DoÄŸru cevap 95'tir 9.0/5.0 ÅŸeklinde yazmalÄ±yÄ±z yoksa 9/5 cevabÄ± 1 gelir.
	
	System.out.print("Celcius 35 is Fahrenheit degree = ");
	System.out.println((9/5)*35+32);
	//MantÄ±k hatasÄ±
}
}

