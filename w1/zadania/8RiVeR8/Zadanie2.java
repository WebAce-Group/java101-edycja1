import static java.lang.Math.*;
public class Zadanie2 {
    public static void main(String[] arg){
        int a=5, b=10;
        double c=pow(a,b), d=sqrt(c);
        System.out.println("Zmienne a, b: " + a + ", " + b);
        System.out.println("Zmienne c, d: " + c + ", " + d);
        int e=-5;
        double g=abs(e), h=10.5001;
        h=round(h);
        System.out.println("Zmienne e, g, h: " + e + ", " + g + ", " + h);

    }
}