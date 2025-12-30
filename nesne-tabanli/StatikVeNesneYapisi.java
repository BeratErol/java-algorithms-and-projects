
public class StatikVeNesneYapisi {
		int i = 5;
		static int k = 2; 
		
	public static void main(String[] args) {
		A a = new A();  
		int j = a.i;
		a.m1(); 
		
	/*   int j =i;
		 m1();
		şeklinde yazarsak i ve m1 static olmadığı için hata verir
		o yüzden A sınıfından bir nesne oluşturup o nesne üzerinden işlemi gerçekleştiririz.    */
	}

	public void m1(){
		i = i + k + m2(i,k);
		System.out.println(i);
	}
	
	public static int m2(int i, int j) {
		return (int)(Math.pow(i,j));
		
	}
	
}

