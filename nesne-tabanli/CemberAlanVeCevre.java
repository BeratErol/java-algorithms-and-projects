public class CemberAlanVeCevre {

    public static void main(String[] args) {
        
        // Yaricapi 1 olan cember olusturma
        BasitCember cember1 = new BasitCember();
        System.out.println("Yaricapi " + cember1.yaricap + " olan cemberin alanı: " + cember1.getAlan());
        
        // Yaricapi 25 olan cember olusturma
        BasitCember cember2 = new BasitCember(25);
        System.out.println("Yaricapi " + cember2.yaricap + " olan cemberin alanı: " + cember2.getAlan());
        
        // Cember yaricapi degistirme
        cember2.setYaricap(100); 
        System.out.println("Yaricapi " + cember2.yaricap + " olan yeni alan: " + cember2.getAlan());
    }
}

// Yardimci sinif: BasitCember
class BasitCember {
    double yaricap;
    
    BasitCember() {
        yaricap = 1;
    }
    
    BasitCember(double yaricap){
        this.yaricap = yaricap;
    }
    
    double getAlan() {
        return yaricap * yaricap * Math.PI;
    }
    
    double getCevre() {
        return 2 * yaricap * Math.PI;
    }
    
    void setYaricap(double yeniYaricap) {
        yaricap = yeniYaricap;
    }
} 