public class zadanie1 {
    public static void main(String[] args) {
        int a = 1; int b = 2; int c = 3; int d = 4;
        int ab = a + b;
        int cd = c - d;
        double e = 1.1; double f = 2.2; double g = 3.3; double h = 4.4;
        double ef = e * f;
        double gh = g / h;
        System.out.println("Reszta dzielenia ab: " + ab + " przez b: " + b + " : " + ab%b);
        int ab_mod_b = ab%b;
        char i = 'A';
        char j = 'a';
        System.out.println("Wynik dodawania charów 'A' + 'a': " + (i+j));
        int ij = i+j;
        String k = "Ala";
        String l = "ma";
        System.out.println("Wynik dodawania stringówi \"Ala\" + \"ma\": " + (k+l));
        String kl = k + l;
        boolean m = true;
        boolean n = false;
        System.out.println(m && n);
        boolean mn = m && n;
        
        // printowanie - bonus - wyniki testóœ do których nie było polecenia stworzeznia nowej zmiennej
        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("ab " + ab);
        System.out.println("c " + c);
        System.out.println("d " + d);
        System.out.println("cd " + cd);
        System.out.println("e " + e);
        System.out.println("f " + f);
        System.out.println("ef " + ef);
        System.out.println("g " + g);
        System.out.println("h " + h);
        System.out.println("gh " + gh);
        System.out.println("bonus ab%b: " + ab_mod_b);
        System.out.println("i " + i);
        System.out.println("j " + j);
        System.out.println("bonus i+j: " + ij);
        System.out.println("k " + k);
        System.out.println("l " + l);
        System.out.println("bonus k+l: " + kl);
        System.out.println("m " + m);
        System.out.println("n " + n);
        System.out.println("bonus m && n: " + mn);
    }
}
