public class Zadanie1 {
    public static void main(String[] args) {
        int a = 1; int b = 2;  int c = 3;  int d = 4;
        int ab=a+b;  int cd=c-d;
        double e = 1.1;  double f = 2.2; double g = 3.3; double h = 4.4;
        double ef = e*f; double gh = g/h;
        System.out.println("reszta dzielenia ab przez b będzie równa "+ab%b);  //1
        char i = 'A';  char j = 'a';
        System.out.println("Suma i oraz j wynosi "+(i+j)); //162
        String k = "Ala";  String l = "ma";
        System.out.println("Suma k oraz l wynosi "+k+l); //Alama
        boolean m = true; boolean n = false;
        System.out.println("m&&n = "+(m&&n));//false
        System.out.println("a="+a+" b="+b+" c="+c+" d="+d+" ab="+ab+" cd="+cd+
                " e="+e+" f="+f+" g="+g+" h="+h+"\nef="+ef+" gh="+gh+
                " i="+i+" j="+j+" k="+k+" l="+l+" m="+m+" n="+n);
    }
}