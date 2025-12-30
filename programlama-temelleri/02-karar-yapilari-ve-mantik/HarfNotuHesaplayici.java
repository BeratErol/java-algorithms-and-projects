import java.util.Scanner;
public class HarfNotuHesaplayici {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Lütfen notunuzu giriniz = ");
	
	int not = input.nextInt();
	
	if (not>=90)
		System.out.println("A , Geçtiniz Tebrikler.");
	
	else if (not>=80)  // else if alt alta da yazılabilir ama bu kullanımı daha iyi
		System.out.println("B , Geçtiniz Tebrikler.");
	
	else if (not>=70)
		System.out.println("C , Geçtiniz Tebrikler.");
	
	else if (not>=60)
		System.out.println("D , Geçtiniz Tebrikler.");
	
	else 
		System.out.println("F , Kaldınız.");
	}
}

