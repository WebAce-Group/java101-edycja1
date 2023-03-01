public class Zadanie1 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        int ab=a+b;
        int cd=c-d;
        System.out.println("a,b,c,d="+a+","+b+","+c+","+d);

        System.out.println("ab,cd="+ab+","+cd);

        double e=1.1;
        double f=2.2;
        double g=3.3;
        double h=4.4;
        double ef=e*f;
        double gh=g/h;

        System.out.println("e,f,g,h="+e+","+f+","+g+","+h);

        double mod=ab%b;

        System.out.println("ef,gh,ab%b="+ef+","+gh+","+mod);

        char i='A';
        char j='a';

        System.out.println("i,j,i+j<=bo tablica ascii ="+i+","+j+","+(i+j));

        String k="Ala";
        String l="ma";
        String y=k+l;

        System.out.println("k,l,k+l="+k+","+l+","+y);

        boolean m=true;
        boolean n=false;

        System.out.println("m&&n = "+ (m && n));

    }
}