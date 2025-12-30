public class CemberIstisnaIle {
		// Cemberin yaricapi
		private double yaricap;
		
		// Olusturulan nesne sayisi
		private static int nesneSayisi = 0;
		
		// 1 yaricapli cember yapilandir
		public CemberIstisnaIle() {
			this(1.0);
		}
	
		// Belirtilen yaricap ile cember yapilandir
		public CemberIstisnaIle(double yeniYaricap) {
			setYaricap(yeniYaricap);
			nesneSayisi++;
		}
		
		// Yaricapi dondur
		public double getYaricap() {
			return yaricap;
		}
		
		// Yeni bir yaricap ata
		public void setYaricap(double yeniYaricap) throws IllegalArgumentException{
			if(yeniYaricap >= 0)
				yaricap = yeniYaricap;
			else
				throw new IllegalArgumentException("Yaricap negatif olamaz");	
		}
		
		// nesneSayisini dondur
		public static int getNesneSayisi() {
			return nesneSayisi;
		}
		
		// Cemberin alanini dondur
		public double alanHesapla() {
			return yaricap * yaricap * 3.14559 ;
		}
		
}
