
public class DiziOrtalamaAnalizi {
	public static void main(String[] args) {
		
	java.util.Scanner input = new java.util.Scanner(System.in);
	
	System.out.print("boyutu giriniz: ");
	int n = input.nextInt();
	double[] sayilar = new double [n];
	double toplam = 0;
	
	System.out.print("sayilari giriniz: ");
	for (int i=0; i<n; i++) {
		sayilar[i] = input.nextDouble();
		toplam += sayilar[i];
	}
		
	double ortalama = toplam / n ;
	
	int sayac=0; // ortalamanin üstündeki eleman sayisi
	for (int i=0; i<n; i++)
		if(sayilar[i]>ortalama)
			sayac++;
	
	System.out.println("Ortalama: " + ortalama);
	System.out.println("Ortalamanin üstündeki eleman sayisi: " + sayac);
	}

}

