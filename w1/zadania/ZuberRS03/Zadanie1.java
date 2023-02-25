public class Zadanie1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int ab = a + b;
        int cd = c - d;
        double e = 1.1;
        double f = 2.2;
        double g = 3.3;
        double h = 4.4;
        double ef = e * f;
        double gh = g / h;
        int x = ab % b;

        System.out.println("Reszta z dzielenia zmiennej ab przez b:");
        System.out.println(x);

        char i = 'A';
        char j = 'a';
        //da się dodać ponieważ każdy znak ma przypisaną wartość liczbową zgodnąz tabelą ASCII

        x = i + j;
        System.out.println("Da siędodać A i a. Suma A i a:");
        System.out.println(x);

        String k = "Ala";
        String l = "ma";

        //nie da się dodać k i l

        boolean m = true;
        boolean n = false;

        System.out.println(m && n);
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

    }
}
