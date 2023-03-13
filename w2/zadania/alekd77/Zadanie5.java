package w2.zadania.alekd77;

import java.util.Scanner;

public class Zadanie5 {
    public static int getUserInput() {
        System.out.println("Podaj dodatnia liczbe calkowita:");
        return new Scanner(System.in).nextInt();
    }

    public static void printEachNumberFrom1ToN(int num) {
        System.out.printf("Liczby od 1 do N:%47c", ' ');

        for (int i = 1; i <= num; i++) {
            System.out.printf("%d ", i);
        }
    }

    public static void printEachNumberFromNto1(int num) {
        System.out.printf("Liczby od N do 1:%47c", ' ');

        for (int i = num; i >= 1; i--) {
            System.out.printf("%d ", i);
        }
    }

    public static void printEachNumberFrom1ToNDivisibleBy3Or5(int num) {
        System.out.printf("Liczby od 1 do N, podzielne przez 3 lub 5:%22c", ' ');

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.printf("%d ", i);
            }
        }
    }

    public static void printEachNumberFrom1ToNDivisibleBy3Or5ButNotBoth(int num) {
        System.out.printf("Liczby od 1 do N, podzielne przez 3 lub 5, ale nie przez oba:%3c", ' ');

        for (int i = 1; i <= num; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                continue;
            }

            if (i % 3 == 0) {
                System.out.printf("%d ", i);
            }

            if (i % 5 == 0) {
                System.out.printf("%d ", i);
            }
        }
    }

    public static void main(String[] args) {
        final int userInput = getUserInput();

        printEachNumberFrom1ToN(userInput);
        System.out.println();
        printEachNumberFromNto1(userInput);
        System.out.println();
        printEachNumberFrom1ToNDivisibleBy3Or5(userInput);
        System.out.println();
        printEachNumberFrom1ToNDivisibleBy3Or5ButNotBoth(userInput);
    }
}
