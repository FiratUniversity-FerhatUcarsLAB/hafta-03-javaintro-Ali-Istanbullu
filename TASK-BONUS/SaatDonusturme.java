


public class SaatDonusturme{
    public static void main(String[] args){

        int birsaat = 60;
        int altmişdk = 60;
        int sn = 3600;
        int dk = sn/altmişdk;
        int kalan_dk = dk%altmişdk;
        int h = dk/birsaat;
        int kalan_h = h%60;
        int kalan_sn = sn%birsaat; 
        

        System.out.println("saat ="+kalan_h+" saat "+kalan_dk+" dk "+kalan_sn+" sn");

    }
}