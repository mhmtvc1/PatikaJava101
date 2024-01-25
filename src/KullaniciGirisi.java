import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {

        // bu kod hatalı!!!

        String userName, password, passwordnew;
        int select;

        Scanner inp = new Scanner(System.in);

        System.out.println("kullanıcı adınızı giriniz: ");
        userName = inp.nextLine();


        if (userName.equals("mehmet") ){
            System.out.println("kullanıcı adınız doğru");

            System.out.println("şimdi şifrenizi giriniz");
            password = inp.nextLine();

            if (password.equals("mehmet123")){
                System.out.println("şifreniz doğru");
            } else {
                System.out.println("şifreniz yanlış, sıfırlamak istermisiniz? (evet=1, hayır=2)");
            }

            select = inp.nextInt();

            if (select!=1 && select!=2){
                System.out.println("yanlış sayı girdiniz");
            } else if (select==1) {
                System.out.println("yeni şifrenizi giriniz");




            } else {
                System.out.println("program sonlandı");
            }
            passwordnew = inp.nextLine();


            if (passwordnew.equals(password) ) {
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

            } else {
                System.out.println("şifreniz oluşturuldu");
            }


        } else {
            System.out.println("kulanıcı adınız yanlış!");
            System.out.println("program sonlandı");

        }















    }
}
