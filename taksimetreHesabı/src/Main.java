import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  int km;
	  double xKm = 2.20, tutar , baslangic=10.0;

	  Scanner input = new Scanner(System.in);
	  System.out.print("Taksimetre ücreti için KM'yi girin lütfen : ");
	  km = input.nextInt();

	  tutar = (km * xKm) + baslangic ;

	  tutar = (tutar < 20)? 20 : tutar;
	  System.out.println("Ödenecek Tutar : " + tutar );
	  System.out.println("İyi Günler Dileriz <3");

    }
}
