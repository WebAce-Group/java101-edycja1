import java.util.Scanner;

import static java.lang.Math.pow;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Podaj wartosci bokow trojkata (odpowiednio boki a,b c): ");
        int a = abc.nextInt();
        int b = abc.nextInt();
        int c = abc.nextInt();

        if (a+b < c || a+c<b || c+b<a) {
            System.out.println("Nie mozna zbudowac trojkata");
        } else if (a == b && b == c) {
            System.out.println("Trojkat jest rownoboczny");
        } else if (a == b || a==c || b==c) {
            System.out.println("Trojkat jest rownoramienny");
        } else System.out.println("Trojkat jest roznoboczny");
    }
}