package w2.zadania.Nurek54;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj dodatnią liczbę całkowitą n: ");
        int n = input.nextInt();

        // Wyświetlenie wszystkich liczb od 1 do n.
        System.out.print("Liczby od 1 do n: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Wyświetlenie wszystkich liczb od n do 1.
        System.out.print("Liczby od n do 1: ");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Wyświetlenie liczb od 1 do n, ale tylko podzielnych przez 3 lub 5.
        System.out.print("Liczby od 1 do n podzielne przez 3 lub 5: ");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Wyświetlenie liczb od 1 do n, ale tylko podzielnych przez 3 lub 5, ale nie jednocześnie przez oba.
        System.out.print("Liczby od 1 do n podzielne przez 3 lub 5, ale nie jednocześnie przez oba: ");
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0 && i % 5 != 0) || (i % 5 == 0 && i % 3 != 0)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
