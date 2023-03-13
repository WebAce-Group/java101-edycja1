package w1.zadania.Tomoo3;

public class Zadanie2 {
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        double c = Math.pow(a, b);
        double d = Math.sqrt(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        int e = -5;
        double g = Math.abs(e);
        double h = 10.5001;
        System.out.println("Zmienna h zaokrąglona do najbliższej liczby całkowitej to " + (Math.ceil(h)));
    }
}
