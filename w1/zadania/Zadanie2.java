import static java.lang.Math.*;
public class Zadanie2 {
    public static void main(String[] args){

        int a = 5;
        int b = 10;
        double c;
        double d;

        c = pow(a,b);
        d = sqrt(c);

        System.out.println("Wartość a = " + a);
        System.out.println("Wartość b = " + b);
        System.out.println("Wartość c = " + c);
        System.out.println("Wartość d = " + d);

        int e = -5;
        double g;
        double h;

        g = abs(e);
        h = 10.5001;
        h = round(h);

        System.out.println("Wartość e = " + e);
        System.out.println("Wartość g = " + g);
        System.out.println("Wartość h = " + h);

    }
}