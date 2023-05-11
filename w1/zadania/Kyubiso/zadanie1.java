public class zadanie1 {
    public static void main(String[] args) {
        int a=1; int b=2; int c=3; int d=4;
        int ab=a+b;
        int cd = c-d;
        double e = 1.1;
        double f = 2.2;
        double g = 3.3;
        double h = 4.4;
        int rem = ab%b;
        char i = 'A';
        char j = 'a';
        int ij = i+j; // Dodane ale jako wartosci w decymalnym w tym wypadku chyba
        String k = "Ala";
        String l = "ma";
        String kl = k+l;
        boolean m = true;
        boolean n = false;
        System.out.println("m&&n bedzie rowne: ");
        System.out.println(m && n);
        System.out.println(
                        " a "+a+
                        "\nb "+b+
                        " \nc "+c+
                        " \nd "+d+
                        " \ne "+e+
                        " \nf "+f+
                        " \ng "+g+
                        " \nh "+h+
                        " \ni "+i+
                        " \nj "+j+
                        " \nk "+k+
                        " \nl "+l+
                        " \nm "+m+
                        " \nn "+n+
                        "\nab "+ab+
                        "\ncd "+cd+
                        "\nreszta modulo ab i b "+rem+
                        "\nij "+ij+
                        "\nkl "+kl+
                        "\n===================="
        );
    }
}
