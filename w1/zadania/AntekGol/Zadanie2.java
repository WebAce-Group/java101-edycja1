public class Zadanie2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double c = Math.pow(a,b);
        double d = Math.sqrt(c);
        System.out.println(a + " " + b + " " + c + " " + d);
        int e = -5;
        double g = Math.abs(e);
        double h = 10.5001;
        h = Math.round(h);
        System.out.println(a + " " + b + " " + c + " " + d + " "+ e + " " + g + " " + h);

    }
}