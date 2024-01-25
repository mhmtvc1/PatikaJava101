import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {

        int n1, n2, select ;

        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        n1 = input.nextInt();


        System.out.println("ikinci sayıyı giriniz");
        n2 = input.nextInt();

        System.out.println("1-toplam \n2-çıkarma \n3-çarpma \n4-bölme" );
        System.out.println("seçiminiz nedir?");

        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("toplam: "+(n1+n2));
                break;
            case 2:
                System.out.println("kalan: "+(n1-n2));
                break;
            case 3:
                System.out.println("çarpım: "+(n1*n2));
                break;
            case 4:
                System.out.println("bölüm: "+(n1/n2));
                break;
            case 6:
                System.out.println("bir sayı sıfıra bölünemez");
            default:
                System.out.println("yanlış seçim yaptınız");

        }












        /*

        if (select==1){
            System.out.println("toplama sonucu: "+ (n1+n2));
        } else if (select==2) {
            System.out.println("kalan sonucu: "+ (n1-n2));
        } else if (select==3) {
            System.out.println("çarpım sonucu: "+ (n1*n2));
        } else if (select==4) {
            if (n2!=0){
                System.out.println("bölüm sonucu: "+ (n1/n2));
            } else {
                System.out.println("bir sayı sıfıra bölünemez");

            }
        }else {
            System.out.println("yanlış seçim yaptınız");
        } */






    }
}
