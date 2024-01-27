import java.util.Scanner;


public class NotOrtalamasiHesaplayanProgram {


    public static void main(String[] args){

        int mat, fizik, kimya, biyoloji, tarih, turkce;

        Scanner inp = new Scanner(System.in);

        System.out.println("matematik notunuzu girin:");
        mat = inp.nextInt();


        System.out.println("fizik notunuzu girin:");
        fizik = inp.nextInt();


        System.out.println("kimya notunuzu girin");
        kimya = inp.nextInt();


        System.out.println("biyoloji notunuzu girin");
        biyoloji = inp.nextInt();


        System.out.println("tarih notunuzu girin");
        tarih = inp.nextInt();


        System.out.println("turkce notunuzu girin");
        turkce = inp.nextInt();

        double cal = ((mat+fizik+kimya+biyoloji+tarih+turkce)/6.0);

        boolean passFail = cal>=60.0;

        String strPassfail = passFail ? "geçti":"kaldı";
        System.out.println("ortalamanız: " + cal + '\n' + "sonuç: "+strPassfail);



    }

}


