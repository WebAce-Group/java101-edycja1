import java.util.Scanner;
import static java.lang.Math.*;


public class Zadanie9 {
    public static void main(String[] args) {
        int [] tab = new int[10];
        Scanner liczba = new Scanner(System.in);
        int k=0;
        System.out.println("Podawaj liczby: ");
        for (int i=0; i<10; i++){
            tab[i]=liczba.nextInt();
        }

        System.out.println("Liczby podniesione do potęgi indeksu: ");

        for (int x: tab) {
            System.out.println(pow(x, k));
            k++;
        }
    }
}
