
public class HacimHesaplamaModeli {

	public static void main(String[] args) {
		Kutu kutu1 = new Kutu (3.0, 4.0, 5.0);
		kutu1.getHacim();

	}

}

class Kutu{
	double en;
	double boy;
	double yÃ¼kseklik;
	
	Kutu(double en, double boy, double yÃ¼kseklik) {
		this.en = en;
		this.boy = boy;
		this.yÃ¼kseklik = yÃ¼kseklik;
	}
	
	public void getHacim() {
		double hacim = en * boy * yÃ¼kseklik;
		System.out.println("eni " + en + ", boyu " + boy + ", yÃ¼kseliÄŸi " + yÃ¼kseklik + " olan kutunun hacmi: " + hacim);
	}

}

