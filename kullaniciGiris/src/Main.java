import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String username, password;
        char sifre;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        username = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("dev")) {
            System.out.print("Başarılı giriş: ");
        } else {
            System.out.println("Başarısız giriş. ");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? Y/N : ");
            sifre = input.next().charAt(0);
            if (sifre == 'Y') {

                System.out.print("Lütfen yeni şifrenizi giriniz: ");
                String newPassword = input.next();

                if (newPassword.equals(password) || newPassword.equals("dev")) {
                    System.out.print("Şifre oluşturulamadı");
                } else {
                    System.out.print("Şifre oluşturuldu.");
                }
            } else if (sifre == 'N') {
                System.out.print("Şifre oluşturma işleminiz iptal edildi..");

            } else {
                System.out.print("Lütfen geçerli parametre giriniz. Y (YES) veya N (NO) !!!");
            }
        }

    }

}

