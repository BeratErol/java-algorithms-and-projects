
public class CokBicimlilikUygulamasi {

	public static void main(String[] args) {
		
		nesneGoster(new TemelGeometrikSekildenCember(1, "kirmizi", false));
		nesneGoster(new TemelGeometrikSekildenDikdortgen(1, 1, "siyah", true));

	}

	public static void nesneGoster(TemelGeometrikSekil nesne) {
		System.out.println(nesne.getOlusturulmaTarihi() + " tarihinde nesne olusturuldu. Rengi " + nesne.getRenk() + " dir.");
		
	}
	
}

