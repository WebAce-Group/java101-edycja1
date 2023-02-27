import static java.lang.Math.*;
public class Zadanie2 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        double c;
        double d;
        c = pow(a, b);
        d = sqrt(c);

        System.out.println("zmienna a ma wartosc: " + a);
        System.out.println("zmienna b ma wartosc: " + b);
        System.out.println("zmienna c ma wartosc: " + c);
        System.out.println("zmienna d ma wartosc: " + d);

        int e = -5;
        double g;
        double h;
        g = abs(e);
        h = 10.5001;
        h = round(h);

        System.out.println("zmienna e ma wartosc: " + e);
        System.out.println("zmienna g ma wartosc: " + g);
        System.out.println("zmienna h ma wartosc: " + h);

    }
}
