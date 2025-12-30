
public class MetotAsiriYukleme {

	public static void main(String[] args) {
		
		A2 a = new A2();
		a.p(10);
		a.p(10.0);	
	}

}

class B1 {
	public void p (double i) {
		System.out.println(i*2);
	}
	
}

class A2 extends B1 {
	// method overloading. B sÄ±nÄ±fÄ±ndaki metotla aynÄ±, parametresi de aynÄ± fakat deÄŸiÅŸken tipi farklÄ± old. iÃ§in B metodunu aÅŸÄ±rÄ± yÃ¼kler.
	public void p(int i) {
		System.out.println(i);
	}
	
}
