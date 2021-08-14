import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double hamTutar, kdvliTutar, kdv, kdv1=1.8, kdv2=0.8;

        Scanner input = new Scanner(System.in);
        System.out.println("Paranızı giriniz :");
        hamTutar = input.nextDouble();

        boolean kosul1 = hamTutar >= 0;
        boolean kosul2 = hamTutar < 1000;
        boolean sonuc = kosul1 && kosul2;

        System.out.println("KDV'siz Tutar : " + hamTutar);

        kdv = (sonuc)? kdv1 : kdv2;
        kdvliTutar = hamTutar +  kdv;

        System.out.println("KDV'li Tutar :" + kdvliTutar);
        System.out.println("KDV Tutarı :" + kdv);


    }
}
