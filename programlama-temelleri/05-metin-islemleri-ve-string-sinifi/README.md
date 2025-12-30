# 🔤 05 - Metin İşlemleri ve String Sınıfı

Bu bölüm, metinlerin yalnızca birer yazı dizisi olmadığını; aynı zamanda üzerinde **analiz**, **parçalama**, **karşılaştırma** ve **formatlama** gibi karmaşık işlemler yapılabilen nesneler olduğunu göstermeyi amaçlar.
Kullanıcıdan veri alma, metinleri işleme ve karakter bazlı analizler bu başlık altında ele alınmıştır.

---

## 📝 İçerikteki Dosyalar ve Açıklamaları

### 🔹 Metin Analizi ve Parçalama

| Dosya Adı                            | Açıklama                                                                                                    |
| ------------------------------------ | ----------------------------------------------------------------------------------------------------------- |
| **AdSoyadAyristirici.java**          | Tek satırda girilen bir metni boşlukları baz alarak ad ve soyad bileşenlerine ayırır.                       |
| **MetinParcalamaTemelleri.java**     | `split()` ve `substring()` metotları ile metinlerin alt parçalara bölünmesini gösterir.                     |
| **MetinAramaMetotlari.java**         | `indexOf()`, `lastIndexOf()` ve `contains()` metotları ile metin içinde karakter veya kelime araması yapar. |
| **MetinKarsilastirmaMetotlari.java** | `equals()`, `equalsIgnoreCase()` ve `compareTo()` metotları arasındaki farkları inceler.                    |

---

### 🔹 Karakter ve Format İşlemleri

| Dosya Adı                             | Açıklama                                                                                                 |
| ------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| **KarakterTipiAnalizi.java**          | `Character` sınıfı metotları ile bir karakterin harf, rakam veya özel karakter olup olmadığını denetler. |
| **KarakterIndisErisimi.java**         | `charAt()` metodu ile metnin belirli bir indisindeki karaktere erişim sağlar.                            |
| **FormatliCiktiAnalizi.java**         | `printf()` ve `String.format()` kullanarak verilerin hizalı ve düzenli yazdırılmasını kapsar.            |
| **MatematikVeKacisKarakterleri.java** | `\n`, `\t`, `\"` gibi kaçış (escape) karakterlerinin kullanımını örnekler.                               |

---

### 🔹 Giriş-Çıkış ve Birleştirme

| Dosya Adı                           | Açıklama                                                                                                 |
| ----------------------------------- | -------------------------------------------------------------------------------------------------------- |
| **MetinUzunluguVeBirlestirme.java** | `length()` ve `concat()` metotları ile metin uzunluğunu ölçer ve metinleri birleştirir.                  |
| **MetinVeSayiBirlestirme.java**     | Java’da `String` ile sayısal tiplerin `+` operatörü ile nasıl birleştirildiğini (type coercion) açıklar. |
| **KullaniciMesajGiris.java**        | `Scanner` sınıfı kullanılarak kullanıcıdan metinsel veri alma süreçlerini yönetir.                       |
| **OzellestirilmisYazdirma.java**    | Metinlerin belirli bir şablon veya desenle ekrana yazdırılmasını sağlar.                                 |

---

## 💡 Neler Öğrenilir?

* **Immutable (Değişmezlik) Yapısı:**
  `String` nesnelerinin neden değiştirilemez olduğu ve **String Pool** kavramı.

* **Metin Manipülasyonu:**
  Büyük/küçük harf dönüşümleri (`toUpperCase()`, `toLowerCase()`), kırpma (`trim()`) ve metin temizleme işlemleri.

* **Sıralama Mantığı:**
  İsim veya şehir listelerinin `compareTo()` metodu kullanılarak alfabetik sıralanması.

* **Formatlı Yazım:**
  Raporlama ve tablo oluşturma süreçlerinde `%s`, `%d`, `%f` gibi `printf` belirleyicilerinin etkin kullanımı.

---
