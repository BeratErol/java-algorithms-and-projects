
public class GeometrikCemberSinifi extends TemelGeometrikSekil {

	private double yaricap; 
	
	public TemelGeometrikSekildenCember(){
		
	}
	
	public TemelGeometrikSekildenCember(double yaricap) {
		this.yaricap = yaricap;
	}
	
	public TemelGeometrikSekildenCember(double yaricap, String renk, boolean dolgu) {
		super (renk, dolgu);     // Ãœst sÄ±nÄ±f kurucusunu Ã§aÄŸÄ±rmak iÃ§in super anahtar kelimesini kullanmamÄ±z gerekir ve Ã§aÄŸrÄ±, yapÄ±cÄ±daki ilk ifade olmalÄ±dÄ±r.
		this.yaricap = yaricap;
		
	/*   this.yaricap = yaricap;   // Bu kullanÄ±m da doÄŸrudur
		 setRenk(renk);
		 setDolgu(dolgu); 
	*/
		
	// this.renk; this.dolgu;   renk ve dolgu private olduÄŸu iÃ§in yanlÄ±ÅŸ kullanÄ±mdÄ±r.
		
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
		return super.toString() + "\n yari cap: " + yaricap;  // Method overriding (method geÃ§ersiz kÄ±lma)
	}
	
	
}


