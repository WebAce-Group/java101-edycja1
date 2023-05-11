package org.example;

public class Zadanie1 {
    public static void main(String[] args) {
        int a,b,c,d;
        a=1;
        b=2;
        c=3;
        d=4;
        System.out.println("a= " +a);
        System.out.println("b= " +b);
        System.out.println("c= " +c);
        System.out.println("d= " +d);
        System.out.println("-------");
        int ab,cd;
        ab = a+b;
        cd = c-d;
        System.out.println("ab (a+b) = " +ab);
        System.out.println("cd (c-d) = " +cd);
        System.out.println("-------");
        double e,f,g,h;
        e= 1.1;
        f=2.2;
        g=3.3;
        h=4.4;
        System.out.println("e= " +e);
        System.out.println("f= " +f);
        System.out.println("g= " +g);
        System.out.println("h= " +h);
        System.out.println("-------");
        double ef,gh;
        ef=e*f;
        gh=g/h;
        System.out.println("ef (e*f) = " +ef);
        System.out.println("gh (g/h) = " +gh);
        System.out.println("-------");
        System.out.println("reszta z dzielenia ab/b = " +(ab/b));
        System.out.println("-------");
        char i,j;
        i='A';
        j='a';
        System.out.println("i = " +i);
        System.out.println("j = " +j);
        System.out.println("-------");
        System.out.println("i+j= " +(i+j));
        System.out.println("dochodzi do dodania wartości 'a' oraz 'A' ktróre przypisuje im tablica ASCII");
        System.out.println("-------");
        String k,l;
        k="Ala";
        l="ma";
        System.out.println("k = " +k);
        System.out.println("l = " +l);
        System.out.println("-------");
        System.out.println("k+l = " +(k+l));
        System.out.println("dochodzi do dodania 'Ala' i 'ma' ");
        System.out.println("-------");
        boolean m,n;
        m=true;
        n=false;
        System.out.println("m = " +m);
        System.out.println("n = " +n);
        System.out.println("-------");
        System.out.println("m i n = " +(m && n));
        System.out.println("-------");

    }
}