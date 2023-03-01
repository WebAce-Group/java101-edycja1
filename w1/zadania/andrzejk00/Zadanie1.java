package w1.zadania.andrzejk00;

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

        System.out.println(ab%b);

        char i = 'A';
        char j = 'a';

        System.out.println(i + j);

        String k = "Ala";
        String l = "ma";

        System.out.println(k + l);

        boolean m = true;
        boolean n = false;

        System.out.println(m && n);

        System.out.println("a=" + a + " b =" + b + " c=" + c + " d=" + d + "  e=" + e + " f=" + f + " g=" + g +
                " h=" + h + " i=" + i + " j=" + j + " k=" + k + " l=" + l + " m=" + m + " n=" + n);
        System.out.println("ab= " + ab + " cd= " + cd + " ef= " + ef + " gh= " + gh );

    }
}
