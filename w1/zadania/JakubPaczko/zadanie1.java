public class zadanie1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int ab = a + b;
        int cd = c + d;

        double e = 1.1;
        double f = 2.2;
        double g = 3.3;
        double h = 4.4;

        double ef = e * f;
        double gh = g / h;

        System.out.println("reszta z dzielenia  g przez h: " + (g % h));

        char i = 'A';
        char j = 'a';

        System.out.println("summa 'i' i 'J': " + (i + j));
        // (suma = 162) suma ta wynosi tyle poniewaz dodawane sa indeksy liter w tablicy asci

        String k = "Ala";
        String l = "ma";

        System.out.println("summa 'k' i 'l': " + (k + l));
        // (suma = "Alama") suma ta jest spowodowana sklejeniem 2 stringow w 1

        boolean m = true;
        boolean n = false;

        System.out.println("n && m = " + (m && n));
        // wyrazenie konczy sie false poniewaz obie zmienne musialy by wynosic true aby wynik byl true

        System.out.println("wynik: " + a + ", " + b + ", "  + c + ", "  + d + ", "  + e + ", "  + f + ", "  + g + ", "
                           + h + ", "  + i + ", "  + j + ", "  + k + ", "  + l + ", "  + m + ", "  + n);
    }
}
