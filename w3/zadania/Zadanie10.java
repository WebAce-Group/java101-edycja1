import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w; // wiersze
        int k; // kolumny
        System.out.println("Podaj rozmiary tablicy: ");
        w = sc.nextInt();
        k = sc.nextInt();
        int[][] macierz = new int [w][k];
        int wartosc = 1;
        for(int i = 0; i < w; i++){
            for(int j = 0; j < k; j++){
                macierz[i][j] = wartosc;
                wartosc++;
            }
        }
        System.out.println("Macierz:");
        for(int i = 0; i < w; i++){
            for(int j = 0; j < k; j++){
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        int[][] macierzTran = new int [k][w];
        for(int i = 0; i < w; i++){
            for(int j = 0; j < k; j++){
                macierzTran[j][i] = macierz[i][j];
            }
        }
        System.out.println();
        System.out.println("Transponowana macierz: ");
        for(int i = 0; i < k; i++){
            for(int j = 0; j < w; j++){
                System.out.print(macierzTran[i][j] + " ");
            }
            System.out.println();
        }
    }
}
