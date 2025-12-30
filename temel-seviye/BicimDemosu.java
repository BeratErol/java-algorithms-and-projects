
public class BicimDemosu {
	public static void main(String[] args) {
		
		// tablonun başlığını gösterme
		System.out.printf("%-10s%-10s%-10s%-10s%-10s \n", "Derece","Radyan","Sinus","Cosinus","Tanjant");
		
		// 30 derece için değer gösterimi
		int derece = 30;
		double radyan = Math.toRadians(derece);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f \n" ,derece,radyan,Math.sin(radyan),Math.cos(radyan),Math.tan(radyan));

		// 60 derece için değer gösterimi
		derece = 60;
		radyan = Math.toRadians(derece);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f" ,derece,radyan,Math.sin(radyan),Math.cos(radyan),Math.tan(radyan) );
		
	}

}
