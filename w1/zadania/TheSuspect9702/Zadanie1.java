package w1.zadania.TheSuspect9702;

public class Zadanie1 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4;
        int ab = a + b, cd = c - d;
        double e = 1.1, f = 2.2, g = 3.3, h = 4.4;
        double ef = e*f, gh = g/h;
        System.out.println("Reszta z dzielenia ab przez b to: " + ab%b);
        char i = 'A', j = 'a';
        System.out.println("i + j: " + (i + j));
        String k = "Ala", l = "ma";
        System.out.println("k + l: " + (k + l));
        boolean m = true, n = false;
        System.out.println("m&&n: " + (m&&n));
        System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d + " e = " + e + " f = " + f
                + " g = " + g + " h = " + h + " i = " + i + " j = " + j + " k = " + k + " l = " + l + " m = "
                + m + " n = " + n);
        System.out.println("ab = " + ab + " cd = " + cd + " ef = " + ef + " gh = " + gh);
    }
}