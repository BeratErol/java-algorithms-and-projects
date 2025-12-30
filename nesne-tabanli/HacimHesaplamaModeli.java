
public class TestKutu {

	public static void main(String[] args) {
		Kutu kutu1 = new Kutu (3.0, 4.0, 5.0);
		kutu1.getHacim();

	}

}

class Kutu{
	double en;
	double boy;
	double yükseklik;
	
	Kutu(double en, double boy, double yükseklik) {
		this.en = en;
		this.boy = boy;
		this.yükseklik = yükseklik;
	}
	
	public void getHacim() {
		double hacim = en * boy * yükseklik;
		System.out.println("eni " + en + ", boyu " + boy + ", yükseliği " + yükseklik + " olan kutunun hacmi: " + hacim);
	}

}
