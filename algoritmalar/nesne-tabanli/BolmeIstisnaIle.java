import java.util.Scanner;

public class BolmeIstisnaIle {
	public static int bolme(int sayi1, int sayi2) throws ArithmeticException{
		if(sayi2 == 0)
			throw new ArithmeticException("Bolen sifir olamaz");
		
		return sayi1/sayi2;
	}
	
	public static void main(String[] args) {
		Scanner giris = new Scanner (System.in);
		
		System.out.print("Lutfen iki tam sayi giriniz: ");
		int sayi1 = giris.nextInt();
		int sayi2 = giris.nextInt();
		
		try {
			int sonuc = bolme(sayi1, sayi2);
			System.out.println(sayi1 + " / " + sayi2 + " = " + sonuc + " dir.");	
		}
		catch (ArithmeticException ex) {
			System.out.println("Istisna: bir tam sayi sifira bolunemez ");
		}
	/*		finally {
			int cevap = bolme(sayi1, sayi2);
			System.out.println(cevap);
		}    													$ finally bloğu ne olursa olsun çalışır.	*/
		
		System.out.println("Yurutme devam ediyor...");

	}

}
