package org.example;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        int a,b;
        a=5;
        b=10;
        System.out.println("a= " +a);
        System.out.println("b= " +b);
        System.out.println("--------");
        double c,d;
        c= pow(a,b);
        d= sqrt(c);
        System.out.println("c (pow(a,b) - a^b) = " +c);
        System.out.println("d (sqrt(c) - pierwiastek kwadratowy z c)= " +d);
        System.out.println("--------");
        int e=-5;
        double g,h;
        g=abs(e);
        h=10.5001;
        System.out.println("e= " +e);
        System.out.println("g (wartość bezwzględna z e) = " +g);
        System.out.println("h= " +h);
        System.out.println("h zaokrąglone do najbliższej l. całkowitej= " +round(h));
        System.out.println("--------");
    }
}