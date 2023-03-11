package w2.Zadania.MiloszWS;
import java.util.Scanner;


public class Zadanie7 {
    public static void main(String[] args)
    {
        Scanner Liczba = new Scanner(System.in);
        int n,srednia,suma=0, licznik=0;

        do {
            System.out.println("Prosze podac liczbe: ");
            n = Liczba.nextInt();
            suma+=n;
            licznik++;
        } while (n<=100);
        srednia=suma/licznik;
        System.out.println("Średnia wynosi: " + srednia);
    }

}
