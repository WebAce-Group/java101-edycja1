import static java.lang.Math.*;

public class Zadanie1 {
    public static void main(String[] args) {
        final int a = 1; //Można używać final przy tych zmiennych, bo nie edytujemy ich wartości, ale nie jest to wymagane
        int b = 2;
        int c = 3;
        int d = 4;

        int ab = a+b;
        int cd = d-c;

        double e = 1.1;
        double f = 2.2;
        double g = 3.3;
        double h = 4.4;

        double ef = e*f;
        double gh = g/h;

        int reszta = ab%b;

        char i = 'A';
        char j = 'a';

        int ij = i + j;
        // jeśli dodamy chary do siebie, otrzymamy sumę liczb które odpowiadają danym znakom "i = 'A'" i "j = 'a'"

        String k = "Ala";
        String l = "ma";

        String kl = k+l;
        // Jeśli dodamy stringi do siebie, łączą się w jeden string
        final boolean m = true;
        final boolean n = false;

        double z = round(ef*100);
        double x = round(gh*100);
        z=z/100;
        x=x/100;
        //Zaokrągliłem do całości zmienne do drugiego miejsca po przecinku, żeby wyświetlały się lepiej.

        System.out.println("Wartość logiczna m:  "+ m);
        System.out.println("Wartość logiczna n:  "+ n);
        System.out.println("Wartość logiczna m and n:  "+ (m && n));
        System.out.println();

        System.out.println("Wartość zmiennych a,b,c,d:  "+ a+", "+ b+", "+ c+", "+ d);
        System.out.println("Wartość zmiennych ab, cd:  "+ ab+", "+ cd);
        System.out.println();

        System.out.println("Wartość zmiennych e,f,g,h:  "+ e+", "+ f+", "+ g+", "+ h);
        System.out.println("Wartość zmiennych ef, gh:  "+z+", "+x);
        System.out.println();

        System.out.println("Wartość reszty z dzielenia ab przez b:  "+ reszta);
        System.out.println();

        System.out.println("Wartość zmiennych i, j:  "+ i+", "+ j);
        System.out.println("Wartość zmiennej ij:  "+ ij);
        System.out.println("Wartość zmiennych k, l:  "+ k+", "+ l);
        System.out.println("Wartość zmiennej kl:  "+ kl);


    }

}