import java.util.Scanner;
public class HaftaIciSonuKontrolu {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Gun icin bir sayi giriniz (1-7) = ");
	int gun = input.nextInt();
	
	switch (gun) {  // int'te tanÄ±mladÄ±ÄŸÄ±n deÄŸiÅŸkenle switch iÃ§indeki deÄŸiÅŸken aynÄ± olmalÄ± 
	case 1 : 
	case 2 :
	case 3 :
	case 4 :
	case 5 : System.out.println("Hafta Ä°Ã§i"); break;
	case 6 : 
	case 7 : System.out.println("Hafta Sonu");	//bu satÄ±rdan sonra kod bitseydi break; yazmamÄ±za gerek yoktu
		break;
	default : System.out.println("TanÄ±mlanan aralÄ±kta bir sayÄ± giriniz !!!");
		System.exit(1); 
	//EÄŸer yanlÄ±ÅŸ deÄŸer girilirse bÃ¼tÃ¼n sistemden Ã§Ä±kÄ±ÅŸ yapar,kodun devamÄ± da Ã§alÄ±ÅŸmaz.
	 	}
	int a = 58 ;
	if (a>43)
		System.out.println("Sivas KÃ¼tahya'dan bÃ¼yÃ¼ktÃ¼r.");	 
	}
}

