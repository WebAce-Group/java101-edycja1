package w3.zadania.Nurek54;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę wierszy: ");
        int wiersze = scanner.nextInt();

        System.out.print("Podaj liczbę kolumn: ");
        int kolumny = scanner.nextInt();

        int[][] macierz = new int[wiersze][kolumny];

        int liczba = 1;
        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                macierz[i][j] = liczba;
                liczba++;
            }
        }

        // wyświetlenie macierzy
        System.out.println("Macierz:");
        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }

        // wyświetlenie macierzy transponowanej
        System.out.println("Macierz transponowana:");
        for (int j = 0; j < kolumny; j++) {
            for (int i = 0; i < wiersze; i++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
