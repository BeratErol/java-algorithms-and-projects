
public class MetotGecersizKilma {

	public static void main(String[] args) {
		
		A1 a = new A1();
		B b = new B ();
		b.p(5);
		a.p(10);
		a.p(10.0);	
	}

}

class B {
	public void p (int i) {
		System.out.println(i*2);
	}
	
}

class A1 extends B {
	// method overriding. B sÄ±nÄ±fÄ±ndaki metotla aynÄ± ve parametresi, deÄŸiÅŸken tipi de aynÄ± olduÄŸu iÃ§in B metodunu geÃ§ersiz kÄ±lar
	public void p (double i) {
		System.out.println(i);
	}
	
}



