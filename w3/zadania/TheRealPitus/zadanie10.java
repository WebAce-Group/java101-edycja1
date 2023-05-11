import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe wierszy: ");
        int w = scanner.nextInt();
        System.out.println("Podaj liczbe kolumn: ");
        int k = scanner.nextInt();
        int[][] table = new int[w][k];
        int zmienna = 1;
        for (int i=0;i<w;i++)
        {
            for (int j=0; j<k;j++)
            {
                table[i][j] = zmienna;
                zmienna++;
            }
        }
        for (int i=0;i<w;i++)
        {
            for (int j=0; j<k;j++)
            {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=0;i<k;i++)
        {
            for (int j=0; j<w;j++)
            {
                System.out.print(table[j][i] + " ");
            }
            System.out.println();
        }
    }
}
