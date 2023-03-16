import java.util.Random;
import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int w, k;
        System.out.println("Podaj ilość wierszy: ");
        w = scan.nextInt();
        System.out.println("Podaj ilość kolumn: ");
        k = scan.nextInt();
        int[][] Macierz = new int[w][k];

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                Macierz [i][j] = rnd.nextInt(w*k)+1;
            }
        }

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(Macierz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Macierz transponowana: ");
        for (int j = 0; j < k; j++) {
            for (int i = 0; i < w; i++) {
                System.out.print(Macierz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
