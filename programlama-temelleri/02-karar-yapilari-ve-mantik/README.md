## ⚖️ 02 - Karar Yapıları ve Mantık

Bu klasör, **Java'da program akışını kontrol eden karar mekanizmalarını**, mantıksal sorgulamaları ve koşullu ifade bloklarını içeren çalışmaları kapsamaktadır.  
Programın belirli şartlara göre farklı yollar izlemesini sağlayan algoritmaların temeli bu bölümde atılmıştır.

---

## 📝 İçerikteki Dosyalar ve Açıklamaları

Bu bölümde yer alan dosyalar, basit koşullardan karmaşık mantıksal analizlere kadar geniş bir yelpazeyi kapsar:

| **Dosya Adı** | **Açıklama** |
|-------------|-------------|
| **AkademikNotDonusturucu.java** | Sayısal not ortalamalarını akademik sisteme uygun katsayılara dönüştürür. |
| **BolunebilirlikKontrolu.java** | Bir sayının belirli çarpanlara (örn: 2, 3, 5) tam bölünüp bölünmediğini `if` blokları ile denetler. |
| **CalismaZamaniHatalari.java** | Mantıksal kurgu hataları nedeniyle çalışma zamanında (runtime) oluşabilecek durumları analiz eder. |
| **EnBuyukSayiBulucu.java** | Verilen sayı grubu içerisinden karşılaştırma operatörlerini kullanarak en büyüğünü seçer. |
| **GunIsmiSorgulama.java** | `switch-case` yapısını kullanarak sayısal değerleri haftanın gün isimlerine eşler. |
| **HaftaIciSonuKontrolu.java** | Girilen günün hafta içine mi yoksa hafta sonuna mı ait olduğunu gruplandırılmış koşullarla belirler. |
| **HarfNotuHesaplayici.java** | Puan aralıklarına göre (0-100) AA, BA, BB gibi harf notlarını hesaplayan gelişmiş bir algoritmadır. |
| **IkinciDereceDenklemCozucu.java** | Diskriminant (Δ) kontrolü yaparak ikinci derece denklemlerin kök varlığını ve değerlerini hesaplar. |
| **MaksimumDegerBulucu.java** | Farklı veri tipleri veya değişkenler arasında maksimum olanı bulan alternatif bir karşılaştırma örneğidir. |
| **MantiksalHataAnalizi.java** | Kodun hatasız çalışmasına rağmen yanlış sonuç üretmesine neden olan mantık hatalarını (logical errors) inceler. |
| **NotHarfKarsiligi.java** | Harf notlarının sözel karşılıklarını (Pekiyi, İyi, Geçer vb.) belirleyen koşullu yapıdır. |
| **SifreKontrolSistemi.java** | String karşılaştırma metotlarını kullanarak kullanıcı giriş bilgilerinin doğruluğunu sorgular. |
| **TemelIfBloklari.java** | `if`, `else if` ve `else` yapılarının en temel ve yalın kullanım örneklerini içerir. |
| **TernaryOperatoruTesti.java** | Tek satırlık koşul operatörü olan `? :` yapısının kullanımını ve okunabilirliğini test eder. |

---

## 💡 Neler Öğrenilir?

- Koşullu dallanma (**Conditional Branching**) mantığı  
- Mantıksal operatörlerin (`&&`, `\|\|`, `!`) karar süreçlerindeki kritik rolü  
- `switch-case` yapısının `if-else` bloklarına göre hangi durumlarda daha verimli olduğu  
- Hatalı algoritma kurgusunun sonuçlarını analiz etme (**Mantıksal Hata Analizi**)
