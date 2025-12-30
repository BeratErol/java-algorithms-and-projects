import java.util.Scanner;

public class FibonacciDizisiOlusturma {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Dizinin boyutunu giriniz: ");
		int boyut = input.nextInt();
		
		int [] sayilar = new int [boyut];
		
		sayilar[0]=0;
		sayilar[1]=1;
		System.out.print(sayilar[0]+" "+sayilar[1]+" ");
		for(int i=2; i<sayilar.length; i++) {
			sayilar[i]=sayilar[i-1]+sayilar[i-2];
			System.out.print(sayilar[i]+" ");
		}
		
		
	}

}

