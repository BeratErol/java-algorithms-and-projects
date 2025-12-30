//Numerik SayÄ± Okuma

import java.util.Scanner;

public class DegiskenTipleriGiris {
	public static void main (String [] args) {
	
	Scanner input = new Scanner(System.in) ;
	System.out.print("Bir byte deÄŸeri giriniz:");
	byte byteDeger = input.nextByte();
	
	System.out.print("Bir short deÄŸeri giriniz:");
	short shortDeger = input.nextShort();
	
	System.out.print("Bir int deÄŸeri giriniz:");
	int intDeger = input.nextInt();
	
	System.out.print("Bir long deÄŸeri giriniz:");
	long longDegeri = input.nextLong();
	
	System.out.print("Bir float deÄŸeri giriniz:");
	float floatDegeri = input.nextFloat();
	
	System.out.print("Bir double deÄŸeri giriniz:");
	double doubleDegeri = input.nextDouble();
}
}

