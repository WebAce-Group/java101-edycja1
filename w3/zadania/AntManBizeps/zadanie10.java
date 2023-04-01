import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę wierszy: ");
        int w = scanner.nextInt();
        System.out.print("Podaj liczbę kolumn: ");
        int k = scanner.nextInt();
        int[][] macierz = new int[w][k];
        for(int i=0; i<w; i++){
            macierz[i][0] = i+1;
        }
        for(int i=0; i<k; i++){
            macierz[0][i] = i+1;
        }
        for(int i=1; i<w; i++){
            for(int j=1; j<k; j++){
                int a = macierz[0][j];
                int b = macierz[i][0];
                macierz[i][j] = a*b;
            }
        }
        for(int i=0; i<w; i++){
            System.out.print("[ ");
            for(int j=0; j<k; j++){
                System.out.print(macierz[i][j] + " ");
            }
            System.out.print(" ]\n");
        }

        System.out.println("\n");

        //----------------------------

        int[][] macierzT = new int[k][w];
        for(int i=0; i<w; i++){
            for(int j=0; j<k; j++){
                macierzT[j][i] = macierz[i][j];
            }
        }


        for(int i=0; i<k; i++){
            System.out.print("[ ");
            for(int j=0; j<w; j++){
                System.out.print(macierzT[i][j] + " ");
            }
            System.out.print(" ]\n");
        }
    }
}
