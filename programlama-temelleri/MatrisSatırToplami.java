
public class dizilerÖdev6 {

	public static void main(String[] args) {
		
		int[][] dizi = {
                {100, 20, 300},
                {44, 55, 666},
                {7, 80, 9},
                {10, 11, 12}
        };

		int[][] yenidizi = new int [4][4];
		
		for(int i=0; i<dizi.length; i++) {
			for(int j=0; j<dizi.length; j++) {
				
				if(j<dizi.length-1)
				yenidizi[i][j]=dizi[i][j];
				
				else
				yenidizi[i][j]=yenidizi[i][0]+yenidizi[i][1]+yenidizi[i][2];
				
			}
		}		
			
		for(int i=0; i<yenidizi.length; i++) {
				for(int j=0; j<yenidizi.length; j++) {
				System.out.print(yenidizi[i][j] + " ");		
			}
				System.out.println(" ");
		}
		
		
	}

}
