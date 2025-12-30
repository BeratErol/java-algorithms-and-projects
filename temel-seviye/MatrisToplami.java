
public class MatrisToplami {
	public static void main(String[] args) {
		// matris olusturma
		int [][] a = { {1,2,3}, {4,5,6}, {7,8,9}, {10,11,12} };
		int [][] b = { {1,2,3}, {4,5,6}, {7,8,9}, {10,11,12} };
		
		// toplam sonuc matrisi tanimlama
		int[][] c = new int [4][3];
		
		// matris toplami icin ic ice dongu
		for (int i=0; i<4; i++) {
			for (int j=0; j<3; j++) {
				c[i][j] = a[i][j] + b[i][j]; //carpim da olur
				System.out.print(c[i][j] + " ");
				// System.out.printf("%2d ",c[i][j]); 
			}
			System.out.println();
		}
		
	}

}
