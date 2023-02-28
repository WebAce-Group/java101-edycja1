public class Zadanie1 {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int ab = a + b;
        int cd  = c - d;


        double e = 1.1;
        double f = 2.2;
        double g = 3.3;
        double h = 4.4;

        double ef = e*f;
        double gh = g/h;


        int reszta_dziel_zmAB_przez_zmB = ab%b; // odp: 1
        System.out.println(reszta_dziel_zmAB_przez_zmB);

        char i = 'A';
        char j = 'a';
        // NIE DA SIE ich dodac poniewaz sa to chary, mozna wynik ich dodawanie przedstawic w postaci inta (cyferek)


        String k = "Ala", l = "ma", kl = k + l;
        System.out.println(kl); //DA SIE DODAC k i l


        boolean m = true, n = false;
        System.out.println(m && n);

        System.out.print("Wartosci wszytskich zmiennych: ");
        System.out.print(a + " ");
        System.out.print(b+ " ");
        System.out.print(c + " ");
        System.out.print(d + " ");
        System.out.print(e + " ");
        System.out.print(f + " ");
        System.out.print(g + " ");
        System.out.print(h + " ");
        System.out.print(i + " ");
        System.out.print(j + " ");
        System.out.print(k+ " " );
        System.out.print(l  + " ");
        System.out.print(m+ " ");
        System.out.print(n+ " ");







    }
}