package w3.zadania.Ziolo03;
import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner wk = new Scanner(System.in);

        System.out.print("Podaj liczbę wierszy");
        int w = wk.nextInt();
        System.out.print("Podaj liczbę kolumn");
        int k = wk.nextInt();
        int[][] macierz = new int[w][k];
        int zmienna = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                macierz[i][j] = zmienna++;
            }
        }
        for (int i = 0; i<w; i++) {
            for (int j=0; j<k; j++) {
                System.out.print(macierz[i][j] + " ");
            }
        }
        int[][] macierz2 = new int[k][w];
        for (int i = 0; i<k; i++) {
            for (int j=0; j<w; j++) {
                macierz2[i][j] = macierz[j][i];
            }
        }


        for (int i=0; i<k; i++) {
            for (int j=0; j<w; j++) {
                System.out.print(macierz2[i][j] + " ");
            }
        }
    }
}
