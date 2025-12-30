
public class StatikVeNesneYapisi {
		int i = 5;
		static int k = 2; 
		
	public static void main(String[] args) {
		A a = new A();  
		int j = a.i;
		a.m1(); 
		
	/*   int j =i;
		 m1();
		ÅŸeklinde yazarsak i ve m1 static olmadÄ±ÄŸÄ± iÃ§in hata verir
		o yÃ¼zden A sÄ±nÄ±fÄ±ndan bir nesne oluÅŸturup o nesne Ã¼zerinden iÅŸlemi gerÃ§ekleÅŸtiririz.    */
	}

	public void m1(){
		i = i + k + m2(i,k);
		System.out.println(i);
	}
	
	public static int m2(int i, int j) {
		return (int)(Math.pow(i,j));
		
	}
	
}

