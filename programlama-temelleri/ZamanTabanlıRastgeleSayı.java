
public class ZamanTabanlıRastgeleSayı {
public static void main (String[] args) {
	
	/*milisaniye 1/1000 demektir bu yüzden 10'a göre modunu istersek tek haneli 100'e göre modunu istersek çift haneli
	verir vb.*/
	//(System.currentTimeMillis()); bize milisaniyede geçen zamana göre rastgele bir sayı verir.
	
	int a = (int)(System.currentTimeMillis()) ; //int aralığına sığmadığı içi -'li verir.
	System.out.println(a);
	
	long b = (long)(System.currentTimeMillis()) ; 
	System.out.println(b);
	
	double c = (double)(System.currentTimeMillis()) ;
	System.out.println(c);
	
	int d = (int)(System.currentTimeMillis() % 10) ; //d=(System.currentTimeMillis() % 10); şeklinde yazamayız tanımlamalıyız.
	System.out.println(d);
	
	int e = (int)(System.currentTimeMillis() / 7 % 10);
	System.out.println(e);
}
}

