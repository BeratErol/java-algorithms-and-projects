
public class NesneVeStatikSayac {

	public static void main(String[] args) {
	T2 t1 = new T2(); 	// t1 nesnesi iÃ§in T2() bir kez Ã§alÄ±ÅŸÄ±yor
	T2 t2 = new T2();	// t2 nesnesi iÃ§in T2() bir kez Ã§alÄ±ÅŸÄ±yor
	T2 t3 = new T2();
	System.out.println("t1's i = " + t1.i + ", and j = " + t1.j);
	System.out.println("t2's i = " + t2.i + ", and j = " + t2.j);
	
	}
}

class T2 {
	static int i = 0;
	int j = 0;
	
	T2(){
		i++;
		j++;	// j++; desek de static olmadÄ±ÄŸÄ± iÃ§in 1 olarak kalÄ±r.
	}
	
}



