package w1.zadania.JBar02;

public class Zadanie1 {
    public static void main(String[] args) {
        int a=1,b=2,c=3,d=4;
        int ab,cd;
        cd=c-d;
        ab=a+b;
        double e=1.1,f=2.2,g=3.3,h=4.4, ef,gh;
        ef=e*f;
        gh=g/h;
        System.out.println("Reszta z dzielenia ab/b : "+ab/b);
        char i='A',j='a';
        System.out.println("dodawanie zmiennych char i+j : "+ i+j);
        String k="Ala", l="ma";
        System.out.println("dodawanie zmiennych String : "+ k+l);
        boolean m=true,n=false;
        System.out.print("Iloczyn logiczny prawdy i fałszu: " );
        System.out.print( m && n);
    }
}