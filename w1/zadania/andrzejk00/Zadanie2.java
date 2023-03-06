package w1.zadania.andrzejk00;

import static java.lang.Math.*;
import static java.lang.Math.round;

public class Zadanie2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double c = pow(a,b);
        double d = sqrt(c);

        System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);


        int e = -5;
        double g = abs(e);
        double h = 10.5001;
        h = round(h);

        System.out.println("e=" + e + " g=" + g + " h=" + h);
    }
}
