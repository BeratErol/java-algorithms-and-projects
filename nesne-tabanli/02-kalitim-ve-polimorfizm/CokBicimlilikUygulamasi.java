public class CokBicimlilikUygulamasi {

    public static void main(String[] args) {
        // Nesneler güncel isimleriyle oluşturuldu
        nesneGoster(new GeometrikCemberSinifi(1, "kirmizi", false));
        nesneGoster(new GeometrikDikdortgenSinifi(1, 1, "siyah", true));
    }

    // Parametre tipi üst sınıf (Soyut) olarak güncellendi
    public static void nesneGoster(SoyutGeometrikSekil nesne) {
        System.out.println(nesne.getOlusturulmaTarihi() + " tarihinde nesne olusturuldu. Rengi " + nesne.getRenk() + " dir.");
    }
} 