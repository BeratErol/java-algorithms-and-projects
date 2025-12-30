
public class DiziİstatistikHesaplayıcı {

	public static void main(String[] args) {
		
		double[] benimDizi = {30.8, 5.2, 20, 10, 30.8, 29, 30.8};
		
		// dizi elemanlarÄ±nÄ± toplama
		double toplam =0;
		for (int i=0; i<benimDizi.length; i++)
			toplam += benimDizi[i];
		
		System.out.println("sonuc: " + toplam);

		// en buyuk elemanÄ± bulma
		double enBuyuk = benimDizi[0];
		
		for (int i=0; i<benimDizi.length; i++) {
			if (benimDizi[i]>enBuyuk)
				enBuyuk=benimDizi[i];
		}
		
		System.out.println(enBuyuk);
		
		// en buyuk elemanÄ±, en kucuk indiste bulma
		double enBuyuk2 = benimDizi[0];
		int enBuyukIndeks = 0;
		
		for (int i = 1; i < benimDizi.length; i++){
			if (benimDizi[i] > enBuyuk2){
				enBuyuk2 = benimDizi[i];
				enBuyukIndeks = i;
			}
		} 
		System.out.println(enBuyuk); 
		System.out.println(enBuyukIndeks);	
	}

}

