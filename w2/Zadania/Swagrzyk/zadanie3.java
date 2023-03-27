import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int a = scanner.nextInt();
        scanner.nextLine(); //potrzebne, jeśli wczytujemy napis po wczytaniu liczby
        System.out.println("Podaj liczbe:");
        int b = scanner.nextInt();
        scanner.nextLine(); //potrzebne, jeśli wczytujemy napis po wczytaniu liczby
        System.out.println("Podaj liczbe:");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Z podanych boków można zbudować trojkat.");
            if (a == b && b == c) {
                System.out.println("Trojkat jest rownoboczny.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Trojkat jest rownoramienny.");
            } else {
                System.out.println("Trojkat jest roznoboczny.");
            }
        } else {
            System.out.println("Z podanych bokow nie mozna zbudowac trojkata.");
        }

    }
}