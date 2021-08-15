import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double kilo, boy, sonuc;


	Scanner input = new Scanner(System.in);
	System.out.print("Lütfen kilonuzu(kg) giriniz :");
	kilo = input.nextDouble();
	System.out.print("Lütfen boyunuzu(m) giriniz: ");
	boy = input.nextDouble();

	 sonuc = kilo / boy * boy;
	 System.out.print("Vücut Kitle İndeksiniz : " + sonuc);

    }
}
