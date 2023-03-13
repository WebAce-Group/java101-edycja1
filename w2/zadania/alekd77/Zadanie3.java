package w2.zadania.alekd77;

import java.util.Scanner;

public class Zadanie3 {
    public static boolean canCreateAnyTriangle(int a, int b, int c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }

    public static boolean isEquilateral(int a, int b, int c) {
        return (a == b) && (a == c);
    }

    public static boolean isIsosceles(int a, int b, int c) {
        return (a == b) || (b == c) || (a == c);
    }

    public static String getTriangleType(int a, int b, int c) {
        if (isEquilateral(a, b, c)) {
            return "rownoboczny";
        }

        if (isIsosceles(a, b, c)) {
            return "rownoramienny";
        }

        return "roznoboczny";
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dlugosci bokow trojkata:");
        System.out.println("Dlugosc boku a:");
        final int a = scanner.nextInt();

        System.out.println("Dlugosc boku b:");
        final int b = scanner.nextInt();

        System.out.println("Dlugosc boku c:");
        final int c = scanner.nextInt();

        if (!canCreateAnyTriangle(a, b, c)) {
            String message = "Nie mozna stworzyc trojkata o podanych dlugosciach bokow";
            System.out.println(message);
            return;
        }

        String triangleType = getTriangleType(a, b, c);

        System.out.printf("Trokat o zadanych dlugosciach bokow jest: %s", triangleType);
    }
}
