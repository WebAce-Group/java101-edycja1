package w1.zadania.Nurek54;
import static java.lang.Math.*;

public class Zadanie2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double c = pow(a, b);
        double d = sqrt(c);

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);

        int e = -5;
        double g = abs(e);
        double h = 10.5001;

        int ZaokragloneH = (int) round(h);

        System.out.println("e: " + e);
        System.out.println("g: " + g);
        System.out.println("h: " + h);
        System.out.println("Zaokraglenie h: " + ZaokragloneH);
    }
}

