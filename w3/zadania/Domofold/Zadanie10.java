import java.util.Scanner;
public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Podaj liczbę wierszy: ");
        int w = scanner.nextInt();
        System.out.printf("Podaj liczbę kolumn: ");
        int k = scanner.nextInt();
        scanner.close();

        int[][] macierz = new int[w][k];

        int sum = 1;
        for (int i=0; i<w; i++) {
            for (int j=0; j<k; j++) {
                macierz[i][j] = sum;
                sum++;
            }
        }

        System.out.println("");

        for (int i=0; i<w; i++) {
            for (int j=0; j<k; j++) {
                if (macierz[i][j]<10) {
                    System.out.printf(macierz[i][j] + "  ");
                }
                else System.out.printf(macierz[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i=0; i<k; i++) {
            for (int j=0; j<w; j++) {
                if (macierz[j][i]<10) {
                    System.out.printf(macierz[j][i] + "  ");
                }
                else System.out.printf(macierz[j][i] + " ");
            }
            System.out.println("");
        }
    }

}
