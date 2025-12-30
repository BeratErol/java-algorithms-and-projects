public abstract class TemelGeometrikSekil {

	private String renk = "beyaz";
	private boolean dolgu;
	private java.util.Date olusturulmaTarihi;
	
	protected TemelGeometrikSekil(){
		olusturulmaTarihi = new java.util.Date();
	}
	
	protected TemelGeometrikSekil(String renk, boolean dolgu){
		this.renk = renk;
		this.dolgu = dolgu;
		olusturulmaTarihi = new java.util.Date(); 
	}
	
	public String getRenk() {
		return renk;
	}
	
	public void setRenk(String renk) {
		this.renk = renk;
	}
	
	public boolean isDolgu() {
		return dolgu;
	}
	
	public void setDolgu(boolean dolgu) {
		this.dolgu = dolgu;
	}
	
	public java.util.Date getOlusturulmaTarihi(){
	  return olusturulmaTarihi;
	}
	
	public String toString() {
		return "Oluşturulma Tarihi: " + olusturulmaTarihi + "\nrenk: " + renk + " ve dolgu: " + dolgu;
	}
	
	// Soyut metot getAlan
	public abstract double getAlan();
	
	// Soyut metot getCevre
	public abstract double getCevre();
	
}
