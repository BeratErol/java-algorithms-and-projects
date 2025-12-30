
public class Test2 {

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
	// method overriding. B sınıfındaki metotla aynı ve parametresi, değişken tipi de aynı olduğu için B metodunu geçersiz kılar
	public void p (double i) {
		System.out.println(i);
	}
	
}


