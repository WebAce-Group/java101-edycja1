public class Zadanie1 {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int ab = a + b;
        int cd = c - d;

        System.out.println("zmienna a ma wartosc: " + a);
        System.out.println("zmienna b ma wartosc: " + b);
        System.out.println("zmienna c ma wartosc: " + c);
        System.out.println("zmienna d ma wartosc: " + d);
        System.out.println("zmienna ab ma wartosc: " + ab);
        System.out.println("zmienna cd ma wartosc: " + cd);

        double e = 1.1;
        double f = 2.2;
        double g = 3.3;
        double h = 4.4;
        double ef = e * f;
        double gh = g / h;

        System.out.println("zmienna e ma wartosc: " + e);
        System.out.println("zmienna f ma wartosc: " + f);
        System.out.println("zmienna g ma wartosc: " + g);
        System.out.println("zmienna h ma wartosc: " + h);
        System.out.println("zmienna ef ma wartosc: " + ef);
        System.out.println("zmienna gh ma wartosc: " + gh);

        int abb = ab % b;

        System.out.println("zmienna abb ma wartosc: " + abb);

        char i = 'A';
        char j = 'a';

        System.out.println("zmienna i ma wartosc: " + i);
        System.out.println("zmienna j ma wartosc: " + j);

        System.out.println("dodawanie i oraz j: " + i + j);
        // lub
        System.out.println("dodawanie i oraz j: " + (i + j));

        String k = "Ala";
        String l = "ma";

        System.out.println("dodawanie k oraz l: " + k + l);
        System.out.println("dodawanie k oraz l: " + (k + l));

        boolean m = true;
        boolean n = false;

        System.out.println("sprawdzanie wartosci m oraz n: " + (m && n)); // krzyczy, bo zawsze prawda

    }
}
