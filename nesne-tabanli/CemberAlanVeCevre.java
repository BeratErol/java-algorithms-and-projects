public class CemberAlanVeCevre {

	// Main metot
	public static void main(String[] args) {
		
		// Yaricapi 1 olan cember olusturma
		BasitCember cember1 = new BasitCember();
		System.out.println("Yaricapi " + cember1.yaricap + " olan cemberin alanı: " + cember1.getAlan());
		
		// Yaricapi 25 olan cember olusturma
		BasitCember cember2 = new BasitCember(25);
		System.out.println("Yaricapi " + cember2.yaricap + " olan cemberin alanı: " + cember2.getAlan());
		
		// Yaricapi 125 olan cember olusturma
		BasitCember cember3 = new BasitCember(125);
		System.out.println("Yaricapi " + cember3.yaricap + " olan cemberin alanı: " + cember3.getAlan());
		
		// Cember yaricapi degistirme
		cember2.yaricap = 100; // veya cember2.setRadius(100);
		System.out.println("Yaricapi " + cember2.yaricap + " olan cemberin alanı: " + cember2.getAlan());
	}
	
	double yaricap;
	
	// Yaricapi 1 olan bir cember yapılandır
	BasitCember2() {
		yaricap = 1;
	}
	
	// Yaricapi belirlenebilen bir cember yapılandır
	BasitCember2(double yaricap){
		this.yaricap = yaricap;
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


