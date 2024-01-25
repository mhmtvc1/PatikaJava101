import java.util.Scanner;

public class VucutKitleEndeksiHesaplayanProgram {
    public static void main(String[] args) {

        int weight;
        double height;
        double endeks;

        Scanner inp = new Scanner(System.in);


        System.out.print("kilo giriniz : ");
        weight = inp.nextInt();

        System.out.print("boy giriniz(M) : ");
        height = inp.nextDouble();

        endeks = (weight/(height*height));

        System.out.println("vücut kitle endeksiniz : "+endeks);








    }
}