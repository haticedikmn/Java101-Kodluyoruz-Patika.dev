import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sicaklik;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz: ");
        sicaklik = input.nextInt();

        if( sicaklik < 5){
            System.out.print("Kayak yapabilirsin. ");
        }else if( sicaklik < 15 ){
            System.out.print ("Sinemaya gidebilirsin. ");
        }else if( sicaklik == 15 ){
            System.out.print ("Sinemaya gidebilirsin veya ");
            System.out.print ("Hava çok güzel piknik yapabilirsin.");
        }else if ( sicaklik <= 25 ){
            System.out.println ("Hava çok güzel piknik yapabilirsin.");
        }else {
            System.out.print ("Hava çok sıcak yüzmeye gidebilirsin.");
        }

    }
}
