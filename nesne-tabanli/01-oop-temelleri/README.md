# 🏗 01 - Nesne Tabanlı Programlama Temelleri

Bu bölüm, Java'da Nesne Tabanlı Programlama'nın (Object-Oriented Programming - OOP) temel yapı taşlarını ve mantığını kavramak için oluşturulmuş uygulama örneklerini içerir. Burada temel amaç, verileri ve bu veriler üzerinde işlem yapan metotları bir "Sınıf" (Class) çatısı altında toplamayı öğrenmektir.

---

## 🎯 Genel OOP Konseptleri

Bu klasördeki dosyalar şu temel konuları işlemektedir:

- **Sınıf (Class) ve Nesne (Object):** Gerçek dünyadaki varlıkların kod ortamındaki şablonları ve bu şablonlardan üretilen örnekler.
- **Yapıcı Metotlar (Constructors):** Bir nesne oluşturulduğu anda çalışan özel metotlar ve `this` anahtar kelimesi ile veri ilklendirme.
- **Kapsülleme (Encapsulation):** `private` ve `public` erişim belirleyicileri ile verinin korunması ve kontrollü erişim.
- **Nesne Durumu (State) ve Davranışı (Behavior):** Değişkenlerin nesneye ait özellikleri, metotların ise nesnenin yapabildiği işleri temsil etmesi.

---

## 📂 Dosya Rehberi

| Dosya Adı | Açıklama |
|----------|----------|
| **BankaHesapUygulamasi.java** | Statik bakiye yönetimi ve para yatırma/çekme işlemleri ile basit bir banka hesabı modellemesi. |
| **TelevizyonNesneModeli.java** | Kanal, ses seviyesi ve güç durumu gibi gerçek dünya özelliklerini yöneten kapsamlı bir nesne tasarımı. |
| **TelevizyonNesneTesti.java** | Oluşturulan Televizyon nesnelerinin metotlarını test eden ve durum değişimlerini gözlemleyen istemci kod. |
| **OgrenciDurumModeli.java** | Öğrenci bilgilerini saklayan ve yetenek/cinsiyet durumuna göre nesne durumunu güncelleyen temel yapı. |
| **OgrenciBilgiSistemi.java** | Constructor overloading (yapıcı metotların aşırı yüklenmesi) ve varsayılan ders atama mantığı. |
| **OgrenciKayitSistemi.java** | Nesne parametrelerini kullanarak bilgileri formatlı bir şekilde ekrana yazdırma uygulaması. |
| **CemberAlanVeCevre.java** | Matematiksel hesaplamaların (alan ve çevre) bir sınıf içine hapsedilmesi örneği. |
| **CemberNesneYapilandirma.java** | Farklı yarıçap parametreleri ile nesne üretimini ve nesne değişkenlerine doğrudan erişimi inceler. |
| **VucutKitleIndeksiHesapla.java** | Kapsülleme (private alanlar) ve yapıcı metotlar arası çağrı (`this()`) mekanizmasının kullanımı. |
| **NesneElemanTakasi.java** | Nesne referanslarının metotlara aktarılması ve nesne içerisindeki verilerin yer değiştirmesi (Swap) mantığı. |
| **ErisimBelirleyiciTesti.java** | `private` erişim belirleyicisinin sınıflar arası erişim üzerindeki kısıtlayıcı etkisinin testi. |

---

## 🚀 Nasıl Kullanılır?

Her bir dosya bağımsız bir `main` metodu içerir veya bir test sınıfı tarafından çağrılır. İncelemeye **OgrenciDurumModeli.java** gibi temel sınıflardan başlayıp, **VucutKitleIndeksiHesapla.java** gibi kapsülleme içeren dosyalara doğru ilerlemeniz önerilir.
