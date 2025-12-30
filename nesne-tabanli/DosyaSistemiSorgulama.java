
public class DosyaSistemiSorgulama {

	public static void main(String[] args) {
		
		java.io.File dosya1 = new java.io.File("deneme.txt");
		
		System.out.println("Bu dosya var mÄ±? " + dosya1.exists());
		System.out.println("Dosyanin uzunlugu " + dosya1.length() + " bytes");
		System.out.println("Dosya okunabilir mi? " + dosya1.canRead());
		System.out.println("Dosya yazilabilir mi? " + dosya1.canWrite());
		System.out.println("Bir dizin mi? " + dosya1.isDirectory());
		System.out.println("Bir dosya mi? " + dosya1.isFile());
		System.out.println("Mutlak mi? " + dosya1.isAbsolute());
		System.out.println("Gizli mi? " + dosya1.isHidden());
		System.out.println("Mutlak yolu " + dosya1.getAbsolutePath());
		System.out.println("Degisiklik tarihi " + new java.util.Date(dosya1.lastModified()));
		
	}

}

