
public class OgrenciKayitSistemi {

	public static void main(String[] args) {
		Ogrenci2 nesne1 = new Ogrenci2(278, "Berat Erol", 4000f);
		Ogrenci2 nesne2 = new Ogrenci2(558, "GÃ¶zde Duygu Polat", 5000f);
		nesne1.bilgileriGoster();
		nesne2.bilgileriGoster();
	}

}

 class Ogrenci2{
	int okulNo;
	String isim;
	float burs;
	
	Ogrenci2(int o, String i, float b) {
		okulNo = o;
		isim = i;
		burs = b;	
	}
	
	void bilgileriGoster() {  
		System.out.println(okulNo + " " + isim + " " + burs);
	}
	
}
