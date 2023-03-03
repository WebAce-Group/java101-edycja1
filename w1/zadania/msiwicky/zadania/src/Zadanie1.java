public class Zadanie1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int ab = a + b;
        int cd = c - d;
        System.out.println("a + b = " + ab);
        System.out.println("c - d = " + cd);

        double e = 1.1;
        double f = 2.2;
        double g = 3.3;
        double h = 4.4;
        double ef = e * f;
        double gh = g / h;
        System.out.println("e * f = " + ef);
        System.out.println("g / h = " + gh);

        System.out.println("ab % b = " + (ab % b));

        char i  = 'A';
        char j = 'a';
        System.out.println("i + j = "+(i + j)); //dodawanie dwóch charów zwróci int (ASCII)

        String k = "Ala";
        String l = "ma";
        System.out.println("k + l = " + (k + l));
        boolean m = true;
        boolean n = false;
        System.out.println("m && n = " + (m && n));




    }
}
