import static java.lang.Math.*;

public class Zadanie2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        double c = pow(a,b); //potęga
        double d = sqrt(c);  //pierwiastek

        System.out.println("Wartość zmiennej a:  "+ a);
        System.out.println("Wartość zmiennej b:  "+ b);
        System.out.println("Wartość zmiennej c:  "+ (int)c);
        System.out.println("Wartość zmiennej d:  "+ (int)d);

        int e = -5;
        double g = abs(e);
        double h = 10.5001;

        h = round(h);  //zaokrąglenie

        System.out.println();
        System.out.println("Wartość zmiennej e:  "+ e);
        System.out.println("Wartość zmiennej g:  "+ (int)g);
        System.out.println("Wartość zmiennej h:  "+ (int)h);

    }
}
