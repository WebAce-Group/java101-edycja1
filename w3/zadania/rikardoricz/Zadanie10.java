import java.util.Scanner;
public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] arr = new int[w][k];
        int num = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                arr[i][j] = num;
                System.out.print(arr[i][j] + " ");
                num++;
            }
            System.out.print("\n");
        }
        if (w == k) {
            System.out.println("Macierz jest kwadratowa");
//      transposed matrix
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < w; j++) {
                    System.out.print(arr[j][i] + " ");
                }
                System.out.print("\n");
            }
        } else {
            System.out.println("Macierz nie jest kwadratowa, nie mozna transponowac");
        }
    }
}
