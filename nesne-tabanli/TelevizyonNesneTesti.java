
public class TelevizyonNesneTesti {

	public static void main(String[] args) {
		
		TV tv1 = new TV();
		tv1.ac();
		tv1.setKanal(2);
		tv1.kanalAsagi();
		tv1.kanalAsagi();
		tv1.setSes(3);
		
		TV tv2 = new TV();
		tv2.ac();
		tv2.setKanal(119);
		tv2.kanalYukari();
		tv2.kanalYukari();
		tv2.sesArtir();
		
		System.out.println("tv1'nin kanalÄ±: " + tv1.kanal + " ve ses seviyesi " + tv1.sesSeviyesi);
		System.out.println("tv2'nin kanalÄ±: " + tv2.kanal + " ve ses seviyesi " + tv2.sesSeviyesi);

	}

}

 
