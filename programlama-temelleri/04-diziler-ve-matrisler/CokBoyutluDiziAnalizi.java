
public class CokBoyutluDiziAnalizi {

	public static void main(String[] args) {
		
		int[][] dizi = { {1,2,3}, 
						 {4,5,6}, 
						 {7,8,9}, 
						 {10,11,12} 
					   };
		
		System.out.println(dizi[3][1]);
		
		int a = dizi.length;
		int b = dizi[0].length;
		int c = dizi[1].length;
		int d = dizi[2].length;
		
		System.out.println(a + "\n"+ b + "\n"+ c + "\n"+ d + "\n");
	}

}

