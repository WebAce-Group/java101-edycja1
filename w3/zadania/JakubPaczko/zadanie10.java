import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);

        System.out.println("Podaj liczbe wierszy");
        int _w = text.nextInt();

        System.out.println("Podaj liczbe kolumn");
        int _k = text.nextInt();

        int[][] matrix = new int[_w][_k];

        System.out.println("Macierz");

        int l = 1;
        for (int w = 0; w < matrix.length; w++) {
            for (int k = 0; k < matrix[w].length; k++) {
                matrix[w][k] = l;
                System.out.print("[" + matrix[w][k] + "]");
                l ++;
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Macierz transponowana");
        for (int w = 0; w < matrix.length; w++) {
            for (int k = 0; k < matrix[w].length; k++) {
                System.out.print("[" + matrix[k][w] + "]");
            }
            System.out.println();

        }
    }
}
