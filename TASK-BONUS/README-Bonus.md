AD-SOYAD = ALİ İSTANBULLU 
OGRENCİ NO= 250542019

Bu bonus görevler,
Java dilindeki temel veri tipleri, matematiksel operatörler ve basit algoritmalar üzerine odaklanmaktadır.
Her bir görev, farklı bir problem çözme tekniğini pekiştirmek için tasarlanmıştır.

1. Bonus 1 - Saat Dönüştürme (Algoritma ve Mod Alma):
Bu görevde, `int` (tam sayı) veri tipi ve temel matematiksel operatörler kullanılmıştır.
 Problem, verilen toplam saniyeyi saat, dakika ve saniyeye ayırmaktı.
* Kullanılan Yöntem: `int` veri tipinin tam sayı bölmesi (/) ve mod alma (%) operatörleri bu problemin temelini oluşturmuştur.
* Toplam saniye önce 60'a bölünerek (/) `toplam_dakika` bulunmuş, 60'a bölümden kalanı (%) ise `kalan_saniye` olarak ayrılmıştır.
* Aynı mantık, `toplam_dakika` değerine uygulanarak `saat` (/ 60) ve `kalan_dakika` (% 60) bulunmuştur.
* Bu yöntem, büyük bir birimi daha küçük alt birimlere ayırmak için standart bir algoritmadır.

2. Bonus 2 - Vücut Kitle İndeksi (Formül ve Ondalıklı Sayılar):
Bu görevde, `double` (ondalıklı sayı) veri tipi kullanılarak bilinen bir matematiksel formül (BMI) uygulanmıştır.
* Kullanılan Yöntem: `kilo` ve `boy` (metre cinsinden) değişkenleri `double` olarak tanımlanmış
*  ve `bmi = kilo / (boy * boy)` formülü doğrudan koda aktarılmıştır. Sonucun daha okunaklı olması için `String.format("%.2f", bmi)`
*   metoduyla çıktı iki ondalık basamakla sınırlandırılmıştır.
* 

3. Bonus 3 - Para Bozma (Algoritma ve Mod Alma):
Bu görev, 1. Bonustaki saat dönüştürme mantığıyla birebir aynı algoritmayı kullanır.
* Kullanılan Yöntem: Belirlenen bir para miktarı (örn: 278 TL), en büyük banknottan (100 TL) başlanarak tam bölme (/) ile
*  kaç adet içerdiği bulunur. Ardından mod alma (%) ile kalan miktar bir sonraki küçük banknota (50 TL) devredilir.
*  Bu işlem 1 TL'ye kadar sistematik olarak tekrarlanır.

4. Bonus 4 - ASCII Sanatı (String Çıktısı):
Bu görev, `System.out.println()` komutunun yaratıcı kullanımına odaklanmıştır.
* Kullanılan Yöntem: Herhangi bir hesaplama yapılmadan, `*` (yıldız) ve boşluk karakterleri kullanılarak birden fazla
* `System.out.println` satırı ile konsola görsel bir desen (Ali ismi) "çizdirilmiştir".

Genel Sonuç:
Bu bonus görevler, Java'da / (bölme) ve % (mod alma) operatörlerinin algoritmik problemlerde 
(saat ve para) ne kadar güçlü olduğunu, `double` tipiyle ondalıklı hesaplamaların nasıl yapıldığını ve
`System.out.println` ile basit görsel çıktıların nasıl oluşturulabileceğini göstermiştir.
