# 📚 Kütüphane Yönetim Sistemi (Library Management System)

**Java Swing Tabanlı Masaüstü Uygulaması**

Bu proje, **Java programlama dili** kullanılarak geliştirilmiş, modern arayüz tasarımına sahip, **tam işlevli bir Kütüphane Yönetim Sistemi**dir.
Uygulama; kitap yönetimi, ödünç alma–iade süreçleri, gecikme takibi, arama, filtreleme ve istatistik üretimi gibi gerçek dünya kütüphane operasyonlarını tek bir masaüstü uygulaması altında birleştirir.

Proje; **nesne yönelimli programlama (OOP)**, **Swing GUI**, **koleksiyonlar**, **tarih/zaman API’leri**, **MVC’ye yakın mimari ayrımı** ve **kullanıcı deneyimi (UX)** odaklı tasarım yaklaşımlarını birlikte içermektedir.

---

## 🎯 Projenin Amacı

Bu yazılımın amacı;

* Kitapların merkezi bir sistem üzerinden yönetilmesi
* Ödünç verme ve iade süreçlerinin kontrollü şekilde yürütülmesi
* Gecikmiş kitapların otomatik olarak tespit edilmesi
* Kullanıcıya hızlı arama ve filtreleme imkânı sunulması
* Görsel olarak okunaklı, modern ve kullanıcı dostu bir arayüz sağlanması

şeklinde özetlenebilir.

---

## 🧱 Mimari Yapı ve Sınıf Tasarımı

Proje, **katmanlı düşünce yapısına uygun** şekilde üç ana bileşenden oluşur:

### 1️⃣ Model Katmanı

#### `Book`

Bir kitabı temsil eden temel varlık (entity) sınıfıdır.

**Sorumlulukları:**

* Kitap kimliği, başlık, yazar ve kategori bilgilerini tutmak
* Ödünç durumu ve ödünç alan kullanıcıyı yönetmek
* Ödünç ve iade tarihlerini hesaplamak
* Gecikme (overdue) durumunu otomatik tespit etmek

**Öne Çıkan Teknik Detaylar:**

* `LocalDate` kullanımı (java.time API)
* Duruma bağlı iş mantığı (`isBorrowed`, `isOverdue`)
* Encapsulation (private alanlar + getter metotları)

---

### 2️⃣ İş Mantığı (Controller / Manager)

#### `LibraryManager`

Uygulamanın **beyni** konumundadır.

**Sorumlulukları:**

* Kitap ekleme, arama, ödünç verme ve iade işlemleri
* Gecikmiş kitapların tespiti
* Kategori bazlı istatistik üretimi
* Veri bütünlüğünü sağlama (aynı kitap adı kontrolü vb.)

**Kullanılan Yapılar:**

* `ArrayList<Book>`
* `Map<String, Integer>` (istatistikler)
* Lineer arama algoritmaları
* Koşullu iş kuralları

Bu sınıf, GUI’den tamamen bağımsız çalışır ve **test edilebilir saf iş mantığı** sunar.

---

### 3️⃣ Sunum Katmanı (GUI)

#### `ModernLibraryGUI`

Swing kullanılarak geliştirilmiş, **modern tasarım prensiplerine uygun** ana arayüz sınıfıdır.

**Öne Çıkan Özellikler:**

* JTable tabanlı kitap listesi
* Dinamik arama ve filtreleme
* Renk kodlu durum göstergeleri
* Kullanıcı etkileşimli diyalog pencereleri
* Responsive sayılabilecek düzen yapısı

---

## 🖥️ Arayüz ve Kullanıcı Deneyimi

### 📊 Kitap Tablosu

Tablo aşağıdaki sütunları içerir:

* **ID**
* **Kitap Adı**
* **Yazar**
* **Kategori**
* **Durum** (Rafta / Ödünç Alındı)
* **Ödünç Alan**
* **İade Tarihi**

**Okunabilirlik için alınan önlemler:**

* Artırılmış satır yüksekliği
* Hücre içi padding (custom cell renderer)
* Renkli durum vurguları
* Orantılı sütun genişlikleri

---

### 🎛️ İşlem Menüsü

Sol panel üzerinden şu işlemler yapılabilir:

* Yeni kitap ekleme
* Kitap ödünç verme
* Kitap iade alma
* Sadece ödünçteki kitapları listeleme
* Gecikmiş kitapları görüntüleme
* Kategori istatistikleri
* Tabloyu yenileme

---

## 🔍 Arama ve Filtreleme

Üst panelde yer alan arama alanı ile;

* Kitap adı
* Yazar adı
* Kategori

üzerinden **case-insensitive** ve **partial match** destekli arama yapılabilir.

---

## ⏱️ Tarih ve Gecikme Yönetimi

* Ödünç süresi otomatik olarak **14 gün** olarak belirlenir
* `LocalDate.now()` ile güncel tarih alınır
* İade tarihi geçmiş kitaplar **gecikmiş** olarak işaretlenir
* Gecikmiş kitaplar ayrı bir liste olarak görüntülenebilir

---

## 📈 İstatistikler

Uygulama, kitapları **kategori bazında** analiz eder ve:

* Her kategoriye ait kitap sayısını
* Kullanıcıya okunaklı bir rapor formatında

sunabilir.

---

## 🛠️ Kullanılan Teknolojiler

* **Java SE**
* **Swing (GUI)**
* **java.time (LocalDate, DateTimeFormatter)**
* **Collections Framework**
* **OOP (Encapsulation, Separation of Concerns)**
* **Event-Driven Programming**

---

## 🚀 Çalıştırma

```bash
javac KutuphaneYonetimSistemi.java
java KutuphaneYonetimSistemi
```

veya doğrudan bir IDE (IntelliJ IDEA / Eclipse) üzerinden çalıştırılabilir.

---

## ⭐ Öne Çıkan Noktalar

* Gerçek dünya problemine birebir karşılık gelen iş kuralları
* Tek dosyada **birden fazla ileri seviye Java konusunun birlikte kullanımı**
* Okunabilir, sürdürülebilir ve genişletilebilir kod yapısı
* Masaüstü uygulamalar için profesyonel Swing tasarımı

---
