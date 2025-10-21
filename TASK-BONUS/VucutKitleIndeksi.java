public class VucutKitleIndeksi {
    public static void main(String[] args){
double kilo = 75;      // Kiloyu 75 olarak belirledik
double boy = 1.80;     // Boyu 1.80 metre olarak belirledik

// 2. BMI Hesaplaması
// Formül: BMI = kilo / (boy * boy)
double bmi = kilo / (boy * boy);

// 3. Sonucu Ekrana Yazdır
System.out.println("Kilo: " + kilo + " kg");
System.out.println("Boy: " + boy + " m");
System.out.println("Hesaplanan Vücut Kitle İndeksi (BMI): " + String.format("%.2f", bmi));
}
}