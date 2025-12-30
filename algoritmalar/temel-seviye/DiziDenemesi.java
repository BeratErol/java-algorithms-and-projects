import java.util.Scanner;

public class DiziDenemesi {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int[]sayilar=new int[5];
		
	for(int i=0; i<sayilar.length; i++) {
		System.out.print("Sayi giriniz: ");
		int a = input.nextInt();
		sayilar[i]=a;
	}
		
	int enKucuk = sayilar[0];
	int enKucukIndıs = 0;
	for(int i=1; i<sayilar.length; i++) {
		if(enKucuk>sayilar[i]) {
			enKucuk = sayilar[i];
			enKucukIndıs=i;          
			}
		}
	
	System.out.println("En küçük sayi = " + enKucuk);
	
	System.out.println("İndis = " + enKucukIndıs);
	}

}
