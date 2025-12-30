import java.util.InputMismatchException;
import java.util.Scanner;

// 1. Kendi hata sınıfımızı doğru kurguluyoruz
class CustomExcept extends Exception {
    public CustomExcept(String message) {
        super(message);
    }
}

public class GelismisHesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int islem = 0, a = 0, b = 0, sonuc = 0;

        // İşlem seçimi döngüsü
        while (true) {
            try {
                System.out.println("\nToplama için 1, Çıkarma için 2, Bölme için 3, Çarpma için 4 seçiniz.");
                System.out.print("İşlem seçiniz: ");
                islem = scanner.nextInt();

                if (islem > 4 || islem < 1) { // 0'ı da geçersiz saydık
                    throw new CustomExcept("Hata: Geçersiz işlem seçildi!");
                }
                break; // Geçerli giriş yapıldıysa döngüden çık
            } catch (InputMismatchException e) {
                System.out.println("Hata: Veri tipi farklı! Lütfen bir sayı giriniz.");
                scanner.next(); // Hatalı girişi temizle
            } catch (CustomExcept e) {
                System.out.println(e.getMessage());
            }
        }

        // İlk sayı girişi
        while (true) {
            try {
                System.out.print("İlk sayıyı giriniz: ");
                a = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Hata: Veri tipi farklı! Lütfen bir sayı giriniz.");
                scanner.next();
            }
        }

        // İkinci sayı girişi
        while (true) {
            try {
                System.out.print("İkinci sayıyı giriniz: ");
                b = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Hata: Veri tipi farklı! Lütfen bir sayı giriniz.");
                scanner.next();
            }
        }

        // Hesaplama ve Sonuç
        try {
            switch (islem) {
                case 1:
                    sonuc = a + b;
                    break;
                case 2:
                    sonuc = a - b;
                    break;
                case 3:
                    if (b == 0) {
                        throw new ArithmeticException("Hata: Sıfıra bölme yapılamaz.");
                    }
                    sonuc = a / b;
                    break;
                case 4:
                    sonuc = a * b;
                    break;
            }

            // Sayı sınırı kontrolü (Tüm işlemler için ortak kontrol)
            if (sonuc > 9999) {
                throw new CustomExcept("Hata: Sayı sınırı (9999) aşıldı!");
            }
            System.out.println("İşlem Sonucu: " + sonuc);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (CustomExcept e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Beklenmedik bir hata oluştu: " + e.getMessage());
        } finally {
            scanner.close(); // Kaynağı güvenli bir şekilde kapat
        }
    }
} 