public class MetotIleSayiToplama {
    // Mevcut top metodun ve main metodun burada kalsın...
    public static int top(int i1, int i2) {
        int sonuc = 0;
        for(int i=i1; i<=i2; i++)
            sonuc += i ;
        return sonuc;
    }
    
    public static void main(String[] args) {
        System.out.println("1'den 10'a kadar toplam " + top(1,10));
        System.out.println("20'den 37'ye kadar toplam " + top(20,37));
        System.out.println("35'den 49'a kadar toplam " + top(35,49));
        
        int z = top(2,5);
        System.out.println(z);
        
        System.out.println(TestEnBuyuk.enBuyuk(9,2));
    }
}

// Hata veren eksik sınıf tanımı:
class TestEnBuyuk {
    public static int enBuyuk(int n1, int n2) {
        if (n1 > n2)
            return n1;
        else
            return n2;
    }
} 