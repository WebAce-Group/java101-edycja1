import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosci bokow trojkata.");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        if (a+b<=c || a+c<=b || b+c<=a) System.out.println("Z podanynch dlugosci nie da sie zbudowac trojkata.");
        else if (a==b && b==c) System.out.println("Podany trojkat jest rownoboczny.");
        else if (a==b || b==c || a==c) System.out.println("Podany trojkat jest rownoramienny.");
        else System.out.println("Podany trojkat jest roznoboczny.");
    }
}