class Ogrenci {
    String isim;
    int yas; 
    boolean yetenekliMi; 
    char cinsiyet; 
    
    public Ogrenci() {}
    
    public void setYas(int yeniYas) { yas = yeniYas; }
    public void erkek() { cinsiyet = 'E'; }
    public void kiz() { cinsiyet = 'K'; }
    public void yetenekli() { yetenekliMi = true; }
    public void yetenekliDegil() { yetenekliMi = false; }
    public void setIsim(String yeniIsim) { isim = yeniIsim; }
}

public class OgrenciDurumModeli { // Dosya ismiyle uyumlu public class
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.setIsim("Berat");
        ogrenci1.setYas(20);
        ogrenci1.erkek();
        ogrenci1.yetenekli();
        
        System.out.println("Ogrenci 1: " + ogrenci1.isim + ", Cinsiyet: " + ogrenci1.cinsiyet);
        
        Ogrenci ogrenci2 = new Ogrenci();
        ogrenci2.setIsim("Gozde"); // Burada ogrenci2 kullanılmalıydı
        ogrenci2.setYas(20);
        ogrenci2.kiz();
        ogrenci2.yetenekli();
        
        System.out.println("Ogrenci 2: " + ogrenci2.isim + ", Cinsiyet: " + ogrenci2.cinsiyet);
    }
} 