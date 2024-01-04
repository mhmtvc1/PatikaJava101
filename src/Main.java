import java.util.Scanner;

public class Main {public static void main(String[] args) {

       int mat,fizik,kimya,turkce,tarih,muzik;

       Scanner inp = new Scanner(System.in);


       System.out.print("matematik notunuzu giriniz:  ");
       mat = inp.nextInt();

       System.out.print("fizik notunuzu giriniz:  ");
       fizik = inp.nextInt();

       System.out.print("kimya notunuzu giriniz:  ");
       kimya = inp.nextInt();

       System.out.print("türkçe notunuzu giriniz:  ");
       turkce = inp.nextInt();

       System.out.print("tarih notunuzu giriniz:  ");
       tarih = inp.nextInt();

       System.out.print("müzik notunuzu giriniz:  ");
       muzik = inp.nextInt();

       int sonuc = (mat+fizik+kimya+turkce+tarih+muzik);
       double ortalama = sonuc/6.0;
 System.out.println("ortalamanız:  "+ortalama);



    String gec = ortalama >= 60 ? " sınıfı geçtin" : "sınıfta kaldı";
    System.out.println(gec);

 }

}
