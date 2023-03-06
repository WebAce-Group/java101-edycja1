import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Zadanie2 {
    public static void main(String[] args) {
        int a=5;
        System.out.println("a="+a);
        int b=10;
        System.out.println("b="+b);

        double c=pow(a,b);
        System.out.println("c=a^b="+c);
        double d=Math.sqrt(c);
        System.out.println("sqrt(c)="+d);

        int e=-5;
        System.out.println("e="+e);

        double g=abs(e);
        System.out.println("|e|="+g);

        double h=10.5001;
        System.out.println("h="+h);

        System.out.println("h do najblizszej calkowitej="+Math.round(h));
    }
}
