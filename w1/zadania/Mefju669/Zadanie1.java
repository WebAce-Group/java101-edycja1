public class Zadanie1 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        System.out.println("a="+a+", "+"b="+b+", "+"c="+c+", "+"d="+d);

        int ab=a+b;
        System.out.println("a+b="+ab);
        int cd=c-d;
        System.out.println("c-d="+cd);

        double e=1.1;
        double f=2.2;
        double g=3.3;
        double h=4.4;
        System.out.println("e="+e+", "+"f="+f+", "+"g="+g+", "+"h="+h);

        double ef=e*f;
        System.out.println("e*f="+ef);
        double gh=g/h;
        System.out.println("g/h="+gh);

        System.out.println("Reszta z dzielenia ab/b: "+ab%b);

        char i='A';
        System.out.println("i: "+i);
        char j='a';
        System.out.println("j: "+j);

        System.out.println("i+j= "+(i+j));

        //wynik otrzymałem, ponieważ zostały dodane wartości kodów ASCII znaków A i a czyli 65+97

        String k="Ala";
        System.out.println("k: "+k);
        String l="ma";
        System.out.println("l: "+l);

        System.out.println("k+l: "+k+l);
        //można dodać Stringi ale wynikiem jest ich sklejenie a nie liczba jak przy charach

        boolean m=true;
        System.out.println("m: "+m);
        boolean n=false;
        System.out.println("n: "+n);
        boolean mn=m&&n;

        System.out.println("m&&n: "+mn);

    }
}
