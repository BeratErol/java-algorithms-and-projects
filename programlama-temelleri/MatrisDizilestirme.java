
public class MatrisDizilestirme–dev5c {

	public static void main(String[] args) {
		
		int[][] dizi = {
                {100, 20, 300},
                {44, -55, 666},
                {7, 80, 9},
                {10, 11, 12}
        };

		int[] yenidizi = new int [12];
		
		int dÃ¶ngÃ¼sayaci = 0;
		for(int i=0; i<dizi.length; i++) {
			for(int j=0; j<dizi.length-1; j++) {
				yenidizi[dÃ¶ngÃ¼sayaci] = dizi[i][j];
				dÃ¶ngÃ¼sayaci++;
			}
		}
		
		for(int i=0; i<yenidizi.length; i++) {
			if(i!=11) 
			System.out.print(yenidizi[i]+", ");
			else
		System.out.print(yenidizi[i]);
		}
		
		
	}

}

