//HİPOTENÜSÜ BULAN KOD
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int uzunKnr, kısaKnr;
        double hipotenus;

        Scanner input = new Scanner(System.in);

        System.out.print("Kısa kenarı giriniz:");
        kısaKnr = input.nextInt();
        System.out.print("Uzun kenarı giriniz:");
        uzunKnr = input.nextInt();

        hipotenus = Math.sqrt((kısaKnr*kısaKnr) + (uzunKnr*uzunKnr));
        System.out.println("Hipotenüs :" + hipotenus);

    }
}



//ÜÇGENİN ALANINI HESAPLAYAN KOD

 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c;
        double alan, u;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz:");
        a = input.nextInt();
        System.out.print("2. Kenarı Giriniz:");
        b = input.nextInt();
        System.out.print("3. Kenarı Giriniz:");
        c = input.nextInt();

        u =(a+b+c)/2;
        alan = Math.sqrt(u*(u - a)* (u - b)*(u - c));
        System.out.println("Üçgenin Alanı : " + alan);

    }
}
