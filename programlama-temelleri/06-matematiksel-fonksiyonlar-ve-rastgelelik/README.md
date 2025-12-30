---

# 📐 06 - Matematiksel Fonksiyonlar ve Rastgelelik

Bu bölüm, Java’nın standart kütüphanesinde yer alan **`Math` sınıfının** sunduğu matematiksel fonksiyonları ve **rastgele sayı üretim mekanizmalarının** algoritmik oyunlar ve simülasyonlar üzerindeki etkisini öğretir.
Karmaşık matematiksel denklemlerden, zaman tabanlı şans oyunlarına kadar uzanan geniş bir uygulama seti sunulmaktadır.

---

## 📝 İçerikteki Dosyalar ve Açıklamaları

Aşağıdaki tabloda, klasör içerisinde yer alan her bir dosyanın teknik amacı ve işlevi özetlenmiştir:

| Dosya Adı                          | Açıklama                                                                                                                   |
| ---------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| **JavaHazirSiniflari.java**        | Java’nın sunduğu standart yardımcı sınıfların (`Math`, `Random` vb.) genel bir önizlemesini sunar.                         |
| **KoordinatHesaplayici.java**      | İki boyutlu düzlemde noktalar arası mesafe ve konum hesaplamaları için `Math.sqrt()` ve `Math.pow()` kullanır.             |
| **LogaritmaHesaplayici.java**      | `Math.log()` ve `Math.log10()` metotlarını kullanarak doğal ve 10’luk tabanda logaritmik hesaplamalar yapar.               |
| **MatematikYardimciSinifi.java**   | Sık kullanılan matematiksel sabitlerin (π, e) ve temel fonksiyonların bir arada toplandığı bir rehber niteliğindedir.      |
| **MatematikselFonksiyonlar.java**  | Mutlak değer (`abs`), en büyük/en küçük bulma (`max` / `min`) gibi temel `Math` metotlarını kapsar.                        |
| **MatematikselYuvarlama.java**     | `ceil`, `floor`, `round` ve `rint` metotları arasındaki farkları ve yuvarlama stratejilerini gösterir.                     |
| **RastgeleSayiCikarmaOyunu.java**  | Rastgele üretilen sayılarla kullanıcıya çıkarma işlemi yaptıran ve sonucu kontrol eden etkileşimli bir oyun uygulamasıdır. |
| **TasKagitMakasOyunu.java**        | `Math.random()` kullanarak bilgisayara seçim yaptıran ve kazanma/kaybetme mantığını yöneten bir algoritmadır.              |
| **TrigonometriHesaplamalari.java** | Radyan ve derece cinsinden `sin`, `cos` ve `tan` gibi trigonometrik değerlerin hesaplanmasını içerir.                      |
| **UstelVeLogaritmikIslemler.java** | Üslü sayılar (`exp`) ve logaritmik dönüşümler arasındaki matematiksel ilişkileri kod üzerinde test eder.                   |
| **ZamanTabanliRastgeleSayi.java**  | Rastgele sayı üretiminde `System.currentTimeMillis()` kullanımını ve **seed** (tohum) mantığını açıklar.                   |

---

## 💡 Neler Öğrenilir?

* **Statik Math Metotları**

  Nesne oluşturmadan doğrudan sınıf adı üzerinden çağrılan matematiksel araçların kullanımı.

* **Hassas Hesaplamalar**

  Ondalıklı sayılarda yuvarlama stratejileri ve kayan noktalı sayı (floating-point) aritmetiği.

* **Oyun Mantığı (Game Logic)**

  Rastgele sayı üretimi ile öngörülemez ve dinamik program davranışları tasarlama.

* **Geometrik Modelleme**

  Trigonometrik metotlar yardımıyla açı hesaplamaları ve koordinat sistemlerinin yönetimi.

---
