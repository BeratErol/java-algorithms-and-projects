
public class DiziSıralamaAlgoritması {

	public static void main(String[] args) {
		
		int[] dizi = {-56, 2, 3, 0, 8, 6, 7, 8, 9, -5};
		
		int enKucukIndÄ±s, n = dizi.length;
		int enKucuk, temp;
		
		for(int i=0; i<n; i++) {
			enKucuk= dizi[i];
			enKucukIndÄ±s=i;
			
			for(int j=i; j<n; j++) {
				if(enKucuk>=dizi[j]) {
					enKucuk= dizi[j];
					enKucukIndÄ±s=j; }
			}
			
			temp = dizi[i];
			dizi[i] = dizi[enKucukIndÄ±s];
			dizi[enKucukIndÄ±s] = temp;
		}
		
		for (int i=0; i<n; i++)
			System.out.println(dizi[i] + " ");
		
		
	}

}

