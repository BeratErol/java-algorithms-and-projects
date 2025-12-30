
public class FormatliCiktiYazdirma {
	public static void main(String[] args) {
		
		// tablonun baÅŸlÄ±ÄŸÄ±nÄ± gÃ¶sterme
		System.out.printf("%-10s%-10s%-10s%-10s%-10s \n", "Derece","Radyan","Sinus","Cosinus","Tanjant");
		
		// 30 derece iÃ§in deÄŸer gÃ¶sterimi
		int derece = 30;
		double radyan = Math.toRadians(derece);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f \n" ,derece,radyan,Math.sin(radyan),Math.cos(radyan),Math.tan(radyan));

		// 60 derece iÃ§in deÄŸer gÃ¶sterimi
		derece = 60;
		radyan = Math.toRadians(derece);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f" ,derece,radyan,Math.sin(radyan),Math.cos(radyan),Math.tan(radyan) );
		
	}

}

