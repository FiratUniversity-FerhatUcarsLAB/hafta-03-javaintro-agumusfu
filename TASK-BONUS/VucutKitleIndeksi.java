
public class VucutKitleIndeksi {

    public static void main(String[] args) {
        
        // Değerleri gir.
        double kilo = 97.0;
        double boyCm = 180.0;
        
        // 1. Adım: Boyu santimetreden metreye çevir (180 cm -> 1.8 m)
        // (100.0'a bölerek ondalıklı sonuç alabiliriz.)
        double boyMetre = boyCm / 100.0;
        
        // 2. Adım: VKİ formülünü uygula
        // Kilo / (Boy * Boy)
        double vki = kilo / (boyMetre * boyMetre); 
        
        // Sonuçları ekrana yazdır.
        System.out.println("Boyunuz: " + boyCm + " cm");
        System.out.println("Kilonuz: " + kilo + " kg");
        System.out.println("-------------------------------");
        System.out.printf("Vücut Kitle İndeksi (VKİ): %.2f\n", vki);
    }
}
