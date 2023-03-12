package w2.zadania.Viborcia;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        boolean a = true;
        int suma=0;
        Scanner scanner = new Scanner(System.in);
        while(a)
        {
            System.out.println("Podaj liczbe calkowita: ");
            int liczba = scanner.nextInt();
            if(liczba==0)
            {
                a = false;
            }
            else
            {
                suma+=liczba;
            }
            System.out.println("Suma podanych liczb to: " + suma);
        }

    }
}
