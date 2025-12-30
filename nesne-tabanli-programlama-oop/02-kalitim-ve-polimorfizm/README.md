# 🧬 02 - Kalıtım ve Polimorfizm (Inheritance & Polymorphism)

Bu bölüm, Java'da sınıflar arasındaki hiyerarşik ilişkileri, kodun yeniden kullanılabilirliğini (reusability) ve esnek yazılım mimarilerinin nasıl kurulacağını işleyen örnekleri kapsamaktadır.

---

## 🎯 Genel OOP Konseptleri

Bu klasördeki dosyalar şu ileri seviye konuları odak noktasına alır:

- **Kalıtım (Inheritance):** `extends` anahtar kelimesi ile bir sınıfın özelliklerini diğerine aktarma.
- **Çok Biçimlilik (Polymorphism):** Üst sınıf referansı ile alt sınıf nesnelerini yönetebilme yeteneği.
- **Soyutlama (Abstraction):** `abstract` sınıflar ve metotlar ile şablon yapılar oluşturma.
- **Arayüzler (Interfaces):** `interface` kullanarak sınıflara ortak yetenekler kazandırma.
- **Metot Ezme / Aşırı Yükleme:** Override ve Overloading arasındaki farklar ve kullanım amaçları.

---

## 📂 Dosya Rehberi

| Dosya Adı | Açıklama |
|---------|----------|
| **SoyutGeometrikSekil.java** | Tüm geometrik şekiller için temel (abstract) özelliklerin (renk, tarih vb.) tanımlandığı ata sınıf. |
| **GeometrikCemberSinifi.java** | SoyutGeometrikSekil'den türetilen ve daireye özel alan/çevre hesaplamalarını içeren alt sınıf. |
| **GeometrikDikdortgenSinifi.java** | SoyutGeometrikSekil'den türetilen ve dikdörtgen özelliklerini barındıran alt sınıf. |
| **GeometrikSekilTesti.java** | Kalıtım hiyerarşisindeki nesnelerin oluşturulmasını ve metotlarının çalışmasını denetleyen test sınıfı. |
| **SoyutSinifPolimorfizm.java** | Soyut sınıflar üzerinden nesne referanslamanın ve dinamik metot çağrılarının pratiği. |
| **CokBicimlilikUygulamasi.java** | Tek bir metodun parametre olarak tüm geometrik şekilleri kabul etmesini sağlayan polimorfizm örneği. |
| **CokBicimlilikVeArayuzler.java** | `interface` ve `abstract class` yapılarının aynı projede harmanlanması (Hayvan ve Yenilebilir arayüzü örneği). |
| **KarsilastirmaliArayuzler.java** | Sınıfların birden fazla arayüzü nasıl uyguladığını ve davranış kazandığını gösteren teknik analiz. |
| **KarsilastirilabilirNesne.java** | `Comparable` arayüzünü kullanarak nesneleri (örneğin yaşa göre) sıralama ve kıyaslama mantığı. |
| **KalitimdaMetotGecersizKilma.java** | Üst sınıftan gelen metodun alt sınıfta `@Override` edilerek nasıl özelleştirildiğini gösterir. |
| **MetotGecersizKilma.java** | Overriding işleminin mantıksal işleyişini ve çalışma zamanı (runtime) davranışını inceler. |
| **MetotAsiriYukleme.java** | Aynı isimli metotların farklı parametrelerle (Overloading) sınıf hiyerarşisinde nasıl konumlandığı. |

---

## 🚀 Nasıl Kullanılır?

Bu klasördeki en önemli yapı **SoyutGeometrikSekil** ve ondan türeyen şekillerdir. Bu sınıflar birbirine bağımlı olduğu için beraber incelenmelidir. Özellikle **CokBicimlilikUygulamasi.java** dosyası, neden kalıtım kullandığımızın en iyi cevabıdır; çünkü tek bir metotla onlarca farklı şekli yönetebilmemizi sağlar.
