
public class CokBicimlilikVeArayuzler {

	public static void main(String[] args) {
		Object [] nesneler = {new Kaplan(), new Tavuk(), new Elma()} ;
		for(int i=0; i<nesneler.length; i++) {
			if(nesneler[i] instanceof Yenilebilir)
				System.out.println(((Yenilebilir)nesneler[i]).nasilYenir());
			
			if(nesneler[i] instanceof Hayvan) {
				System.out.println(((Hayvan)nesneler[i]).ses());
			}
		}	
	}
}

abstract class Hayvan {
	// Return  animal sound
	public abstract String ses();
}

class Tavuk extends Hayvan implements Yenilebilir{
	// Override
	public String nasilYenir() {
		return "Tavuk: Kizartma yap";
	}
	// Override
	public String ses() {
		return "Tavuk: git-git-gidak";
	}	
}

class Kaplan extends Hayvan{
	// Override
		public String ses() {
			return "Kaplan: RROOAARR";
		}	
}

abstract class Meyve implements Yenilebilir{
	// Veri alanlarÄ±, yapÄ±cÄ±lar ve metotlar...
}

class Elma extends Meyve {
	// Override
	public String nasilYenir() {
		return "Elma: Elma suyu yapalim";
	}	
}

class Portakal extends Meyve{
	// Override 
	public String nasilYenir() {
		return "Portakal: Portakal suyu yapalim";
	} 
}

interface Yenilebilir{
	// NasÄ±l yenileceÄŸini tanÄ±mla
	public abstract String nasilYenir();
}












