package w4.zadania.Viborcia;

import java.util.Locale;
import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        //scanner.useLocale(Locale.GERMANY);
        System.out.println("Podaj numer konta oraz saldo konta: ");
        KontoBankowe konto = new KontoBankowe(scanner.nextInt() , scanner.nextDouble());
        System.out.println("Stan konta to: "+ konto.getSaldo());
        System.out.println("Podaj kwote, ktora chcesz wplacic: ");
        konto.wplacanie(scanner.nextDouble());
        System.out.println("Stan konta to: "+ konto.getSaldo());
        System.out.println("Podaj kwote, ktora chcesz wyplacic: ");
        konto.wyplacanie(scanner.nextDouble());
        System.out.println("Stan konta to: "+ konto.getSaldo());

    }
}
