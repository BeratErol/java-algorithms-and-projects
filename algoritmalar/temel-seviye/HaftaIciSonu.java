import java.util.Scanner;
public class HaftaIciSonu {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Gun icin bir sayi giriniz (1-7) = ");
	int gun = input.nextInt();
	
	switch (gun) {  // int'te tanımladığın değişkenle switch içindeki değişken aynı olmalı 
	case 1 : 
	case 2 :
	case 3 :
	case 4 :
	case 5 : System.out.println("Hafta İçi"); break;
	case 6 : 
	case 7 : System.out.println("Hafta Sonu");	//bu satırdan sonra kod bitseydi break; yazmamıza gerek yoktu
		break;
	default : System.out.println("Tanımlanan aralıkta bir sayı giriniz !!!");
		System.exit(1); 
	//Eğer yanlış değer girilirse bütün sistemden çıkış yapar,kodun devamı da çalışmaz.
	 	}
	int a = 58 ;
	if (a>43)
		System.out.println("Sivas Kütahya'dan büyüktür.");	 
	}
}
