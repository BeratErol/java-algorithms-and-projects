# 📂 Uygulama ve Oyun Projeleri

Bu klasör, **Java programlama dilinin temel ve ileri seviye konseptlerini** bir araya getiren, **uçtan uca geliştirilmiş uygulama ve oyun projelerini** içermektedir.

Buradaki çalışmalar;

* Dosya sistemleri
* Grafik kullanıcı arayüzleri (GUI)
* Nesne yönelimli programlama (OOP)
* Karmaşık algoritmaların gerçek dünya senaryolarına uygulanması

gibi konuları **uygulamalı örnekler** üzerinden ele alır.

---

## 🚀 Öne Çıkan Projeler

Bu bölümde yer alan projeler, **farklı teknik yetkinlik odaklarına** göre kategorize edilmiştir:

| Proje Adı                            | Odak Noktası                             | Temel Teknolojiler                            |
| ------------------------------------ | ---------------------------------------- | --------------------------------------------- |
| **Modern Kütüphane Yönetim Sistemi** | Masaüstü Uygulama (GUI) ve Veri Yönetimi | Swing, `java.time`, Collections, MVC          |
| **BomBom (Eşleştirme Oyunu)**        | Algoritma Tasarımı ve Veri Yapıları      | Özyineleme (Recursion), 2D Diziler, Dosya I/O |

---

## 🛠️ Projelerin Teknik Detayları

### 1️⃣ Modern Kütüphane Yönetim Sistemi

Bu repo içerisindeki **en kapsamlı projedir**.
Nesne yönelimli programlama (**OOP**) prensipleri kullanılarak geliştirilmiş **tam işlevli bir masaüstü otomasyon sistemidir**.

#### 🔹 Arayüz (GUI)

* Java **Swing** kullanılarak geliştirilmiş modern ve okunabilir bir tasarım
* Renk kodlu durum göstergeleri (Rafta / Ödünç / Gecikmiş)
* Tablo tabanlı veri gösterimi (JTable)
* Kullanıcı dostu etkileşim ve geri bildirimler

#### 🔹 İş Mantığı (Business Logic)

* Kitap ekleme, ödünç verme ve iade alma süreçleri
* **14 günlük otomatik iade süresi** ve gecikme kontrolü
* Aynı kitabın tekrar eklenmesini önleyen doğrulama mekanizmaları
* Ödünçte, rafta ve gecikmiş kitapların ayrıştırılması

#### 🔹 Analiz ve Raporlama

* Kategori bazlı kitap sayısı analizi
* Genel istatistikler:

  * Toplam kitap
  * Rafta olan kitaplar
  * Ödünçte olan kitaplar
  * Gecikmiş kitaplar
* Dinamik istatistik pencereleri

#### 🔹 Mimari Yapı

* **Model – Manager – GUI** ayrımı
* Veri modeli (`Book`)
* İş mantığı yöneticisi (`LibraryManager`)
* Sunum katmanı (`ModernLibraryGUI`)

---

### 2️⃣ BomBom (Candy Crush Benzeri Eşleştirme Oyunu)

Bu proje, **algoritmik düşünme** ve **özyinelemeli (recursive) fonksiyonların** iki boyutlu diziler üzerinde nasıl çalıştığını göstermek amacıyla geliştirilmiştir.

#### 🔹 Algoritma Yapısı

* Seçilen bir hücrenin:

  * Yukarı
  * Aşağı
  * Sağ
  * Sol
    komşularını **zincirleme şekilde** tarayan recursive algoritma
* Sonsuz döngüye girmeyi engelleyen kontrol mekanizmaları

#### 🔹 Veri Yönetimi

* Oyun haritaları **harici `.txt` dosyalarından** dinamik olarak yüklenir
* Dosya okuma (File I/O) işlemleri ve hata kontrolü
* Matris tabanlı oyun alanı yönetimi

---

## 💡 Genel Kazanımlar

Bu projelerin geliştirilmesi sürecinde aşağıdaki teknik yetkinlikler pekiştirilmiştir:

### ✅ Masaüstü Yazılım Geliştirme

* Event-Driven Programming (Olay tabanlı programlama)
* Swing bileşenlerinin etkin kullanımı
* Kullanıcı etkileşimleri ve geri bildirim yönetimi

### ✅ Mimari Tasarım

* İş mantığı (Business Logic) ile sunum katmanının ayrılması
* Kod okunabilirliği ve sürdürülebilirlik
* Modüler yapı tasarımı

### ✅ Algoritmik Verimlilik

* Çok boyutlu veri yapılarında hızlı tarama
* Recursive algoritmaların kontrollü kullanımı
* Bellek ve performans farkındalığı

### ✅ Hata Yönetimi

* Dosya okuma hatalarının güvenli şekilde ele alınması
* Kullanıcı girdilerinin (Input Validation) doğrulanması
* Sistem kararlılığını bozan durumların önlenmesi

---

📌 **Not:**
Bu klasördeki projeler, hem **akademik çalışmalar** hem de **portföy amaçlı profesyonel örnekler** olarak tasarlanmıştır. Java’nın temelinden ileri seviyesine kadar birçok konuyu **tek bir repo altında** uygulamalı olarak göstermeyi hedefler.

---
