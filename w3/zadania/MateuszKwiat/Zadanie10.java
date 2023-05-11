import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w;
        int k;

        System.out.println("Wiersze:");
        w = scanner.nextInt();
        System.out.println("Kolumny:");
        k = scanner.nextInt();
        int[][] matrix = new int[w][k];
        int inp = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                matrix[i][j] = inp++;
            }
        }

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(matrix[i][j]);
                System.out.print('\t');
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(matrix[j][i]);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
