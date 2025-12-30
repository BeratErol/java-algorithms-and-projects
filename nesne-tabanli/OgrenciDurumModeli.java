

class Ogrenci {
	String isim;
	int yas; 
	boolean yetenekliMi; 
	char cinsiyet; 
	
	public Ogrenci () {
		
	}
	
	public void setYas (int yeniYas) {
		yas = yeniYas;
	}
	
	public void erkek () {
		cinsiyet = 'E';
	}
	
	public void kız () {
		cinsiyet = 'K';
	}
	
	public void yetenekli () {
		yetenekliMi = true;
	}
	
	public void yetenekliDeğil () {
		yetenekliMi = false;
	}
	
	public void setİsim (String yeniİsim) {
		isim = yeniİsim;
	}
}

class TestOgrenci {
	public static void main(String[] args) {
				
		Ogrenci ogrenci1 = new Ogrenci();
		
		ogrenci1.setİsim("Berat");
		ogrenci1.setYas(20);
		ogrenci1.erkek();
		ogrenci1.yetenekli();
		
		System.out.println("İsmi? " + ogrenci1.isim);
		System.out.println("Yasi? " + ogrenci1.yas);
		System.out.println("Yetenekli mi? " + ogrenci1.yetenekliMi);
		System.out.println("Cinsiyeti? " + ogrenci1.cinsiyet);
		
		
		Ogrenci ogrenci2 = new Ogrenci();
		
		ogrenci1.setİsim("Gözde");
		ogrenci1.setYas(20);
		ogrenci1.kız();
		ogrenci1.yetenekli();
		
		System.out.println("\nİsmi? " + ogrenci1.isim);
		System.out.println("Yasi? " + ogrenci1.yas);
		System.out.println("Yetenekli mi? " + ogrenci1.yetenekliMi);
		System.out.println("Cinsiyeti? " + ogrenci1.cinsiyet);
	}
}
