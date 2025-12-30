
public class BankaHesapUygulamasi {

	public static void main(String[] args) {
		Banka2 hesap1 = new Banka2 (2323, "Berat", 3345.5);
		hesap1.paraYatÄ±rma(1000);
		hesap1.kontrol();
		hesap1.paraCekme(500);
		hesap1.kontrol();
		hesap1.goster();
	}
}

class Banka2{
	
	private int hesapNo;
	private String mÃ¼ÅŸteriAdÄ±;
	private static double bankadakiPara; 
	
	Banka2(int hesapNo, String mÃ¼ÅŸteriAdÄ±, double bankadakiPara){
		this.hesapNo= hesapNo;
		this.mÃ¼ÅŸteriAdÄ± = mÃ¼ÅŸteriAdÄ±;
		this.bankadakiPara = bankadakiPara;
	}
	
	 void paraYatÄ±rma(double yatÄ±ralacakPara) {
		bankadakiPara += yatÄ±ralacakPara;
	}
	 
	 void paraCekme(double Ã§ekilecekPara) {
		 bankadakiPara -= Ã§ekilecekPara;
		}
	 
	 void kontrol() {
		 System.out.println("Mevcut bakiye: " + bankadakiPara);
	 }
	 
	 void goster() {
		 System.out.println("\nHesap numarasÄ±: " + hesapNo + "\nMÃ¼ÅŸteri adÄ±: " + mÃ¼ÅŸteriAdÄ± + "\nMevcut bakiye: " + bankadakiPara);
		 
	 }
}

