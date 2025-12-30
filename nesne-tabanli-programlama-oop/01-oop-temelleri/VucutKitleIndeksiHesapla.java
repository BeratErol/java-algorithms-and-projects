
public class VucutKitleIndeksiHesapla {

	public static void main(String[] args) {
		
		BKI bki1 = new BKI("Berat Erol", 20, 76, 1.84);
		System.out.println(bki1.getIsim() + " icin BKI: " + bki1.getBKI() + " " + bki1.getDurum());
		
		BKI bki2 = new BKI("Gözde Duygu Polat", 58, 1.63);
		System.out.println(bki2.getIsim() + " icin BKI: " + bki2.getBKI() + " " + bki2.getDurum());
	}

}

class BKI {
	
	private String isim;
	private int yas;
	private double agirlik;
	private double boy;
	
	 BKI(String isim, int yas, double agirlik, double boy) {
		this.isim = isim;
		this.yas = yas;
		this.agirlik = agirlik;
		this.boy = boy;
	}
	
	 BKI(String isim,double agirlik,double boy) {
		this(isim,20,agirlik,boy);
	} 
	
	public double getBKI() {
		double bki = agirlik / (boy*boy);
		return Math.round(bki*100) / 100.0;
	}
	
	public String getDurum() {
		double bki = getBKI();
		if (bki<18.5)
			return "Zayif";
		else if (bki<25)
			return "Normal";
		else if (bki<30)
			return "Kilolu";
		else 
			return "Obez";
	 }
	
	public String getIsim() {
		return isim;
	}
	
	public int getYas() {
		return yas;
	}
	
	public double getAgirlik() {
		return agirlik;
	}
	
	public double getBoy() {
		return boy;
	}
}


















