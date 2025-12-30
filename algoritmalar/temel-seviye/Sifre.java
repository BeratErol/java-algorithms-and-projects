import java.util.Scanner;	

public class Sifre {
	public static void main(String[] args) { 	
		
		String pinKodu = "Yazilim2022";
		Scanner input = new Scanner (System.in);
		
		System.out.print("Kullanici sifresi giriniz: ");
		String giris = input.nextLine();
		
		for(int i=1; i<5; i++) {
			
			if(pinKodu.equals(giris)==false) {
				System.out.print("Sifre yanlis, tekrar giriniz: ");
				giris = input.nextLine();
			}
			
			else if(pinKodu.equals(giris)==true) {
				System.out.print("Hosgeldiniz! Program basliyor...");
				break;}
			
			if (pinKodu.equals(giris)==false && i==4) 
				System.out.println("5 kere yanlış girdiniz.");	
		}
		
	
	}

}
