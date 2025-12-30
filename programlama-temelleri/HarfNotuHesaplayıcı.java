import java.util.Scanner;
public class HarfNotuHesaplayıcı {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("LÃ¼tfen notunuzu giriniz = ");
	
	int not = input.nextInt();
	
	if (not>=90)
		System.out.println("A , GeÃ§tiniz Tebrikler.");
	
	else if (not>=80)  // else if alt alta da yazÄ±labilir ama bu kullanÄ±mÄ± daha iyi
		System.out.println("B , GeÃ§tiniz Tebrikler.");
	
	else if (not>=70)
		System.out.println("C , GeÃ§tiniz Tebrikler.");
	
	else if (not>=60)
		System.out.println("D , GeÃ§tiniz Tebrikler.");
	
	else 
		System.out.println("F , KaldÄ±nÄ±z.");
	}
}

