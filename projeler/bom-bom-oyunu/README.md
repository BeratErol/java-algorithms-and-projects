# 💣 Bom-Bom(Candy Crush Benzeri Oyun): Recursive Matris Operasyonları ve Oyun Mantığı

Bu proje, **Java programlama dili** kullanılarak geliştirilmiş, ızgara tabanlı (**grid-based**) bir eşleştirme ve temizleme oyunudur.
Projenin odak noktası; **iki boyutlu diziler** üzerinde **özyinelemeli (recursive) tarama algoritmaları** ve **dosya sisteminden dinamik veri okuma** süreçleridir.

---

## 🎯 Projenin Amacı ve Teknik Kapsamı

Yazılımın temel amacı, kullanıcı tarafından seçilen bir koordinatın etrafındaki **benzer değerleri tespit edip temizleyen özyinelemeli bir mekanizma** oluşturmaktır.

### Temel Bileşenler

* **Dizi Yönetimi**
  Oyun alanı, `10 × 10` boyutunda bir tam sayı matrisi olarak yapılandırılmıştır.

* **Özyineleme (Recursion)**
  Bir hücre seçildiğinde, fonksiyon kendi kendini çağırarak **üst, sağ, alt ve sol** yönlerdeki komşu hücreleri tarar.

* **Dosya Entegrasyonu**
  Oyun haritası, `harita.txt` dosyasından `BufferedReader` aracılığıyla **dinamik olarak yüklenir**.

---

## 🛠️ Yazılım Tasarımı ve Çözüm Yaklaşımları

### 1️⃣ Özyinelemeli Tarama ve Kontrol

Seçilen hücrenin etrafındaki **aynı değere sahip komşuların taranması**, projenin en kritik parçasıdır.

* Tarama işlemi **saat yönünde** (yukarı → sağ → aşağı → sol) gerçekleştirilir.
* Eğer bir komşu hücre, ana hücre ile **aynı değere sahipse**, fonksiyon o hücre için tekrar çağrılarak **zincirleme tarama** yapılır.

---

### 2️⃣ Sınır Kontrolü ve Güvenlik

Matris sınırlarının dışına çıkılmasını engellemek için **kontrollü koşullar** tanımlanmıştır.

* İlk satırın üstü
* Son satırın altı
* İlk sütunun solu
* Son sütunun sağı

gibi indis dışına çıkabilecek tüm bölgeler, `if` blokları ile güvenli şekilde denetlenmiştir.

---

### 3️⃣ Görselleştirme ve İşaretleme

Patlatılan veya eşleşen hücrelerin gösterimi için özel bir yöntem kullanılmıştır:

* Eşleşen hücreler arka planda **`-1`** değeri ile işaretlenir.
* `haritayiGoster` fonksiyonu, bu `-1` değerlerini ekranda **`X`** karakteri olarak gösterir.

Bu sayede temizlenen alanlar kullanıcı tarafından net bir şekilde ayırt edilebilir.

---

## 🎮 Kullanım Senaryosu

1. Yazılım başlatıldığında `harita.txt` dosyasındaki veriler matrise yüklenir ve ekrana basılır.
2. Kullanıcıdan bir **satır ve sütun koordinatı** girmesi beklenir (Örn: `4 5`).
3. Seçilen hücre ve bağlantılı tüm benzer hücreler temizlenerek harita güncellenir.
4. Kullanıcı `0 0` girişini yapana kadar oyun döngüsü devam eder.
5. `0 0` girildiğinde program sonlandırılır.

---

## 📂 Dosya Yapısı

* **Bom_Bom.java**
  Özyinelemeli algoritmayı ve ana oyun döngüsünü içeren kaynak kod.

* **rapor.pdf**
  Yazılım mimarisi, karşılaşılan problemler ve teknik çözümlerin detaylı analizini içeren doküman.

* **harita.txt**
  Oyunun başlangıç haritasını belirleyen veri dosyası.

---

hazırlayabilirim.
