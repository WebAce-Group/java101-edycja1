import java.util.Scanner;
public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę wierszy");
        int w = scanner.nextInt();
        System.out.println("Podaj liczbę kolumn");
        int k = scanner.nextInt();

        int[][] tablica = new int[w][k];

        for(int i = 0;i<w;i++){
            for(int j =0;j<k;j++){
                tablica[i][j] = i * k + j + 1;
            }
        }

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(tablica[i][j]+" ");
                if(w*k > 10 && tablica[i][j] < 10 ) System.out.print(" ");
                if(w*k > 100 && tablica[i][j] < 100 ) System.out.print(" ");
            }
            System.out.println("");
        }

        System.out.println();

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(tablica[j][i]+" ");
                if(w*k > 10 && tablica[j][i] < 10 ) System.out.print(" ");
                if(w*k > 100 && tablica[j][i] < 100 ) System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
