# 🧠 05 - Statik Değişkenler ve Bellek Yönetimi

Bu bölüm, Java'da `static` anahtar kelimesinin kullanım mantığını, nesneye özgü (instance) değişkenler ile sınıfa özgü (class) değişkenler arasındaki farkları ve bu yapıların bellek üzerindeki etkilerini işleyen uygulamaları içerir.

---

## 🎯 Genel OOP Konseptleri

Bu klasördeki dosyalar şu temel bellek ve paylaşım mantıklarına odaklanır:

- **Statik Değişkenler (Static Variables):** Nesne oluşturulmasa bile bellekte yer kaplayan ve o sınıftan üretilen tüm nesneler tarafından paylaşılan ortak veriler.
- **Nesne Sayacı Mantığı:** Bir sınıftan kaç tane nesne üretildiğini takip etmek için statik değişkenlerin kullanımı.
- **Örnek Değişkenler (Instance Variables):** Her nesnenin kendine ait olan ve bir nesnedeki değişikliğin diğerini etkilemediği değişken yapısı.
- **Hata Durumunda Durum Yönetimi:** İstisna (Exception) fırlatılsa dahi nesne sayacının veya statik durumun nasıl güncelleneceği.

---

## 📂 Dosya Rehberi

| Dosya Adı | Açıklama |
|----------|----------|
| **StatikSayacAnalizi.java** | Statik bir değişkenin tüm nesneler arasında nasıl paylaşıldığını ve bir nesne üzerinden yapılan değişikliğin diğerlerini nasıl etkilediğini analiz eder. |
| **NesneVeStatikSayac.java** | Her yeni nesne oluşturulduğunda (Constructor içinde) statik bir sayacı artırarak, sistemde aktif olan toplam nesne sayısını anlık olarak takip eden klasik bir uygulama. |
| **HataYonetimiNesneSayaci.java** | Nesne oluşturma sürecinde bir hata (Exception) meydana geldiğinde, statik sayacın tutarlılığını nasıl koruyacağını gösteren ileri seviye bir örnek. |

---

## 🚀 Nasıl Kullanılır?

Bu bölümdeki dosyaları çalıştırırken, çıktıları dikkatle takip etmelisiniz. Özellikle birden fazla nesne oluşturup birinin statik değerini değiştirdiğinizde, diğer nesnelerin bu değişimden nasıl etkilendiğini görmek **Static** mantığını kavramanıza yardımcı olacaktır.
