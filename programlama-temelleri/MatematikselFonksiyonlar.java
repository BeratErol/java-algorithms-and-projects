
public class MatematikselFonksiyonlar {
public static void main (String[]args) {
	
	System.out.println(Math.pow(2, 3)); 
	System.out.println(Math.pow(4, 0.5));
	System.out.println(Math.pow(2.5, 2));
	System.out.println(Math.pow(2.5, -2));
//pow metodu Math sÄ±nÄ±fÄ±nda tanÄ±mlanmÄ±ÅŸtÄ±r.Syntax(sÃ¶zdizimi) Math.pow(a,b)ÅŸeklindedir. a Ã¼ssÃ¼ b'nin sonucunu geri dÃ¶ndÃ¼rÃ¼r. 
	
	int sayi = (int)Math.pow(2,4);
	System.out.println(sayi);
	
	int sayi2 = (int)(Math.random()*10);
	System.out.println(sayi2);
	
	int sayi3 = (int) (System.currentTimeMillis()%10);
	System.out.println(sayi3);
	
	}
}

