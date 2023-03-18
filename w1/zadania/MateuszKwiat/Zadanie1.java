public class Zadanie1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int ab = a + b;
        int cd = c - d;

        double e = 1.1;
        double f = 2.2;
        double g = 3.3;
        double h = 4.4;

        double ef = e * f;
        double gh = g / h;

        // Wynikiem jest 1
        System.out.println(ab % b);

        char i = 'A';
        char j = 'a';

        // Da sie. Wynikiem jest liczba calkowita ktorej wartoscia
        // jest suma wartosci tych znakow z tablicy ASCII
        System.out.println(i + j);

        String k = "Ala";
        String l = "ma";

        // Da sie poniewaz klasa String ma zdefiniowany operator dodawania.
        // Wynikiem jest zmienna typu String z wartoscia Alama
        System.out.println(k + l);

        boolean m = true;
        boolean n = false;

        System.out.println(m && n);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(ab);
        System.out.println(cd);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(ef);
        System.out.println(gh);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
    }
}