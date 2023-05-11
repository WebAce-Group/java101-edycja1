public class Zadanie1 {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int ab = a + b;
        int cd = c + d;


        double e = 1.1;
        double f = 2.2;
        double g = 3.3;
        double h = 4.4;

        double ef = a*f;
        double gh = g*h;
        System.out.println("Reszta z dzielenia ab przez b to " + ab%b);

        char i = 'A';
        char j = 'a';
        System.out.println(i+j); //nie da sie poniewaz jest to char i sa one konwertowane na index z
                                // tablicy ASCII i ten index jest dodawany
                                // id a-97 A-65 wiec 97 + 65 = 162

        String k = "Ala";
        String l = "ma";
        System.out.println(k+l);//mozna bo to jest dodawanie Stringow (czyli napisow)

        boolean m = true;
        boolean n = false;

        System.out.println(m && n);

        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
        System.out.println("d= "+d);
        System.out.println("ab= "+ab);
        System.out.println("cd= "+cd);
        System.out.println("e= "+e);
        System.out.println("f= "+f);
        System.out.println("g= "+g);
        System.out.println("ef= "+ef);
        System.out.println("gh= "+gh);
        System.out.println("h= "+h);
        System.out.println("i= "+i);
        System.out.println("j= "+j);
        System.out.println("k= "+k);
        System.out.println("l= "+l);
        System.out.println("m= "+m);
        System.out.println("n= "+n);
        
    }
}
