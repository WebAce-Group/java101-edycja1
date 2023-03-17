import java.util.Scanner;

public class Zadanie10 {
    static int[][] transposeMatrix(int[][] m){
        int w = m[0].length;
        int k = m.length;
        int[][] trans = new int[w][k];
        for (int i = 0; i < k; i++){
            for (int j = 0; j < w; j++){
                trans[j][i] = m[i][j];
            }
        }
        return trans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj w: ");
        int w = scanner.nextInt();
        System.out.print("Podaj k: ");
        int k = scanner.nextInt();
        int[][] tab = new int[w][k];
        int fillCells = 1;
        for (int i = 0; i < w; i++){
            for (int j = 0; j < k; j++){
                tab[i][j] = fillCells;
                fillCells++;
            }
        }
        for (int i = 0; i < w; i++){
            for (int j = 0; j < k; j++){
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] transMatrix = transposeMatrix(tab);
        for (int i = 0; i < k; i++){
            for (int j = 0; j < w; j++){
                System.out.print(transMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
