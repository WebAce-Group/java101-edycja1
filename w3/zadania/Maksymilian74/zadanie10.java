package w3.zadania.Maksymilian74;
import java.util.Scanner;
public class zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w,k,i,j,tmp=0;
        System.out.print("Podaj liczbę wierszy: ");
        w = scanner.nextInt();
        System.out.print("Podaj liczbę kolumn: ");
        System.out.println();
        k = scanner.nextInt();
        int[][] tab = new int[w][k];
        for(i=0;i<w;i++)
            for(j=0;j<k;j++)
                tab[i][j] = ++tmp;

        System.out.println("Macierz: ");
        for(i=0;i<w;i++) {
            for (j=0;j<k;j++)
                System.out.print(tab[i][j] + " ");
            System.out.println();
        }
            System.out.println("Macierz transponowana: ");
        for(i=0;i<k;i++) {
            for (j=0;j<w;j++)
                System.out.print(tab[j][i] + " ");
            System.out.println();
        }
    }
}
