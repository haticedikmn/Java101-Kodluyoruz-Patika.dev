import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x, y, z;

        Scanner input = new Scanner(System.in);

        System.out.println("Sayıları küçükten büyüğe sıralama.");
        System.out.print("İlk sayıyı giriniz :");
        x = input.nextInt();

        System.out.print("İkinci sayıyı giriniz :");
        y = input.nextInt();

        System.out.print("Üçüncü sayıyı giriniz :");
        z = input.nextInt();

        if ( (x < y) && (x<z)){
            if(y<z){
                System.out.print("Sayıların sıralaması : " + x + "<"+ y + "<" + z);
            }else{
                System.out.print("Sayıların sıralaması : " + x + "<"+ z + "<" + y);
            }
        }else if((y < z) && (y < x)){
            if(z < x){
                System.out.print("Sayıların sıralaması : " + y + "<"+ z + "<" + x);
            }else{
                System.out.print("Sayıların sıralaması : " + y + "<"+ x + "<" + z);
            }
        }else if((z<y) && (z<x)){
            if(y<x){
                System.out.print("Sayıların sıralaması : " + z + "<"+ y + "<" + x);
            }else{
                System.out.print("Sayıların sıralaması : " + z + "<"+ x + "<" + y);
            }
        }
    }
}

