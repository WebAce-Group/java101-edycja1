package w1.zadania.alekd77;

public class Zadanie1 {
    public static void main(String[] args) {
        // 1
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        // 2
        int ab = a + b;
        int cd = c - d;

        // 3
        double e = 1.1;
        double f = 2.2;
        double g = 3.3;
        double h = 4.4;

        // 4
        double ef = e * f;
        double gh = g / h;

        // 5
        int modulo = ab % b;
        System.out.println(modulo);  // reszta z dzielenia = 1

        // 6
        char i = 'A';
        char j = 'a';
        System.out.println(i + j); // wynik dodawania = 162, z powodu konwersji zmiennych typu 'char' do typu 'int',
                                    // wartosci zmiennych po konwersji wynikaja z tablicy ASCII

        // 7
        String k = "Ala";
        String l = "ma";

        // 8
        System.out.println(k + l); // dodawanie (laczenie) stringow za pomoca operatora '+' jest mozliwe
                                    // w tym wypadku skutkuje wyswiteleniem napisu "Alama"

        // 9
        boolean m = true;
        boolean n = false;

        // 10
        System.out.println(m && n); // wartosc logiczna = falsz
    }
}
