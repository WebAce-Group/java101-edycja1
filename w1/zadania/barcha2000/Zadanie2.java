import static java.lang.Math.*;


public class Zadanie2 {
    public static void main(String[] args) {

        // Utwórz 2 zmienne całkowite (typu int) o nazwach: a, b i przypisz im wartości: 5, 10.
        int a = 5;
        int b = 10;

        // Utwórz 2 zmienne zmiennoprzecinkowe (typu double) o nazwach: c, d.
        double c, d;

        // Zmiennej c przypisz wartość a podniesioną do potęgi b (stosując odpowiednią metodę z klasy java.lang.Math).
        c = pow(a,b);

        // Zmiennej d przypisz wartość pierwiastka kwadratowego c(stosując odpowiednią metodę z klasy java.lang.Math).
        d = sqrt(c);

        // Wyświetl w konsoli wartość wszystkich zmiennych.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // Utwórz zmienną całkowitą (typu int) o nazwie: e i przypisz jej wartość: -5.
        int e = 5;

        // Utwórz 2 zmienne zmiennoprzecinkowe (typu double) o nazwach: g, h.
        double g, h;

        // Zmiennej g przypisz wartość bezwględną e (stosując odpowiednią metodę z klasy java.lang.Math).
        g = abs(e);

        // Zmiennej h przypisz wartość 10.5001.
        h = 10.5001;

        // Teraz, zaokrąglij wartość zmiennej h do najbliższej liczby całkowitej (stosując odpowiednią metodę z klasy java.lang.Math).
        h = round(h);

        // Wyświetl w konsoli wartość wszystkich zmiennych.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(g);
        System.out.println(h);

    }
}