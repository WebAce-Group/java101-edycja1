package w1.zadania.alekd77;

public class Zadanie2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double c = java.lang.Math.pow(a, b);
        double d = java.lang.Math.sqrt(c);

        System.out.printf("a: %d\tb: %d\tc: %.2f\td: %.2f\n\n", a, b, c, d);


        int e = -5;
        double g = java.lang.Math.abs(e);
        double h = 10.5001;
        h = java.lang.Math.round(h);

        System.out.printf("e: %d\tg: %.2f\th: %.2f", e, g, h);
    }
}
