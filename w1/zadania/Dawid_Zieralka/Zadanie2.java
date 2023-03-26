import static java.lang.Math.*;

public class Zadanie2 {
    public static void main(String[] args) {

        int a = 5, b = 10;
        double c, d;
        c = pow(a, b);
        d = sqrt(c);

        System.out.print(a+ " "+ b + " " + c + " " + d + '\n');

        int e = -5;
        double g, h;
        g = abs(e);
        h = 10.5001;
        h = round(h);

        System.out.print(e+ " "+ g + " " + h);

    }

}