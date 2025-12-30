
public class CemberNesneYapilandirma {

	// Main metot
	public static void main(String[] args) {
		
		// Yaricapi 1 olan cember olusturma
		CemberModeli cember1 = new CemberModeli();
		System.out.println("Yaricapi " + cember1.yaricap + " olan cemberin alanı: " + cember1.getAlan());
		
		// Yaricapi 25 olan cember olusturma
		CemberModeli cember2 = new CemberModeli(25);
		System.out.println("Yaricapi " + cember2.yaricap + " olan cemberin alanı: " + cember2.getAlan());
		
		// Yaricapi 125 olan cember olusturma
		CemberModeli cember3 = new CemberModeli(125);
		System.out.println("Yaricapi " + cember3.yaricap + " olan cemberin alanı: " + cember3.getAlan());
		
		// Cember yaricapi degistirme
		cember2.yaricap = 100; // veya cember2.setRadius(100);
		System.out.println("Yaricapi " + cember2.yaricap + " olan cemberin alanı: " + cember2.getAlan());
	}
}

// İki yapılandırıcı ile cember sınıfı tanımlama
class CemberModeli { 
	double yaricap;
	
	// Yaricapi 1 olan bir cember yapılandır
	CemberModeli() {
		yaricap = 1;
	}
	
	// Yaricapi belirlenebilen bir cember yapılandır
	CemberModeli(double yeniYaricap){
		yaricap = yeniYaricap;
	}
	
	// Bu cemberin alanını geri döndür
	double getAlan() {
		return yaricap * yaricap * Math.PI;
	}
	
	// Bu cevresini alanını geri döndür
	double getCevre() {
		return 2 * yaricap * Math.PI;
	}
	
	// Bu cember icin yeni bir yaricap ata
	void setYaricap (double yeniYaricap) {
		yaricap = yeniYaricap;
	}
	
} 











