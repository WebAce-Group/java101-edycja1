public class Zadanie1 {
    public static void main(String[] args) {
        int a=1, b=2, c=3, d=4;
        System.out.println("Zmienne a, b, c, d: " + a + ", " + b + ", " + c + ", " + d);
        int ab=a+b, cd=c-d;
        System.out.println("Zmienne ab, cd: " + ab + ", " + cd);
        double e=1.1, f=2.2, g=3.3, h=4.4;
        System.out.println("Zmienne e, f, g, h: " + e + ", " + f + ", " + g + ", " + h);
        double ef=e*f, gh=g/h;
        System.out.println("Zmienne ef, gh: " + ef + ", " + gh);
        char i='A', j='a';
        //Da się dodać do siebie 2 chary, wynikiem będzie suma wartości liczb które odpowiadają tym znakom w ASCII
        System.out.println(i+" "+j);
        String k="Ala", l="ma";
        //Da się dodać do siebie stringi, wynikiem będzie wypisanie ich w danej kolejności
        System.out.println(k+" "+l);
        boolean m=true, n=false;
        System.out.println(m&&n);

    }
}