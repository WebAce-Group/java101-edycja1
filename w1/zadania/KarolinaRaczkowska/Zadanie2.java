import java.lang.Math;
public class Zadanie2 {
    public static void main(String[] args) {
        int a = 5, b = 10;
        double c, d;
        c = Math.pow(a,b);
        d = Math.sqrt(c);
        System.out.println(a + " " + b + " " + c + " " + d);
        int e = -5;
        double g,h;
        g = Math.abs(e);
        h = 10.5001;
        h = Math.round(h);
        System.out.println(e + " " + g +" " +h);
    }
}