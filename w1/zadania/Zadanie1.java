public class Zadanie1 {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 1;
        b = 2;
        c = 3;
        d = 4;

        int ab, cd;
        ab = a + b;
        cd = c - d;

        double e, f, g, h;
        e = 1.1;
        f = 2.2;
        g = 3.3;
        h = 4.4;

        double ef, gh;
        ef = e*f;
        gh = g/h;

        System.out.println(ab%b);

        char i, j;
        i = 'A';
        j = 'a';
        System.out.println(i+j); //jest to suma z tablicy ASCII

        String k, l;
        k = "Ala";
        l = "ma";
        System.out.println(k + l); //tak, można

        boolean m, n;
        m = true;
        n = false;
        System.out.println(m && n);
        System.out.println(a + " " + b + " " + c + " " + d + " " + ab + " " + cd);
        System.out.println(e + " " + f + " " + g + " " + h + " " + ef + " " + gh);
        System.out.println(i + " " + j + " " + k + " " + l + " " + m + " " + n);


    }
}