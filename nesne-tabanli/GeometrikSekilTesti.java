
public class GeometrikSekilTesti {

	public static void main(String[] args) {
		
		TemelGeometrikSekildenCember cember = new TemelGeometrikSekildenCember(1);
		System.out.println("Bir cember: " + cember.toString());
		System.out.println("Renk: " + cember.getRenk());
		System.out.println("Yaricap: " + cember.getYaricap());
		System.out.println("Alan: " + cember.getAlan());
		System.out.println("Cap: " + cember.getCap());
		cember.yazdirCember();
		
		
		TemelGeometrikSekildenDikdortgen dikdortgen = new TemelGeometrikSekildenDikdortgen(2, 4);
		System.out.println("\nBir dikdortgen: " + dikdortgen.toString());
		System.out.println("Alan: " + dikdortgen.getAlan());
		System.out.println("Cevre: " + dikdortgen.getCevre());
		
	}

}

