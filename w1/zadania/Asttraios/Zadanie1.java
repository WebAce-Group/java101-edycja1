import javax.print.attribute.HashDocAttributeSet;

public class Zadanie1 {
    public static void main(String[] args) {

        int a=1, b=2, c=3, d=4;

        int ab, cd;
        ab=a+b;
        cd=d-c;

        double e=1.1, f=2.2, g=3.3, h=4.4;
        double ef=e*f, gh=g/h;

        System.out.println(ab%b + " reszta z dzielenia ab przez b");

        char i='A', j='a';
        System.out.println(i+j + " da sie dodac. Jest to suma odpowiadajacym tym literom wartosci z tablicy ASCII");

        String k="Ala", l="ma";
        System.out.println(k+l +" da sie dodac. Stringi zostana \"zespolone\" ze soba" );

        boolean m=true, n=false;

        System.out.println(m&&n);

        System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d + " ab=" + ab + " cd=" + cd + " e=" + e
        + " f=" + f + " g=" + g + " h=" + h + " ef=" + ef + " gh=" + gh +" i=" + i + " j=" + j + " k=" + k + " l=" + l
        + " m=" + m + " n=" + n);

    }
}
