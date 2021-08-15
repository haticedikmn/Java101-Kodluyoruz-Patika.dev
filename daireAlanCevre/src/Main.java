import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int r;
	double n=3.14, alan, cevre, dilimAlan, a;

	Scanner input = new Scanner(System.in);
	System.out.print(" Lütfen dairenin yarıçapını giriniz :" );
	r = input.nextInt();
	System.out.print("Lütfen dairenin merkez açısını giriniz :");
	a = input.nextDouble();;

	alan = n*r*r;
	cevre = 2*n*r;
	dilimAlan = (n*(r*r)*a)/360;

	System.out.println("Dairenin Alanı :" + alan);
	System.out.println("Dairenin Çevresi :" + cevre);
	System.out.print("Daire diliminin alanı :" +dilimAlan);

    }
}
