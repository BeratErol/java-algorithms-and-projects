
public class BankaHesapUygulamasi {

	public static void main(String[] args) {
		Banka2 hesap1 = new Banka2 (2323, "Berat", 3345.5);
		hesap1.paraYatırma(1000);
		hesap1.kontrol();
		hesap1.paraCekme(500);
		hesap1.kontrol();
		hesap1.goster();
	}
}

class Banka2{
	
	private int hesapNo;
	private String müşteriAdı;
	private static double bankadakiPara; 
	
	Banka2(int hesapNo, String müşteriAdı, double bankadakiPara){
		this.hesapNo= hesapNo;
		this.müşteriAdı = müşteriAdı;
		this.bankadakiPara = bankadakiPara;
	}
	
	 void paraYatırma(double yatıralacakPara) {
		bankadakiPara += yatıralacakPara;
	}
	 
	 void paraCekme(double çekilecekPara) {
		 bankadakiPara -= çekilecekPara;
		}
	 
	 void kontrol() {
		 System.out.println("Mevcut bakiye: " + bankadakiPara);
	 }
	 
	 void goster() {
		 System.out.println("\nHesap numarası: " + hesapNo + "\nMüşteri adı: " + müşteriAdı + "\nMevcut bakiye: " + bankadakiPara);
		 
	 }
}

