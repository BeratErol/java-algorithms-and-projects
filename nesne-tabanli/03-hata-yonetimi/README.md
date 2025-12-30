# 🛡️ 03 - Hata Yönetimi (Exception Handling)

Bu bölüm, Java'da programın çalışma zamanında (runtime) karşılaşabileceği beklenmedik durumların nasıl kontrol altına alınacağını, programın çökmesinin nasıl engelleneceğini ve kullanıcıya anlamlı hata mesajlarının nasıl döneceğini işleyen uygulamaları kapsar.

---

## 🎯 Genel OOP Konseptleri

Bu klasördeki dosyalar şu temel hata yönetimi mekanizmalarına odaklanır:

- **Try-Catch-Finally:** Hata riski olan kod bloklarını sarmalama ve hata oluştuğunda yapılacak işlemleri tanımlama.
- **İstisna Türleri (Exception Types):** Aritmetik hatalar, girdi uyuşmazlıkları ve dizin sınır aşımı gibi spesifik hata türlerini tanıma.
- **Çoklu Catch Blokları:** Farklı hata türlerini hiyerarşik olarak yakalama ve yönetme.
- **Call Stack (Hata İzleme):** Hatanın hangi metotlar üzerinden yayıldığını (`printStackTrace`) analiz etme.
- **Mantıksal Denetim:** Program akışını kesmeden önce nesne durumlarını (yarıçap vb.) kontrol etme.

---

## 📂 Dosya Rehberi

| Dosya Adı | Açıklama |
|----------|----------|
| **BolmeHataYakalama.java** | Sıfıra bölme (`ArithmeticException`) gibi temel çalışma zamanı hatalarının yakalanması ve programın devamlılığının sağlanması. |
| **GirisHataYonetimi.java** | `Scanner` ile kullanıcıdan beklenen veri tipi yerine farklı bir tip girildiğinde (`InputMismatchException`) oluşan hataların yönetimi. |
| **DiziHataYonetimi.java** | Dizi sınırlarının dışına çıkıldığında (`ArrayIndexOutOfBoundsException`) fırlatılan istisnaların kontrolü. |
| **CokluHataBloklari.java** | Tek bir `try` bloğu içinde oluşabilecek birden fazla farklı hata türünün, özelleşmiş `catch` blokları ile ayrı ayrı ele alınması. |
| **HataIzlemeAnalizi.java** | İstisna nesnesinin içerdiği hata mesajlarını ve hatanın izlediği yolu (stack trace) ekrana yazdırarak hata ayıklama (debugging) yapılması. |
| **GelismisHesapMakinesi.java** | Kullanıcı hatalarına karşı dirençli, sürekli girdi kabul eden ve hataları yakalayarak döngüyü bozmayan bir uygulama örneği. |
| **CemberHataKontrolu.java** | Nesne oluşturulurken geçersiz parametre (negatif yarıçap gibi) girişlerinin `if` kontrolleri ve istisna mantığı ile denetlenmesi. |

---

## 🚀 Nasıl Kullanılır?

Bu bölümdeki örnekleri incelerken, kasıtlı olarak hatalı girişler yapmanız (örneğin sayı beklenen yere harf girmeniz) önerilir. Bu sayede `catch` bloklarının nasıl devreye girdiğini ve programın sonlanmadan nasıl bir sonraki adıma geçtiğini canlı olarak gözlemleyebilirsiniz.
