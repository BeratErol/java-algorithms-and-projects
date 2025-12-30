public class GeometrikCemberSinifi extends SoyutGeometrikSekil {

    private double yaricap; 
    
    public GeometrikCemberSinifi(){}
    
    public GeometrikCemberSinifi(double yaricap) {
        this.yaricap = yaricap;
    }
    
    public GeometrikCemberSinifi(double yaricap, String renk, boolean dolgu) {
        super(renk, dolgu); // Üst sınıfın (SoyutGeometrikSekil) kurucusu
        this.yaricap = yaricap;
    }
    
    public double getYaricap() { return yaricap; }
    public void setYaricap(double yaricap) { this.yaricap = yaricap; }
    
    @Override
    public double getAlan() { return yaricap * yaricap * Math.PI; }
    
    @Override
    public double getCevre() { return 2 * yaricap * Math.PI; }
    
    public double getCap() { return 2 * yaricap; }
    
    public void yazdirCember() {
        System.out.println("Cember, " + getOlusturulmaTarihi() + " tarihinde olusturuldu ve yaricapi " + yaricap + " dir.");
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n yari cap: " + yaricap; 
    }
} 