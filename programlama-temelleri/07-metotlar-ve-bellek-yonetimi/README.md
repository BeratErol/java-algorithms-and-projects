# 🧠 07 - Metotlar ve Bellek Yönetimi

Bu bölüm, kodun **modüler hale getirilmesini** sağlayan metot kavramını ve Java’nın verileri **bellekte (memory)** nasıl işlediğini ele alır.
Özellikle **Değer ile Çağırma (Pass-by-Value)** ve **Referans davranışı** arasındaki ince farklar, nesne yönelimli programlamanın temelini oluşturur.

Java’da her parametre teknik olarak *değer ile aktarılır*; ancak nesne referansları söz konusu olduğunda bu davranışın sonuçları bu bölümde detaylı biçimde analiz edilir.

---

## 📝 İçerikteki Dosyalar ve Açıklamaları

Aşağıdaki tabloda, klasör içerisindeki her bir dosyanın teknik amacı ve işlediği temel kavram özetlenmiştir:

| Dosya Adı                         | Açıklama                                                                                                          |
| --------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| **DegerleCagirmaMantigi.java**    | İlkel (primitive) veri tiplerinin metotlara kopyalanarak gönderilmesini ve orijinal değerin korunmasını gösterir. |
| **DegerleCagirmaTesti.java**      | *Pass-by-Value* prensibini farklı senaryolar ve değişkenler üzerinde test eder.                                   |
| **DegiskenKapsamiVeTurleri.java** | Yerel (local) değişkenler ile sınıf (instance) değişkenleri arasındaki ömür ve erişim farklarını açıklar.         |
| **HacimHesaplamaModeli.java**     | Metotları kullanarak bir problemin (hacim hesabı) parçalara ayrılmasını ve değer döndüren metotları örnekler.     |
| **IndisVeToplamAnalizi.java**     | Dizilerin metotlara gönderilmesi ve indis bazlı işlemlerin sonuçlarının analiz edilmesini kapsar.                 |
| **MetotIleSayiToplama.java**      | Parametre alan ve geriye değer döndüren (`return`) temel metot yapısını açıklar.                                  |
| **ReferansAktarimiDeneme.java**   | Nesne ve dizilerin metotlara referans yoluyla gönderilmesinin bellek üzerindeki etkilerini inceler.               |
| **ReferansDegerGuncelleme.java**  | Metot içinde bir nesnenin içeriği değiştirildiğinde orijinal nesnenin nasıl etkilendiğini gösterir.               |
| **StatikVeNesneYapisi.java**      | Statik metotların sınıfa, statik olmayan metotların ise nesneye ait olma durumunu ve bellek konumlarını işler.    |
| **VarsayilanDegerler.java**       | Java’da ilklendirilmemiş değişkenlerin bellekte aldığı varsayılan değerleri (`0`, `null`, `false`) gösterir.      |
| **YasOrtalamasiHesapla.java**     | Verileri metotlar üzerinden geçirerek gerçek dünya senaryolu bir ortalama hesaplama algoritması sunar.            |

---

## 💡 Neler Öğrenilir?

* **Modülerlik (Modularity)**
  Kod tekrarını önlemek için işlevsel bloklar (metotlar) tasarlama.

* **Bellek Yönetimi (Memory Management)**

  * **Stack**: Yerel değişkenler ve metot çağrıları
  * **Heap**: Nesneler ve diziler

* **Parametre Aktarımı**
  Java’da her şeyin *değer ile aktarıldığı* gerçeği ve bunun nesne referansları üzerindeki etkileri.

* **Scope (Kapsam)**
  Bir değişkenin hangi süslü parantezler `{ }` arasında yaşadığını ve ne zaman bellekten silindiğini anlama.

---
