
public class SoyutSinifPolimorfizm {

	public static void main(String[] args) {
		// Iki geometrik nesne olustur
		TemelGeometrikSekil geoNesne1 = new TemelGeometrikSekildenCember(5);
		TemelGeometrikSekil geoNesne2 = new TemelGeometrikSekildenDikdortgen(5, 3);
		
		System.out.println("Iki nesne esit alana mi sahip? " + esitAlan(geoNesne1, geoNesne2));
		
		// Cemberi goster
		gosterTemelGeometrikSekil(geoNesne1);
		// DiktÃ¶rgeni goster
		gosterTemelGeometrikSekil(geoNesne2);
	}
		
		// Iki geometrik nesnenin alanÄ±nÄ± karÅŸÄ±laÅŸtÄ±ran metot
		public static boolean esitAlan(TemelGeometrikSekil nesne1,TemelGeometrikSekil nesne2) {
			return nesne1.getAlan() == nesne2.getAlan();
		}
		
		// Geometrik nesneyi gÃ¶steren metot
		public static void gosterTemelGeometrikSekil(TemelGeometrikSekil nesne) {
			System.out.println();
			System.out.println("Alan: " + nesne.getAlan());
			System.out.println("Cevre: " + nesne.getCevre());
		}
		
	}



