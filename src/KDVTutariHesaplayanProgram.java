import java.util.Scanner;

public class KDVTutariHesaplayanProgram {
    public static void main(String[] args) {

        double tutar,kdvorani,kdvtutari,kdvlitutar;

        Scanner inp = new Scanner(System.in);
        System.out.println("ücret tutarını giriniz :   ");
        tutar = inp.nextDouble();

        kdvorani = tutar>0&&tutar<=1000? 0.18:0.08;

        kdvtutari= tutar*kdvorani;
        kdvlitutar= tutar+kdvtutari;



        System.out.println("Kdv'siz Tutar :   "+tutar);
        System.out.println("KDV Oranı :  "+ kdvorani);
        System.out.println("KDV Tutarı :   "+ kdvtutari);
        System.out.println("KDV Dahil Tutar :   "+kdvlitutar);



    }
}