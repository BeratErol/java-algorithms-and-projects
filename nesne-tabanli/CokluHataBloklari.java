public class CokluHataBloklari {

    public static void main(String[] args) {
        // CemberHataKontrolu sınıfı referans alındı
        try {
            CemberHataKontrolu c1 = new CemberHataKontrolu(5);
        } catch(IllegalArgumentException ex) {
            System.out.println(ex);
        }
        
        try {
            CemberHataKontrolu c2 = new CemberHataKontrolu(-5);
        } catch(IllegalArgumentException ex) {
            System.out.println(ex);
        }
        
        try {
            CemberHataKontrolu c3 = new CemberHataKontrolu(0);
        } catch(IllegalArgumentException ex) {
            System.out.println(ex);
        }
        
        System.out.println("Olusturulan nesne sayisi: " + CemberHataKontrolu.getNesneSayisi());
    }
} 