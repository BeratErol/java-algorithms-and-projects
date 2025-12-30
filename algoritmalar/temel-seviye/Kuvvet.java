
public class Kuvvet {
public static void main (String[]args) {
	
	System.out.println(Math.pow(2, 3)); 
	System.out.println(Math.pow(4, 0.5));
	System.out.println(Math.pow(2.5, 2));
	System.out.println(Math.pow(2.5, -2));
//pow metodu Math sınıfında tanımlanmıştır.Syntax(sözdizimi) Math.pow(a,b)şeklindedir. a üssü b'nin sonucunu geri döndürür. 
	
	int sayi = (int)Math.pow(2,4);
	System.out.println(sayi);
	
	int sayi2 = (int)(Math.random()*10);
	System.out.println(sayi2);
	
	int sayi3 = (int) (System.currentTimeMillis()%10);
	System.out.println(sayi3);
	
	}
}
