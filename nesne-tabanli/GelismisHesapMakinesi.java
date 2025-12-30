import java.util.InputMismatchException;
import java.util.Scanner;

	class CustomExcept extends Exception {
			public GelismisHesapMakinesi(String message) {
					super(message);
			}
	}

	public class GelismisHesapMakinesi {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int islem = 0, a = 0, b = 0, sonuc = 0;

			while (true) {
				try {
					System.out.print("İşlem seçiniz: ");
					System.out.println("Toplama için 1, Çıkarma için 2, Bölme için 3, Çarpma için 4 seçiniz.");
					islem = scanner.nextInt();

					if (islem > 4 || islem < 0) {
						throw new CustomExcept("Geçersiz işlem seçildi!");
					}
					break;
				} catch (InputMismatchException e) {
					System.out.println("Veri tipi farklı! Lütfen bir sayı giriniz.");
					scanner.next();
				} catch (CustomExcept e) {
					System.out.println(e.getMessage());
				}
			}

			while (true) {
				try {
					System.out.print("İlk sayıyı giriniz: ");
					a = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Veri tipi farklı! Lütfen bir sayı giriniz.");
					scanner.next();
				}
			}

			while (true) {
				try {
					System.out.print("İkinci sayıyı giriniz: ");
					b = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Veri tipi farklı! Lütfen bir sayı giriniz.");
					scanner.next();
				}
			}

			switch (islem) {
			case 1:
				try {
					sonuc = a + b;
					if (sonuc > 9999) {
						throw new CustomExcept("Sayı sınırı aşıldı!");
					}
					System.out.println("Sonuç: " + sonuc);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 2:
				try {
					sonuc = a - b;
					if (sonuc > 9999) {
						throw new CustomExcept("Sayı sınırı aşıldı!");
					}
					System.out.println("Sonuç: " + sonuc);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 3:
				try {
					if (b == 0) {
						throw new ArithmeticException("Bölme hatası: Sıfıra bölme.");
					}
					sonuc = a / b;
					if (sonuc > 9999) {
						throw new CustomExcept("Sayı sınırı aşıldı!");
					}
					System.out.println("Sonuç: " + sonuc);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 4:
				try {
					sonuc = a * b;
					if (sonuc > 9999) {
						throw new CustomExcept("Sayı sınırı aşıldı!");
					}
					System.out.println("Sonuç: " + sonuc);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			}
		}
}
