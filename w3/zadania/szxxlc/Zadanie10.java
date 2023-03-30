import java.util.Arrays;
import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe wierszy: ");
        int w = scanner.nextInt();
        System.out.println("Podaj liczbe kolumn: ");
        int k = scanner.nextInt();

        int[][] macierz = new int [w][k];

        for (int i=0; i<w; i++)
        {
            for (int j=0; j<k; j++)
            {
                macierz[i][j]=i*3+j+1;
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i=0; i<w; i++)
        {
            for (int j=0; j<k; j++)
            {
                System.out.print(macierz[j][i] + " ");
            }
            System.out.println();
        }
    }
}
