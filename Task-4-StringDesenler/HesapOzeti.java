public class HesapOzeti {

    public static void main(String[] args) {
        
        // Sütun başlıkları ve veriler
        String[] columnNames = {"URUN", "MIKTAR", "FIYAT"};
        Object[][] data = {
            {"ELMA", "1KG", "65TL"},
            {"ARMUT", "2KG", "200TL"},
            {"KIRAZ", "1KG", "500TL"},
            {"SEFTALI", "3KG", "450TL"}
        };

        // En uzun kelimelere göre sütun genişliklerini belirleyelim (elle yaptık)
        int col1Width = 10;
        int col2Width = 8;
        int col3Width = 8;

        // Ayırıcı çizgi için format
        // +------------+----------+----------+
        String separator = "+-" + "-".repeat(col1Width) + 
                           "-+-" + "-".repeat(col2Width) + 
                           "-+-" + "-".repeat(col3Width) + "-+";

        // Satır formatı: | %-10s | %-8s | %-8s |
        // % : formatlama başlıyor
        // - : sola yasla
        // 10s : 10 karakterlik yer ayır (String için)
        String rowFormat = "| %-" + col1Width + "s " +
                           "| %-" + col2Width + "s " +
                           "| %-" + col3Width + "s |";

        
        // --- Tabloyu Çizdirmeye Başla ---

        // Başlık
        System.out.println("     ALIŞVERİŞ LİSTESİ");
        
        // Üst ayırıcı
        System.out.println(separator);
        
        // Sütun başlıkları
        System.out.printf(rowFormat + "\n", columnNames[0], columnNames[1], columnNames[2]);

        // Başlık altı ayırıcı
        System.out.println(separator);

        // Veri satırları
        for (Object[] row : data) {
            System.out.printf(rowFormat + "\n", row[0], row[1], row[2]);
        }

        // Alt ayırıcı
        System.out.println(separator);
    }
}