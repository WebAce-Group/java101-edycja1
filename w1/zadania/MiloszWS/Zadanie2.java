package w1.zadania;


public class Zadanie2 {
    public static void main(String[] args) {

        int a=5,b=10;
        double c=Math.pow(a,b),d=Math.sqrt(c);
        System.out.println("Zmienne a i b: "+(a)+", "+(b));
        System.out.println("Zmienne c i d: "+(c)+", "+(d));

        int e=-5;
        double h = 10.5001;
        double g = Math.abs(e);
        h=Math.round(h);
        System.out.println("Zmienne  e, h i g: "+(e)+", "+(h)+", "+(g));
    }
}
