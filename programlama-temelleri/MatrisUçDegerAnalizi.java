
public class MatrisUçDegerAnalizi {

	public static void main(String[] args) {
		
		int[][] dizi = {
                {100, 20, 300},
                {44, -55, 666},
                {7, 80, 9},
                {10, 11, 12}
        };

		int enKucuk = dizi[0][0];
		int satir = 0;
		int sutun = 0;
		
		for(int i=0; i<dizi.length; i++) {
			for(int j=0; j<dizi.length-1; j++) {
				if(enKucuk>dizi[i][j]) {
					enKucuk=dizi[i][j];
					satir = i;
					sutun = j;
				}
			}
		}
		
		System.out.println("En kÃ¼Ã§Ã¼k eleman: " + enKucuk + " ve indisleri: SatÄ±r " + satir + ", SÃ¼tun " + sutun);
		
		
		int enBuyuk = dizi[0][0];
		int satir2 = 0;
		int sutun2 = 0;
		
		for(int i=0; i<dizi.length; i++) {
			for(int j=0; j<dizi.length-1; j++) {
				if(enBuyuk<dizi[i][j]) {
					enBuyuk=dizi[i][j];
					satir2 = i;
					sutun2 = j;
				}
			}
		}
		
		System.out.println("En bÃ¼yÃ¼k eleman: " + enBuyuk + " ve indisleri: SatÄ±r " + satir2 + ", SÃ¼tun " + sutun2);
		
	}

}

