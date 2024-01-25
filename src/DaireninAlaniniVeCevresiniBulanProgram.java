import java.util.Scanner;

public class DaireninAlaniniVeCevresiniBulanProgram {
    public static void main(String[] args) {

        int r  ;
        double pi = 3.14, circum, area, centralAngle,area2;

        Scanner inp = new Scanner(System.in);

        System.out.print("dairenin yarıçapını giriniz :  ");
        r = inp  .nextInt();

        circum = (2*pi*r);
        System.out.println("dairenin çevresi : "+circum);

        area = pi*r*r;
        System.out.println("dairenin alanı : "+area);

        System.out.println("merkez açısının ölçüsünü giriniz : ");
        centralAngle = inp.nextInt();

        area2=(pi*r*r*centralAngle)/360;
        System.out.println("merkez açısının ölçüsünü girilen daire diliminin alanı : "+area2);










    }
}