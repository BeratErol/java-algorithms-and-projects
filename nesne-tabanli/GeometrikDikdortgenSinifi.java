
public class GeometrikDikdortgenSinifi extends TemelGeometrikSekil {

	private double genislik;
	private double yukseklik;
	
	public GeometrikDikdortgenSinifi(){
		
	}
	
	public GeometrikDikdortgenSinifi(double genislik, double yukseklik){
		this.genislik = genislik;
		this.yukseklik = yukseklik;
	}
	
	public GeometrikDikdortgenSinifi(double genislik, double yukseklik, String renk, boolean dolgu){
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
