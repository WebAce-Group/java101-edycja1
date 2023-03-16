package w2.zadania.Viborcia;
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        int liczba=0;
        double srednia;
        int licznik=0;
        int suma=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Podaj liczbe calkowita: ");
            liczba = scanner.nextInt();
            licznik ++;
            suma+=liczba;
            srednia= (double) suma/licznik;
            System.out.println("Srednia arytmetyczna podanych liczb to: " + srednia);
        } while (liczba<100);

    }
}
