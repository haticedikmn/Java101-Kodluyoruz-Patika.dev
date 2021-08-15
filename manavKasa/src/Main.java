import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double aKg=2.14, eKg=3.67, dKg=1.11, mKg=0.95, pKg=5.0, armut, elma, domates, muz, patlıcan, tutar;
	Scanner input = new Scanner(System.in);

	   System.out.print("Armut Kaç Kilo? :");
	    armut = input.nextDouble();
		System.out.print("Elma Kaç Kilo? :");
		elma = input.nextDouble();
		System.out.print("Muz Kaç Kilo? :");
		muz = input.nextDouble();
		System.out.print("Domates Kaç Kilo? :");
		domates = input.nextDouble();
		System.out.print("Patlıcan Kaç Kilo? :");
		patlıcan = input.nextDouble();

		tutar = (aKg*armut)+(eKg*elma)+(dKg*domates)+(mKg*muz)+(pKg*patlıcan);
		System.out.print("Toplam Tutar :" + tutar + "TL");







    }
}
