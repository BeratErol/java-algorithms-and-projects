# 📂 04 - Dosya İşlemleri (I/O Management)

Bu bölüm, Java'da verilerin kalıcı olarak saklanması, mevcut dosyaların okunması ve dosya sistemi üzerinde sorgulama yapılması gibi işlemleri kapsayan uygulamaları içerir. Java'nın `java.io` ve `java.util` paketlerindeki temel sınıfları kullanarak veriyi disk üzerinde yönetmeyi öğretir.

---

## 🎯 Genel OOP Konseptleri

Bu klasördeki dosyalar şu temel Girdi/Çıktı (Input/Output) yeteneklerine odaklanır:

- **Dosya Oluşturma ve Yazma:** `PrintWriter` sınıfı ile disk üzerinde yeni dosyalar oluşturma ve içine veri kaydetme.
- **Dosya Okuma:** `Scanner` sınıfını kullanarak mevcut dosyaların içeriğini satır satır veya kelime kelime işleme.
- **Kaynak Yönetimi:** Açılan dosyaların bellek sızıntısını önlemek için `close()` metodu veya `try-with-resources` yapısı ile güvenli şekilde kapatılması.
- **Dosya Sistemi Kontrolü:** Bir dosyanın var olup olmadığını, yolunu (path), boyutunu ve okunabilirlik durumunu sorgulama.
- **Veri Güncelleme:** Mevcut bir dosyadaki verileri okuyup üzerinde değişiklik yaparak tekrar kaydetme mantığı.

---

## 📂 Dosya Rehberi

| Dosya Adı | Açıklama |
|----------|----------|
| **DosyaOkumaScanner.java** | Disk üzerinde bulunan bir metin dosyasının içeriğine `Scanner` ile bağlanıp verileri program ortamına aktarma. |
| **DosyaSistemiSorgulama.java** | `File` sınıfını kullanarak dosya varlığı, dizin mi dosya mı olduğu, dosya boyutu ve dosya yolu gibi meta verileri sorgulama. |
| **DosyaYazmaTemelleri.java** | `PrintWriter` kullanarak sıfırdan bir dosya oluşturma ve `print/println` metotlarıyla içine veri girişi yapma pratiği. |
| **DosyaYazmaOtomatikKapat.java** | `try-with-resources` yapısını kullanarak, işlem bittiğinde dosyanın Java tarafından otomatik olarak kapatılmasını sağlayan güvenli yöntem. |
| **MetinDosyasiGuncelleme.java** | Bir dosyadaki veriyi okuyup, belirli karakterleri veya kelimeleri değiştirerek (update) güncel içeriği tekrar dosyaya yazma işlemi. |

---

## 🚀 Nasıl Kullanılır?

Bu bölümdeki kodları çalıştırırken, programın çalıştığı dizinde (project root) ilgili `.txt` dosyalarının oluştuğunu veya okunduğunu kontrol etmelisiniz. Özellikle yazma işlemlerinden sonra dosyanın içine bakarak verinin doğru formatta kaydedildiğini doğrulayabilirsiniz.
