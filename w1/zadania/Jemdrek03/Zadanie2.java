import static java.lang.Math.*;

public class Zadanie2 {
    public static void main(String[] args) {
        int a = 5, b = 10;
        double c = pow(a, b), d = sqrt(c);
        System.out.println(a + "," + b + "," + c + "," + d);
        int e = -5;
        double g = abs(e), h = 10.5001;
        round(h);
        System.out.println(a + "," + b + "," + c + "," + d + "," + e + "," + g + "," + h);

    }
}