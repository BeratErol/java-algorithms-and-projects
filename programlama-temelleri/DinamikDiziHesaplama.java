
public class DinamikDiziHesaplama {

	public static void main(String[] args) {
		
		double istediğinDiziİsmi [] = new double [10];
		
		for (int i=0; i<10; i++) 
		{
			
			istediğinDiziİsmi[i]= 10 + 15.2*i;
		
			System.out.println(istediğinDiziİsmi[i]);
			
		}
			
		System.out.println("\n" + istediğinDiziİsmi.length);
	}

}

