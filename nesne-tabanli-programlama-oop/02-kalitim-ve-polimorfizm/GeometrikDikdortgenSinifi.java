public class GeometrikDikdortgenSinifi extends SoyutGeometrikSekil {

    private double genislik;
    private double yukseklik;
    
    public GeometrikDikdortgenSinifi(){}
    
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
    
    @Override
    public double getAlan() { return genislik * yukseklik; }
    
    @Override
    public double getCevre() { return 2 * (genislik + yukseklik); }
    
    // Getter ve Setterlar...
    public double getGenislik() { return genislik; }
    public void setGenislik(double genislik) { this.genislik = genislik; }
    public double getYukseklik() { return yukseklik; }
    public void setYukseklik(double yukseklik) { this.yukseklik = yukseklik; }
} 