import java.net.SocketOptions;

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
           ef = e * f;
           gh = g / h;
           int r = ab % b; // 1
           // System.out.println("Reszta z dzielenia zmiennej ab przez zmienną b jest równa " + r); 
           
           char i, j;
           i = 'A';
           j = 'a';
           // i + j  rezultatem tej operacji będzie suma kodów ascii podanych znaków, czyli 162

           String k, l;
           k = "Ala";
           l = "ma";
           // k + l  rezultatem tej operacji będzie złączenie ciągów k i l, czyli "Alama"

           boolean m, n;
           m = true;
           n = false;

           System.out.println((m && n) + "\n"); 

           System.out.println("a = " + a + "\n" + "b = " + b + "\n" + "c = " + c + "\n" + "d = " + d + "\n" + 
           "ab = " + ab + "\n" + "cd = " + cd + "\n" + "e = " + e + "\n" + "f = " + f + "\n" + "g = " + g + "\n" + "h = " + h + "\n" + 
           "ef = " + ef + "\n" + "gh = " + gh + "\n" + "i = " + i + "\n" + "j = " + j + "\n" + "k = " + k + "\n" +
           "l = " + l + "\n" + "m = " + m + "\n" + "n = " + n);

           
    }
 }