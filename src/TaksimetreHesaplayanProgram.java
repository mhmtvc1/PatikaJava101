import java.util.Scanner;

public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {

        double km, acilissucreti = 10.0, perkm = 2.20, total ;

        Scanner inp = new Scanner(System.in);


        System.out.println("yolculuk mesafesi : " );
        km = inp.nextInt();

        total = acilissucreti+ (km*perkm);


        total= (total<20.0) ? 20 : total;

        System.out.println("toplam tutar :  "+total);


    }
}