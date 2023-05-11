import java.util.Scanner;
public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę wierszy: ");
        int w = scanner.nextInt();
        System.out.print("Podaj liczbę kolumn: ");
        int k = scanner.nextInt();

        int[][] macierz = new int[w][k];

        int liczba = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                macierz[i][j] = liczba++;
            }
        }

        System.out.println("Macierz:");
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(macierz[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] macierzTrans = new int[k][w];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < w; j++) {
                macierzTrans[i][j] = macierz[j][i];
            }
        }


        System.out.println("Macierz transponowana:");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(macierzTrans[i][j] + "\t");
            }
            System.out.println();
        }
    }
}