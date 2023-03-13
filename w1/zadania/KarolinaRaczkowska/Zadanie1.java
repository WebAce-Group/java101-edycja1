public class Zadanie1 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4;
        int ab = a+b, cd = c + d;
        double e = 1.1, f = 2.2, g = 3.3, h = 4.4;
        double ef = e*f, gh = g/h;
        int r = ab%b; // dostaniemy 1
        char i = 'A', j = 'a';
        //int ij = i+j; - zadziala, dodajemy wartosci z tabelii ascii 65+97= 162
        String k ="Ala", l ="ma";
//      String kl = k+l;
//      System.out.println(kl) - otrzymamy "Alama"
        boolean m = true, n = false;
        //
        System.out.println(m&n);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(ab);
        System.out.println(cd);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(gh);
        System.out.println(ef);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
    }
}