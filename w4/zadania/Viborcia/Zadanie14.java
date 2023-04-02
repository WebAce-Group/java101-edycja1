package w4.zadania.Viborcia;

import java.util.Locale;
import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        //scanner.useLocale(Locale.GERMANY);
        System.out.println("Podaj  i szerokosc prostokata: ");
        Rectangle rectangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Pole prostokata wynosi: "+rectangle.getArea());
        System.out.println("Obwod prostokata wynosi: "+rectangle.getPerimeter());
    }
}
