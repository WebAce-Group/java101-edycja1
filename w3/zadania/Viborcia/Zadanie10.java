package w3.zadania.Viborcia;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj w: ");
        int w = scanner.nextInt();
        System.out.println("Podaj k: ");
        int k = scanner.nextInt();
        System.out.println("w = " + w + " k = " + k);

        int[][] tablica = new int[w][k];
        System.out.println("Macierz");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < w; j++) {
                tablica[i][j]= j+1;
            }
        }

        for (int i = 0; i < k; i++) {
            for (int j =0; j < w; j++) {
                System.out.print(tablica[i][j]);
            }
            System.out.println();
        }
        System.out.println("Macierz transponowana");
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                tablica[i][j]= i+1;
            }
        }

        for (int i = 0; i < w; i++) {
            for (int j =0; j < k; j++) {
                System.out.print(tablica[i][j]);
            }
            System.out.println();
        }
    }
}

