public class HataYonetimiNesneSayaci {

    public static void main(String[] args) {
        
        try {
            CemberIstisnaIle c1 = new CemberIstisnaIle(5);
            // Bu satır hata fırlatacak ve catch bloğuna atlayacaktır:
            CemberIstisnaIle c2 = new CemberIstisnaIle(-5);
            // c2 hata fırlattığı için c3 hiç çalıştırılamayacaktır:
            CemberIstisnaIle c3 = new CemberIstisnaIle(0);
        }
        catch(IllegalArgumentException ex) {
            System.out.println("Hata Yakalandı: " + ex.getMessage());
        }
  
        // Nesne sayısı sadece başarılı constructor (yapıcı metot) çağrılarında artar.
        System.out.println("Olusturulan nesne sayisi: " + CemberIstisnaIle.getNesneSayisi());
    }
}

class CemberIstisnaIle {
    private double yaricap;
    // static değişken tüm nesneler tarafından ortak paylaşılır
    private static int nesneSayisi = 0;

    public CemberIstisnaIle(double yeniYaricap) {
        if (yeniYaricap >= 0) {
            this.yaricap = yeniYaricap;
            nesneSayisi++; // Sadece geçerli yarıçapta sayaç artar
        } else {
            // Geçersiz yarıçap durumunda istisna fırlatılır
            throw new IllegalArgumentException("Yarıçap negatif olamaz: " + yeniYaricap);
        }
    }

    public static int getNesneSayisi() {
        return nesneSayisi;
    }

    public double getYaricap() {
        return yaricap;
    }
} 