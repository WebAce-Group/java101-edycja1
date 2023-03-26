package zadania.Kasper123213;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w, k;

        System.out.print("Podaj w: ");
        w = sc.nextInt();

        System.out.print("Podaj k: ");
        k = sc.nextInt();

        int[][] tablica = new int[k][w];

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < w; j++) {
                tablica[i][j] = (i + 1) * (j + 1);
            }
        }

        String formattingText = "%" + (int) (1 + Math.ceil(Math.log10(k * w))) + "d";

        if (k * w <= 1) formattingText = "%1d";

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < w; j++) {
                System.out.printf(formattingText, tablica[i][j]);
            }
            System.out.println();
        }


    }
}
