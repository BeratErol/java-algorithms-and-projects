
public class DiziEnKucukEleman {

	public static void main(String[] args) {
		
		int[] tamsayilar = {2,3,4,5,6,1,7,8,9,11,2,7,32,15,321,-74,8,6,4,1};
		
		int enKucuk = tamsayilar[0];
		for(int i=1; i<tamsayilar.length; i++)
			if(enKucuk>tamsayilar[i])
				enKucuk = tamsayilar[i];
		
		System.out.println("En küçük sayi = " + enKucuk);
	
	
	}	
}

