
public class TestSayici {

	public static void main(String[] args) {
		System.out.println(Sayici.sayac);  // static olmazsa çalışmaz 
		Sayici nesne1 = new Sayici();	// static olmazsa 11 olur
		Sayici nesne2 = new Sayici(); 	// static olmazsa yine 11 olur ve böyle devam eder
	}
}

class Sayici{
	 static int sayac = 10;
	
	 Sayici(){
		sayac++;
		System.out.println(sayac);
		
	}
}

