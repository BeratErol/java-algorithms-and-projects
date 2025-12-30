
public class Test3 {

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
	// method overloading. B sınıfındaki metotla aynı, parametresi de aynı fakat değişken tipi farklı old. için B metodunu aşırı yükler.
	public void p(int i) {
		System.out.println(i);
	}
	
}