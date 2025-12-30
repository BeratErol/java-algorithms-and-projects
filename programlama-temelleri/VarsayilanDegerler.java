public class VarsayilanDegerler {
    private boolean x; // Varsayılan değer: false
    
    public static void main(String[] args) {
        VarsayilanDegerler nesne = new VarsayilanDegerler();
        
        System.out.println("x değeri: " + nesne.x);
        System.out.println("Dönüş değeri: " + nesne.convert());
    }
        
    private int convert() {
        return x ? 1 : -1;
    }
} 