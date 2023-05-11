import java.util.Scanner;

public class Zadanie_10 {
    public static void main(String[] args) {
        int w, k;
        Scanner scan = new Scanner(System.in);
        System.out.println("Chcialbym pobrac od Ciebie liczbe wierszy: ");
        w = scan.nextInt();
        System.out.println("Chcialbym pobrac od Ciebie liczbe kolumn: ");
        k = scan.nextInt();
        int[][] tablica = new int[w][k];
        for (int i = 0, liczba = 1; i < w; i++)
            for (int j = 0; j < k; j++, liczba++)
                tablica[i][j] = liczba;

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++)
                System.out.print(tablica[i][j] + "\t");
            System.out.println();
        }

        System.out.println("Transpozycja:");

        int[][] transtablica = new int[tablica[0].length][tablica.length];
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                transtablica[i][j] = tablica[j][i];
                System.out.print(transtablica[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
