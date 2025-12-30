
public class TipDonusumuVeTasma {
    public static void main (String[] args) {
    	float b = 23.58f ;
    	//int a=b; //derleme hatasÄ±
    	int a = (int)b ;
    	System.out.println(b);
    	System.out.println(a);
    	
    	//Overflow(TaÅŸma)
    	int c = -360;
    	byte d = (byte)c ;
    	System.out.println(c);
    	System.out.println(d);
    	
    	
    }
	
	
}

