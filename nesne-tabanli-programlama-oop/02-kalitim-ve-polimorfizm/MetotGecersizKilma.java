public class MetotGecersizKilma {

    public static void main(String[] args) {
        
        A_Ozel a = new A_Ozel();
        B_Ozel b = new B_Ozel();
        
        b.p(5);      // B sınıfındaki p(int) çalışır -> Çıktı: 10
        a.p(10);     // A_Ozel sınıfında geçersiz kılınan p(int) çalışır -> Çıktı: 10.0 (çünkü double yazdırıyor)
        a.p(10.5);   // A_Ozel sınıfındaki p(double) çalışır -> Çıktı: 10.5
    }
}

class B_Ozel {
    public void p(int i) {
        System.out.println(i * 2);
    }
}

class A_Ozel extends B_Ozel {
    
    // OVERRIDING: B_Ozel içindeki p(int) metodunu tamamen aynı imza ile geçersiz kılıyoruz
    @Override
    public void p(int i) {
        System.out.println((double) i);
    }
    
    // OVERLOADING: Aynı isimli metodun farklı parametre (double) alan versiyonu
    public void p(double i) {
        System.out.println(i);
    }
} 