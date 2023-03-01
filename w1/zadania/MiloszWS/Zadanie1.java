package w1.zadania.MiloszWS;

public class Zadanie1 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4;
        int ab = a + b, cd = c - d;
        System.out.println(ab); //3
        double e=1.1, f=2.2, g=3.3, h=4.4;
        double ef=e*f;
        double gh=g/h;
        int reszta=ab%b;
        char i='A', j='a';
        System.out.println(i+j); //162 ponieważ ASCII
        String k="Ala";
        String l="ma";
        System.out.println((k+l)); //Alama ponieważ String?
        boolean m=true, n=false;
        System.out.println(m&&n); //false
        System.out.println("Wszystkie zmienne po kolei: " + (a)+" "+(b)+" "+(c)+" "+(d)+" "+(e)+" "+(f)
                +" "+(g)+" "+(h)+" "+(i)+" "+(j)+" "+(k)+" "+(l)+" "+(m)+" "+(n)+" ");

    }
}
