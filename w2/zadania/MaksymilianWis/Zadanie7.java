package w2.zadania.MaksymilianWis;
import java.util.Scanner;

public class Zadanie7 {
    class metody{
        public static void petlaDoWhile()
        {
            Scanner scan = new Scanner(System.in);
            int n=0, sum =0, i=0;
            do{
                System.out.println("Dopoki nie zostanie podana liczba wieksza niz 100, program usredni podane liczby: ");
            n = scan.nextInt();
            sum += n;
            i++;
            }while(n<=100);
            System.out.println("Srednia arytmetyczna podanych liczb to: " + (sum/i));
            scan.close();
        } 
    }

    public static void main(String[] args) {
        metody.petlaDoWhile();
    }
}
