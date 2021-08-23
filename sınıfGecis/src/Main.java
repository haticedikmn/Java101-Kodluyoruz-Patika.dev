import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                double mat,fizik,kimya,turkce,muzik;
                Scanner input = new Scanner(System.in);

                System.out.print("Matematik notunuzu giriniz = ");
                mat = input.nextInt();

                System.out.print("Fizik notunuzu giriniz = ");
                fizik = input.nextInt();

                System.out.print("Kimya notunuzu giriniz = ");
                kimya = input.nextInt();

                System.out.print("Türkçe notunuzu giriniz = ");
                turkce = input.nextInt();

                System.out.print("Müzik notunuzu giriniz = ");
                muzik = input.nextInt();

                double sonuc = (mat+fizik+kimya+turkce+muzik)/5;

                if(sonuc > 55){
                    System.out.print("Sınıfı geçtiniz. Tebrikleeer . ");

                }else{
                    System.out.println("Sınıfta kaldınız tekrar deneyiniz !!");
                }
                   System.out.print("Ortalamanız : " + sonuc);
            }
        }

