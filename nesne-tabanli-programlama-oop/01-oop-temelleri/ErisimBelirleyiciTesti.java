
class C {
    public int x = 10;
    private int y = 20;
    
    public void yazdir() {
        System.out.println("C sınıfı metodu çalıştı.");
    }
}

public class ErisimBelirleyiciTesti {
    public static void main(String[] args) {
        C nesne = new C(); 
        System.out.println(nesne.x);
        // System.out.println(nesne.y); // Burası hata verir çünkü y private'dır
    }
} 