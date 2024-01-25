import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args) {

        double armutkg, elmakg, domateskg, muzkg, patlicankg, armut, elma, domates, muz, patlican, toplam;

        armutkg=2.14;
        elmakg=3.67;
        domateskg=1.11;
        muzkg=0.95;
        patlicankg=5;

        Scanner inp = new Scanner(System.in);

        System.out.print("armut kaç kilo? ");
        armut = inp.nextInt();
        System.out.print("elma kaç kilo? ");
        elma = inp.nextInt();
        System.out.print("domates kaç kilo? ");
        domates = inp.nextInt();
        System.out.print("muz kaç kilo? ");
        muz = inp.nextInt();
        System.out.print("patlıcan kaç kilo? ");
        patlican = inp.nextInt();

        toplam = armutkg*armut + elmakg*elma + domateskg*domates + muzkg*muz + patlicankg*patlican;

        System.out.println("toplam tutar : "+ toplam+ "TL");







    }
}
