public class GeometrikSekilTesti {

    public static void main(String[] args) {
        GeometrikCemberSinifi cember = new GeometrikCemberSinifi(1);
        System.out.println("Bir cember: " + cember.toString());
        cember.yazdirCember();
        
        GeometrikDikdortgenSinifi dikdortgen = new GeometrikDikdortgenSinifi(2, 4);
        System.out.println("\nBir dikdortgen: " + dikdortgen.toString());
        System.out.println("Alan: " + dikdortgen.getAlan());
    }
} 