
public class StatikVeNesneYapisi {
    int i = 5; // Nesne değişkeni (Instance variable)
    static int k = 2; // Statik değişken (Class variable)
    
    public static void main(String[] args) {
        StatikVeNesneYapisi obj = new StatikVeNesneYapisi();  
        
        // Statik olmayan i'ye nesne üzerinden erişiyoruz
        int j = obj.i; 
        
        // Statik olmayan m1'i nesne üzerinden çağırıyoruz
        obj.m1(); 
        
        /* Not: Direkt i = 10; veya m1(); yazsaydık hata alırdık. 
           Çünkü static olan main metodu, static olmayan üyeleri nesnesiz göremez.
        */
    }

    public void m1() {
        // i: Nesne değişkeni, k: Statik değişken, m2: Statik metot
        // Statik olmayan bir metot içinde her ikisine de erişilebilir.
        i = i + k + m2(i, k);
        System.out.println("Sonuç i: " + i);
    }
    
    public static int m2(int i, int j) {
        return (int)(Math.pow(i, j));
    }
}