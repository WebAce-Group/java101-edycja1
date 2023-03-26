import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe wierszy a nastepnbie liczbe kolumn");
        int w = scanner.nextInt();
        int k = scanner.nextInt();
        int i = 0, j = 0;
        int[][] Tab = new int[w][k];
        for(  i = 0; i < w; i++)
        {
            for(  j = 0; j < k; j++)
            {
                Tab[i][j] = (i+1)*(j+1);
            }
        }
        for(i = 0; i < w; i++)
        {
            for(  j = 0; j < k; j++)
            {
                System.out.print(Tab[i][j] + " ");
            }
            System.out.println();
        }
        for(i = 0; i < k; i++)
        {
            for(  j = 0; j < w; j++)
            {
                System.out.print(Tab[j][i] + " ");
            }
            System.out.println();
        }

    }
}