
public class OgrenciBilgiSistemi {

	public static void main(String[] args) {
		Ogrenci3 ogrenci1 = new Ogrenci3 (558, "GÃ¶zde", 5000f);
		Ogrenci3 ogrenci2 = new Ogrenci3 (278, "Berat", 4000f, "Algoritma");
		ogrenci1.bilgileriGoster();
		ogrenci2.bilgileriGoster();
	}
}

class Ogrenci3 {
	int ogrenciNo;
	String isim;
	float burs;
	String ders;
	
	Ogrenci3 (int ogrenciNo, String isim, float burs, String ders){
		this.ogrenciNo=ogrenciNo;
		this.isim=isim;
		this.burs=burs;
		this.ders=ders;
		}
	
	Ogrenci3 (int ogrenciNo, String isim, float burs){
		this(ogrenciNo, isim, burs, "Matematik");
	}
	
	public void bilgileriGoster() { /* yukardan gelen ÅŸeylerde void yok ama aÅŸaÄŸÄ±dan bilgi veriyorsak void var , 
	ek olarak return varsa genel olarak void olmaz */
		System.out.println(ogrenciNo + " " + isim + " " + burs + " " + ders);
	}
	
}
