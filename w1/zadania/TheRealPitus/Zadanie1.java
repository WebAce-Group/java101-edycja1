public class Zadanie1
{
    public static void main(String[] args){
        int a=1, b=2, c=3, d=4;
        int ab=a+b, cd=c-d;
        double e=1.1, f=2.2, g=3.3, h=4.4;
        double ef=e*f, gh=g/h;
        System.out.println("Reszta z dzielenia ab przez b bedzie: " + (ab%b)); //1
        char i='A', j='a';
        System.out.println("Wartosc dodanie do siebie i oraz j bedzie: "+(i+j)); //162
        String k="Ala", l="ma";
        System.out.println("Wartosc dodanie do siebie k oraz j bedzie: "+(k+l)); //Alama
        boolean m=true, n=false;
        System.out.println(m&&n);
        System.out.println("a: "+a+" b: "+b+" c: "+c+" d: "+d+" ab: "+ab+" cd: "+cd+" e: "+
                e+" f: "+f+" g: "+g+" h: "+h+" ef: "+ef+" gh: "+gh+" i: "+i+" j: "+j+" k: "+
                k+" l: "+l+" m: "+m+" n: "+n);
    }
}