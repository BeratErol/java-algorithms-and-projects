import java.math.*;

public class SiralaKarsilastirilabilirNesne {

	public static void main(String[] args) {
		
		String[] sehirler = {"Savannah", "Boston", "Atlanta", "Tampa"};
		java.util.Arrays.sort(sehirler);
			for(String sehir: sehirler)
				System.out.print(sehir + " ");
			System.out.println();
		
		BigInteger[] buyukSayilar = { new BigInteger("2323231092923992"), new BigInteger("432232323239292"), new BigInteger("54623239292") }	;
			java.util.Arrays.sort(buyukSayilar);
			for(BigInteger sayi: buyukSayilar)
				System.out.print(sayi + " ");
	}

}
