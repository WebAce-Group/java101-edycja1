package w3.zadania.MatiBukowski;

import java.util.Scanner;
public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę wierszy: ");
        int w = scanner.nextInt();
        System.out.println("Podaj liczbę kolumn: ");
        int k = scanner.nextInt();

        int[][] tab = new int[w][k];

        System.out.println("\n" + "Macierz: " );
        for (int i = 1; i <= w; i++) {
            for (int j = 1; j <= k; j++) {
                tab[i - 1][j - 1] = i * j;
                System.out.print(tab[i - 1][j - 1] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("\n" + "Macierz transponowana: " );
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= w; j++) {
                System.out.print(tab[j - 1][i - 1] + " ");
            }
            System.out.print("\n");
        }
    }
}
