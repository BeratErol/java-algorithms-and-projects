
public class DiziSiralamaAlgoritmasi {

	public static void main(String[] args) {
		
		int[] dizi = {-56, 2, 3, 0, 8, 6, 7, 8, 9, -5};
		
		int enKucukIndıs, n = dizi.length;
		int enKucuk, temp;
		
		for(int i=0; i<n; i++) {
			enKucuk= dizi[i];
			enKucukIndıs=i;
			
			for(int j=i; j<n; j++) {
				if(enKucuk>=dizi[j]) {
					enKucuk= dizi[j];
					enKucukIndıs=j; }
			}
			
			temp = dizi[i];
			dizi[i] = dizi[enKucukIndıs];
			dizi[enKucukIndıs] = temp;
		}
		
		for (int i=0; i<n; i++)
			System.out.println(dizi[i] + " ");
		
		
	}

}

