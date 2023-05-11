package w1.hjxxzk;

public class Zadanie1 {
    public static void main(String[] args) {

        int a = 1, b = 2, c = 3, d = 4;
        int ab = a + b;
        int cd = c - d;

        System.out.println("Reszta z dzielenia ab przez b wynosi " + ab%b);

        double e = 1.1, f = 2.2, g = 3.3, h = 4.4;
        double ef = e * f;
        double gh = g / h;

        char i = 'A';
        char j = 'a';

        System.out.println(i + j);  // Zmienne i oraz j da się do siebie dodać, wynikiem będzie liczba 62, która jest sumą wartości liczbowych przypisanych do A i a
        System.out.println((int)i + " + " + (int)j + " = " + (i + j));

        String k = "Ala";
        String l = "ma";

        System.out.println(k + l);  // Można dodać do siebie dwie zmienne typu String

        boolean m = true;
        boolean n = false;

        System.out.println(m && n); // False

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("ab = " + ab);
        System.out.println("cd = " + cd);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("ef = " + ef);
        System.out.println("gh = " + gh);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println("n = " + n);

    }
}
