
public class ZamanTabanlıRastgeleSayı {
public static void main (String[] args) {
	
	/*milisaniye 1/1000 demektir bu yÃ¼zden 10'a gÃ¶re modunu istersek tek haneli 100'e gÃ¶re modunu istersek Ã§ift haneli
	verir vb.*/
	//(System.currentTimeMillis()); bize milisaniyede geÃ§en zamana gÃ¶re rastgele bir sayÄ± verir.
	
	int a = (int)(System.currentTimeMillis()) ; //int aralÄ±ÄŸÄ±na sÄ±ÄŸmadÄ±ÄŸÄ± iÃ§i -'li verir.
	System.out.println(a);
	
	long b = (long)(System.currentTimeMillis()) ; 
	System.out.println(b);
	
	double c = (double)(System.currentTimeMillis()) ;
	System.out.println(c);
	
	int d = (int)(System.currentTimeMillis() % 10) ; //d=(System.currentTimeMillis() % 10); ÅŸeklinde yazamayÄ±z tanÄ±mlamalÄ±yÄ±z.
	System.out.println(d);
	
	int e = (int)(System.currentTimeMillis() / 7 % 10);
	System.out.println(e);
}
}

