import java.util.Scanner;

public class DikUcgendeHipotenusBulanProgram {

    public static void main(String[] args) {

        double a,b,c,u,alan;

        Scanner inp = new Scanner(System.in);

        System.out.println("1.kenar uzunluğunu giriniz");
        a= inp.nextInt();

        System.out.println("2.kenar uzunluğunu giriniz");
        b= inp.nextInt();

        System.out.println("3.kenar uzunluğunu giriniz");
        c= inp.nextInt();

        u=(a+b+c)/2;
        System.out.println("üçgenin çevre uzunluğu :   "+ u*2);

        alan=u*u;
        System.out.println("üçgenin alanı :  "+ alan);






    }
}