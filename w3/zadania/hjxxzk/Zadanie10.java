package w3.zadania.hjxxzk1;

import java.util.Scanner;

public class Zadanie10 {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj w : ");
        int w = scanner.nextInt();
        System.out.print("Podaj k : ");
        int k = scanner.nextInt();

        System.out.println();

        int[][] tab = new int[w][k];
        int count = 1;

        for(int i = 0; i < w; i++){

            for(int j = 0; j < k; j++){

                tab[i][j] = count;
                ++count;

            }

        }

        for(int i = 0; i < w; i++){

            for(int j = 0; j < k; j++){

               System.out.print("|" + tab[i][j] + "|");

            }
            System.out.println();

        }

        System.out.println();

        for(int i = 0; i < k; i++) {

            for (int j = 0; j < w; j++) {

                System.out.print("|" + tab[j][i] + "|");

            }
            System.out.println();
        }
    }
}
