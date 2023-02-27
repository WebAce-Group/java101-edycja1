import java.lang.Math.*;
public class zadanie2 {
    public static void main(String[] args) {
      // tutaj umieść rozwiązanie zadanie    
        int a,b;
        a=5;b=10;
        
        double c,d;
        c = Math.pow(a,b);
        d = Math.sqrt(c);

        int e; e=-5;
        double g,h;
        g = Math.abs(e);
        h=10.5001;
        Math.round(h);

        //wynik
        System.out.println(Math.pow(c,d));
        System.out.println(Math.sqrt(c));
        System.out.println(e);
        System.out.println(g);
        System.out.println(Math.round(h));
    }
 }
