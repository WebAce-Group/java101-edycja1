import static java.lang.Math.*;
public class Zadanie2 {
    public static void main(String[] args) {
        int a = 5;
        int b=10;
        double c,d;

        c = pow(a, b);
        d = sqrt(c);

        System.out.println("Zmienna a ma wartosc: "+ a);
        System.out.println("Zmienna b ma wartosc: "+ b);
        System.out.println("Zmienna c ma wartosc: "+ c);
        System.out.println("Zmienna d ma wartosc: "+ d);

        int e = -5;
        double g, h;

        g = abs(e);
        h = 10.5001;

        h = round(h);

        System.out.println("Zmienna e ma wartosc: "+ e);
        System.out.println("Zmienna g ma wartosc: "+ g);
        System.out.println("Zmienna h ma wartosc: "+ h);


    }
}