//Numerik Sayı Okuma

import java.util.Scanner;

public class DegiskenTipleriGiris {
	public static void main (String [] args) {
	
	Scanner input = new Scanner(System.in) ;
	System.out.print("Bir byte değeri giriniz:");
	byte byteDeger = input.nextByte();
	
	System.out.print("Bir short değeri giriniz:");
	short shortDeger = input.nextShort();
	
	System.out.print("Bir int değeri giriniz:");
	int intDeger = input.nextInt();
	
	System.out.print("Bir long değeri giriniz:");
	long longDegeri = input.nextLong();
	
	System.out.print("Bir float değeri giriniz:");
	float floatDegeri = input.nextFloat();
	
	System.out.print("Bir double değeri giriniz:");
	double doubleDegeri = input.nextDouble();
}
}

