import java.lang.Math;
public class Zadanie2 {
    public static void main(String[] args) {
        int a = 5, b = 10;
        double c = Math.pow(a, b);
        double d = Math.sqrt(c);
        System.out.println(
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                ", d = " + d);
        int e = -5;
        double g, h;
        g = Math.abs(e);
        h = 10.5001;
        h = Math.ceil(h);
        System.out.println("e = " + e +
                " g = " + g +
                " h = " + h);
    }
}
