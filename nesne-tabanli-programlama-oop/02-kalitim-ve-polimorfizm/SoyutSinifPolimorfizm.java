public class SoyutSinifPolimorfizm {

    public static void main(String[] args) {
        // Polimorfizm: Üst sınıf referansı, alt sınıf nesnesi
        SoyutGeometrikSekil geoNesne1 = new GeometrikCemberSinifi(5);
        SoyutGeometrikSekil geoNesne2 = new GeometrikDikdortgenSinifi(5, 3);
        
        System.out.println("Iki nesne esit alana mi sahip? " + esitAlan(geoNesne1, geoNesne2));
        
        System.out.print("Cember Bilgileri: ");
        gosterTemelGeometrikSekil(geoNesne1);
        
        System.out.print("\nDikdortgen Bilgileri: ");
        gosterTemelGeometrikSekil(geoNesne2);
    }
        
    // Herhangi bir SoyutGeometrikSekil turunu kabul eder
    public static boolean esitAlan(SoyutGeometrikSekil nesne1, SoyutGeometrikSekil nesne2) {
        return nesne1.getAlan() == nesne2.getAlan();
    }
    
    public static void gosterTemelGeometrikSekil(SoyutGeometrikSekil nesne) {
        System.out.println("Alan: " + nesne.getAlan() + " | Cevre: " + nesne.getCevre());
    }
} 