public class Zadanie1 {
  public static void main(String[] args) {
    int a,b,c,d; 
    
    a = 1;
    b = 2;
    c = 3; 
    d = 4;

    int ab, cd;
    ab = a+b;
    cd = c-d;

    double e,f,g,h;
    e = 1.1;
    f = 2.2;
    g = 3.3;
    h = 4.4;

    double ef,gh;
    ef = e*f;
    gh = g/h;

    System.out.println("ab mod b = " + (ab % b));

    char i,j;
    i = 'A';
    j = 'a';

    System.out.println("i + j = " + (i+j));
    // Po zsumowaniu zmiennych i oraz j otrzymujemy sumę kodów ASCII dla znaków 'A' oraz 'a'

    String k,l;
    k = "Ala";
    l = "ma";

    System.out.println("k + l = " + (k+l));
    // Po zsumowaniu zmiennych k oraz l otrzymujemy konkatenację dwóch ciągów znaków -> "Ala" + "ma" = "Alama"

    boolean m,n;
    m = true;
    n = false;
    System.out.println("m && n = " + (m&&n));

    System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
    System.out.println("e = " + e + ", f = " + f + ", g = " + g + ", h = " + h);
    System.out.println("ab = " + ab + ", cd = " + cd);
    System.out.println("i = " + i + ", j = " + j + ", k = " + k + ", l = " + l);
    System.out.println("m = " + m + ", n = " + n);
  }
}
