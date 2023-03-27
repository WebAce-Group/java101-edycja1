public class Zadanie2 {
    public static void main(String[] args){
        int a = 5, b = 10;
        double c = Math.pow(a, b);
        double d = Math.sqrt(c);
        System.out.println("a = " +a+" b = " +b+" c = a^b = "+c+" d = sqrt(c) = "+d);
        int e = -5;
        double g = Math.abs(e), h = 10.5001;
        h = Math.round(h);
        System.out.println("g = "+g+" h = "+h);
    }
}
