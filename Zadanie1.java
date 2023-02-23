public class Zadanie1 {
    public static void main(String[] args) {
        //deklaracja i przypisanie zmiennych
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int ab = a + b;
        int cd = d - c;
        double e = 1.1;
        double f = 2.2;
        double g = 3.3;
        double h = 4.4;
        double ef = e*f;
        double gh = g/h;
        //Sprawdzanie reszty z dzielenia liczby ab przez b
        System.out.println("Reszta z dzielenia liczby ab prze liczbe b to: " + (ab%b));
        char i,j;
        i= 'A';
        j= 'a';
        System.out.println("Wartość liczby i+j = " + (i+j));
        //Zmienne typu char mozna do siebie dodawac, a wynikiemm bedzie suma wartosci z tablicy kodow ASCII
        String k,l;
        k = "Ala";
        l = "ma";
        System.out.println("Wynik dodawania k + l = " + (k+l));
        //Stringi mozna do siebie dodawac, a wynikiem jest zlepek slow przypisanych do zmiennych
        boolean m,n;
        m = true;
        n = false;
        System.out.println("Wartość m && n = " + (m&&n));
        System.out.println("a= "+ (a) + ", b= "+(b) + ", c= "+(c)+ ", d= "+(d) + ", e= "+(e)+", f= "+(f)+", g= "+(g)+", h= "+(h)+", ab= "+(ab)+", cd="+(cd)+", ef= "+(ef)+", gh="+(gh)+", i= "+(i)+", j="+(j)+", k= "+(k)+", l= "+(l)+", m="+(m)+", n="+(n));







    }
}

