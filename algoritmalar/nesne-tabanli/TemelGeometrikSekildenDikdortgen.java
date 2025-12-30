
public class TemelGeometrikSekildenDikdortgen extends TemelGeometrikSekil {

	private double genislik;
	private double yukseklik;
	
	public TemelGeometrikSekildenDikdortgen(){
		
	}
	
	public TemelGeometrikSekildenDikdortgen(double genislik, double yukseklik){
		this.genislik = genislik;
		this.yukseklik = yukseklik;
	}
	
	public TemelGeometrikSekildenDikdortgen(double genislik, double yukseklik, String renk, boolean dolgu){
		this.genislik = genislik;
		this.yukseklik = yukseklik;
		setRenk(renk);
		setDolgu(dolgu);
	}
	
	public double getGenislik() {
		return genislik;
	}
	
	public void setGenislik(double genislik) {
		this.genislik = genislik;
	}
	
	public double getYukseklik() {
		return yukseklik;
	}
	
	public void setYukseklik(double yukseklik) {
		this.yukseklik = yukseklik;
	}
	
	public double getAlan() {
		return genislik*yukseklik;
	}
	
	public double getCevre() {
		return 2*(genislik+yukseklik);
	}
	
}