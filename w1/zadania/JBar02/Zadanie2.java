package w1.zadania.JBar02;

import static java.lang.Math.*;

public class Zadanie2 {
    public static void main(String[] args) {
       int a=5,b=10;
       double c,d;
       c=pow(a,b);//potegowanie a do potegi b
       d=sqrt(c);//pierwiastek kwadratowy z c
        System.out.println("wartosc zmiennej a: "+a
                +" wartosc zmiennej b "+ b
                +" wartosc zmiennej c "+ c
                +" wartosc zmiennej d "+ d );
        int e=-5;
        double g,h;
        g=abs(e);//wartosc aabsolutna z e
        h=10.5001;
        h=round(h);//zaokraglenie do liczby calkowitej
        System.out.println("wartosc zmiennej e: "+e
                +" wartosc zmiennej g "+ g
                +" wartosc zmiennej h "+ h );
    }
}