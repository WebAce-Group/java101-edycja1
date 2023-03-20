import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosc 1 boku trojkata");
        int a = scanner.nextInt();
        System.out.println("Podaj dlugosc 2 boku trojkata");
        int b = scanner.nextInt();
        System.out.println("Podaj dlugosc 3 boku trojkata");
        int c = scanner.nextInt();

        if (a+b > c && b+c > a && a+c > b) {
            if (a == b && b == c) {
                System.out.println("Trojkata rownoboczny");
            } else if (a==b || b==c || a==c) {
                System.out.println("Trojkata rownoramienny");
            } else {
                System.out.println("Trojkat roznobioczny");
            }
        } else {
            System.out.println("Nie da sie zbudowac trojkata");
        }
    }
}