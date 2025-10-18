public class UcgenAlanHesap{

    public static void main(String[] args){
   
     int a = 3;
     int b = 4;
     int c = 5;
     double s = (a + b + c)/2;
     
     double Alan_A = s*(s-a)*(s-b)*(s-c);
     double kok = Math.sqrt(Alan_A);
     System.out.println("ALAN = "+kok);

    }
}