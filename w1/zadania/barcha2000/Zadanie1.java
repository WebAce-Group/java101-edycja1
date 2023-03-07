import java.io.*;

public class Zadanie1 {
    public static void main(String[] args) {

        // Utwórz 4 zmienne całkowite (typu int) o nazwach: a, b, c, d i przypisz im wartości: 1, 2, 3, 4.
        int a = 1, b = 2, c = 3, d = 4;

        // Utwórz 2 nowe zmienne całkowite (typu int) o nazwach: ab, cd. Wartością ab ma być suma wartości zmiennych a i b, a wartością cd różnica wartości zmiennych c i d.
        int ab = a + b, cd = c - d;

        // Utwórz 4 zmienne zmiennoprzecinkowe (typu double) o nazwach: e, f, g, h i przypisz im wartości: 1.1, 2.2, 3.3, 4.4.
        double e = 1.1, f = 2.2, g = 3.3, h = 4.4;

        // Utwórz 2 nowe zmienne zmiennoprzecinkowe (typu double) o nazwach: ef, gh. Wartością ef ma być wynik mnożenia wartości zmiennych e i f, a wartością gh wynik dzielenia wartości zmiennych g i h.
        double ef = e*f, gh = g/h;

        // Jaka będzie reszta z dzielenia zmiennej ab przez zmienną b?
        System.out.println(ab%b);
        // Odp: Reszta z dzielenia ab przez a to 1

        // Utwórz 2 zmienne typu char o nazwach: i, j i przypisz im wartości: 'A', 'a'.
        char i = 'A', j = 'a';

        // Sprawdź czy da się dodać do siebie zmienne i i j. Jeśli nie, to dlaczego? Jeśli tak, to jaka będzie wartość?
        System.out.println(i + j);
        // Można dodawać char. Otrzymujemy Sumę odpowiadających wartości ASCII

        // Utwórz 2 zmienne typu String o nazwach: k, l i przypisz im wartości: "Ala", "ma"
        String k = "Ala", l = "ma";

        // Sprawdź czy da się dodać do siebie zmienne k i l. Jeśli nie, to dlaczego? Jeśli tak, to jaka będzie wartość?
        System.out.println(k + l);
        // Można dodawać Stringi. Wartość sumy to po prostu "Alama"

        // Utwórz 2 zmienne typu boolean o nazwach: m, n i przypisz im wartości: true, false.
        boolean m = true, n = false;

        // Wyświetl w konsoli wartość wyrażenia m && n
        System.out.println(m && n);

        // Wyświetl w konsoli wartość wszystkich zmiennych.
        System.out.println(a);
        System.out.println(b);
        System.out.println(ab);
        System.out.println(c);
        System.out.println(d);
        System.out.println(cd);
        System.out.println(e);
        System.out.println(f);
        System.out.println(ef);
        System.out.println(g);
        System.out.println(h);
        System.out.println(gh);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);


    }
}