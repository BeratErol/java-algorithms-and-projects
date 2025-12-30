
public class GeometrikCemberSinifi extends TemelGeometrikSekil {

	private double yaricap; 
	
	public GeometrikCemberSinifi(){
		
	}
	
	public GeometrikCemberSinifi(double yaricap) {
		this.yaricap = yaricap;
	}
	
	public GeometrikCemberSinifi(double yaricap, String renk, boolean dolgu) {
		super (renk, dolgu);     // Üst sınıf kurucusunu çağırmak için super anahtar kelimesini kullanmamız gerekir ve çağrı, yapıcıdaki ilk ifade olmalıdır.
		this.yaricap = yaricap;
		
	/*   this.yaricap = yaricap;   // Bu kullanım da doğrudur
		 setRenk(renk);
		 setDolgu(dolgu); 
	*/
		
	// this.renk; this.dolgu;   renk ve dolgu private olduğu için yanlış kullanımdır.
		
	}
	
	public double getYaricap() {
		return yaricap;
	}
	
	public void setYaricap(double yaricap) {
		this.yaricap = yaricap;
	}
	
	public double getAlan() {
		return yaricap*yaricap*Math.PI;
	}
	
	public double getCevre() {
		return 2*yaricap*Math.PI;
	}
	
	public double getCap() {
		return 2*yaricap;
	}
	
	public void yazdirCember() {
		System.out.println("Cember, " + super.getOlusturulmaTarihi() + " tarihinde olusturuldu ve yaricapi " + yaricap + " dir.");
		// direkt getOlusturulmaTarihi() desek de olurdu 
	}
	
	public String toString() {
		return super.toString() + "\n yari cap: " + yaricap;  // Method overriding (method geçersiz kılma)
	}
	
	
}


