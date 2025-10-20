import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class HesapOzeti {

    public static void main(String[] args) {
        // Swing bileşenlerinin doğru çalışması için bu gereklidir
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // 1. Pencereyi (JFrame) oluştur
                JFrame frame = new JFrame("ALISVERIS LISTESI");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Pencere kapanınca program dursun
                frame.setSize(500, 300); // Pencere boyutu

                // 2. Tablo verilerini hazırla
                // Sütun başlıkları
                String[] columnNames = {"URUN", "MIKTAR", "FIYAT"};

                // Satır verileri (2D Dizi)
                Object[][] data = {
                    {"ELMA", "1KG", "65TL"},
                    {"ARMUT", "2KG", "200TL"},
                    {"KIRAZ", "1KG", "500TL"},
                    {"SEFTALI", "3KG", "450TL"}
                    
                };

                // 3. JTable'ı oluştur
                JTable table = new JTable(data, columnNames);

                // 4. JTable'ı bir JScrollPane içine koy (Kaydırma çubukları ekler)
                // Tablolar genellikle çok satırlı olur, bu yüzden kaydırma çubuğu
                // (JScrollPane) içine almak iyi bir pratiktir.
                JScrollPane scrollPane = new JScrollPane(table);

                // 5. ScrollPane'i (ve dolayısıyla tabloyu) pencereye ekle
                frame.add(scrollPane);

                // 6. Pencereyi görünür yap
                frame.setVisible(true);
            }
        });
    }
}