public class Zadanie2 {
    public static void main(String[] args) {
        //deklaracja zmiennych i przypisanie wartosci
        int a,b;
        a=5;
        b=10;
        double c,d;
        int e= -5;
        double g,h;
        //metody obliczeniowe
        c=Math.pow(a,b);
        d=Math.sqrt(c);
        g=Math.abs(e);
        h=10.5001;
        h=Math.round(h);
        //wyswietlanie kazdej zmiennej po wykonanych obliczeniach
        System.out.println("a="+(a)+", b="+(b)+", c="+(c)+", d="+(d)+", e="+(e)+", f="+(g)+", h="+(h));
    }
}