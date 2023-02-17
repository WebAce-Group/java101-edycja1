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
        System.out.println("Reszta z dzielenia ab przez b to: " + (ab % b));
        char i = 'A';
        char j = 'a';
        System.out.println(i + j); /* to dodana wartosc numerow ascii tych znakow */
        String k = "Ala";
        String l = "ma";
        System.out.println(k + l); /* to jeden string ktory jest scalona wersjca dwoch sumowanych */
        boolean m = true;
        boolean n = false;
        System.out.println(m && n);
        System.out.println(a + " " + b + " " + c + " " + d + " " + ab + " " + cd + " " + e + " " + f + " " + g + " " + h + " "
                + ef + " " + gh + " " + i + " " + j + " " + k + " " + l + " " + m + " " + n);

    }
}