
public class ShowLogicErrors {
public static void main (String[] args) {
	System.out.print("Celcius 35 is Fahrenheit degree = ");
	System.out.println((9.0/5.0)*35+32);
	//Doğru cevap 95'tir 9.0/5.0 şeklinde yazmalıyız yoksa 9/5 cevabı 1 gelir.
	
	System.out.print("Celcius 35 is Fahrenheit degree = ");
	System.out.println((9/5)*35+32);
	//Mantık hatası
}
}
