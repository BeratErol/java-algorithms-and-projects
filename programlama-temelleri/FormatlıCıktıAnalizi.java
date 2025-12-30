
public class PrintfOrnekleri {

	public static void main(String[] args) {
		
		double miktar = 12618.98;
		double ucretOrani = 0.0013;
		double ucret = miktar * ucretOrani ;
		System.out.println("Ucret: " + ucret);
		
		System.out.printf("Ucret: %4.2f TL \n" , ucret );
		
		System.out.printf("Ucret: %5.3f TL \n" , ucret); // 16.404 alır ama 404 ten sonraki basamak 5'ten büyük olduğu için 16.405 alıyor.
		
		int adet = 5;
		double miktar2 = 45.56;
		
		System.out.printf("Adet %d ve miktar2 %f \n" , adet , miktar2);
		
		char karakter = 'b';
		System.out.printf("%5c \n" , karakter);  //önünde 4 boşluk olur
		
		int ucret2 = adet*adet;
		System.out.printf("%5d \n" , ucret2);
		
		System.out.printf("%10.2f \n",ucret);
		
		System.out.printf("%10.2e \n", ucret);
		System.out.printf("%10.2e \n", Math.PI);
		
		String mesaj = "Merhaba";
		System.out.printf("%10s \n" , mesaj);
		
		String mesaj2 = "Merhaba Dunya";
		System.out.printf("%12s \n" , mesaj2);
		
		int saat = 10;
		boolean acikMi = (saat>5);
		System.out.printf("%6b" , acikMi);
	}

}
