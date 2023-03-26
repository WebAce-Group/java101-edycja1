public class Zadanie1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int ab =a+b;
        int cd = c-d;

        double e = 1.1;
        double f = 2.2;
        double g = 3.3;
        double h = 4.4;
        double ef = e*f;
        double gh = g/h;

        System.out.println("Reszta z dzielenia: "+ab%b);

        char i='A';
        char j='a';
        System.out.println(i+j);
        //da się dodać a wartość to 162

        String k="Ala";
        String l="ma";
        System.out.println(k+l);
        //da się dodać a wynik to "Alama"

        boolean m= true;
        boolean n= false;
        System.out.println(m&&n);

        System.out.println("Wartość wszystkiego: "+a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j+" "+k+" "+l+" "+m+" "+n+" "+ab+" "+cd+" "+ef+" "+gh);
    }
}
