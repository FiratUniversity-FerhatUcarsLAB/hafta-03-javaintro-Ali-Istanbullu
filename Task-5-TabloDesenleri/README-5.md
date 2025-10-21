AD-SOYAD = ALİ İSTANBULLU 
ÖĞRENCİ NO = 250542019
Proje Başlığı: Java ile Tablo Desenleri Oluşturma

Projenin Amacı:
Bu projenin temel amacı, Java programlama dilindeki temel kontrol yapılarından olan `for` döngülerini kullanarak, belirli bir mantıksal kurala veya matematiksel formüle dayalı olarak yapılandırılmış veri tabloları oluşturmaktır.
"Tablo Deseni" kavramı, tekrarlanan bir mantıkla üretilen ve konsolda düzenli bir formatta sunulan veri çıktılarını ifade etmektedir.

Uygulanan Tablo Desenleri:

Bu proje kapsamında, aynı temel döngü mantığının farklı problemlere nasıl uyarlandığını göstermek için üç farklı tablo deseni programlanmıştır:

1.  Çarpım Tablosu Deseni:
    * Kural: sonuç = sayı * sayaç
    * Açıklama: Kullanıcı tarafından belirlenen bir sayının (örneğin 2), 1'den 10'a kadar olan tam sayılarla çarpımını sistematik olarak listeleyen klasik bir tablo desenidir.

2.  Mil-Kilometre Dönüşüm Tablosu Deseni:
    * Kural: kilometre = mil * 1.60934
    * Açıklama: Belirli bir mil aralığı (örneğin 1 milden 20 mile kadar) için kilometre karşılıklarını hesaplayan bir dönüşüm tablosu desenidir. Bu desen, sabit bir katsayıyla (dönüşüm oranı) artan değerlerin nasıl listeleneceğini gösterir.

3.  Üslü Sayılar Tablosu Deseni:
    * Kural: sonuç = taban^üs (kodda Math.pow(taban, us) veya döngü ile çarpım)
    * Açıklama: Belirlenen bir taban sayının (örneğin 3), 1'den 10'a kadar artan üslerinin (kuvvetlerinin) sonucunu hesaplayan matematiksel bir tablo desenidir.

Genel Sonuç:
Bu üç farklı çalışma, `for` döngülerinin; basit aritmetikten (çarpım), sabit katsayılı dönüşümlere (mil-km) ve üstel artışa (üslü sayılar) kadar çeşitli problemlere nasıl esnek bir şekilde uygulanabileceğini göstermektedir. Tüm desenler, System.out.println komutuyla biçimlendirilerek okunabilir bir tablo formatında sunulmuştur.
