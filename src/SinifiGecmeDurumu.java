import java.util.ArrayList;
import java.util.Scanner;

public class SinifiGecmeDurumu {

    public static void main(String[] args){

        int math, physics, chemical, music, turkish;

        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> lessons = new ArrayList<Integer>();

        System.out.println("enter your math grade:");
        math = inp.nextInt();
        if (math>=0 && math <= 100)lessons.add(math);


        System.out.println("enter your physics grade:");
        physics = inp.nextInt();
        if (physics>=0 && physics <= 100)lessons.add(physics);


        System.out.println("enter your chemical grade");
        chemical = inp.nextInt();
        if (chemical>=0 && chemical <= 100)lessons.add(chemical);


        System.out.println("enter your music grade");
        music = inp.nextInt();
        if (music>=0 && music <= 100)lessons.add(music);



        System.out.println("enter your turkiskh grade");
        turkish = inp.nextInt();
        if (turkish>=0 && turkish <= 100)lessons.add(turkish);



        double cal = (lessons.stream().mapToInt(Integer::intValue).sum()) / lessons.size();

        System.out.println("ortalama notunuz "+cal);
        String result = (cal>=55) ? "sınıfı geçtiniz!" : "kaldınız!";
        System.out.println(result);
    }
}
