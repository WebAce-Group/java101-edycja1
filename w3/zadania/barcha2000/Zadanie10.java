
import java.util.Scanner;
import static java.lang.Math.*;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wymiary macierzy \n ");
        int k = scanner.nextInt();
        int w = scanner.nextInt();
        int dim = k*w;
        int[][] tablica = new int[k][w];
        for(int i = 0; i < dim; i++) {
            double y = i/w;
            int z = (int)floor(y);
            tablica[z][i%w] = i;
        }
        System.out.print("[");
        for (int[] array: tablica) {
            System.out.print("[");
            for (int n: array) {
                System.out.print(n + " ");
            }
            System.out.print("]");
        }
        System.out.println("]\n");
        int[][] tablica2 = new int[w][k];
        for(int i = 0; i < dim; i++) {
            double y = i/w;
            int z = (int)floor(y);
            tablica2[i%w][z] = i;
        }
        System.out.print("[");
        for (int[] array: tablica2) {
            System.out.print("[");
            for (int n: array) {
                System.out.print(n + " ");
            }
            System.out.print("]");
        }
        System.out.println("]\n");


    }
}