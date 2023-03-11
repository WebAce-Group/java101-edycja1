public class Zadanie1 {
    public static void main(String[] args) {
        int a=1, b=2, c=3, d=4;
        int ab=a+b, cd=c-d;
        double e=1.1, f=2.2, g=3.3, h=4.4;
        double ef=e*f, gh=g/h;
        char i='A', j='a';
        String k="Ala", l="ma";
        boolean m=true, n=false;
        
        System.out.println("ab%b = " + ab%b);
        System.out.println("i+j = " + (i+j));
        System.out.println("k+l = " + (k+l));
        System.out.println("m && n = " + (m && n));
        //Próbowałem uprościć pętlą "for" przy pomocy rzutowania, ale nie wiem jak wyświetlić wartość pod daną zmienną
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("ab = " + ab);
        System.out.println("cd = " + cd);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("ef = " + ef);
        System.out.println("gh = " + gh);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }
}
