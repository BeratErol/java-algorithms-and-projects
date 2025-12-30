
class sinifA {
    public String metot1() {
        return "Merhaba SinifA";
    }
}

class sinifB extends sinifA implements ArayuzA {
    @Override
    public String metot1() {
        return "Merhaba SinifB";
    }
    
    @Override
    public String metot2() {
        return "Yapılabilir SinifB";
    }
}

interface ArayuzA {
    public abstract String metot2();
}

abstract class SinifD implements ArayuzA {
    @Override
    public String metot2() {
        return "Yapılabilir SinifD";
    }
}

class SinifE extends SinifD {
    @Override
    public String metot2() {
        return "Yapılabilir SinifE";
    }
}

// Ana dosya sınıfın
public class KarsilastirmaliArayuzler {
    public static void main(String[] args) {
        sinifB obje = new sinifB();
        System.out.println(obje.metot1());
        System.out.println(obje.metot2());
    }
}