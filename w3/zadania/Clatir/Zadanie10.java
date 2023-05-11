import java.util.Scanner;

public class Zadanie10 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int k = scan.nextInt();
        int tab [][] = new int[w][k];
        int liczba =1;

        for (int i =0; i<w;i++)
        {
            for (int j = 0; j<k; j++)
            {
                tab[i][j] = liczba++;
            }
        }

        for (int i =0; i<w;i++)
        {
            for (int j = 0; j<k; j++)
            {
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i =0; i<k;i++)
        {
            for (int j = 0; j<w; j++)
            {
                System.out.print(tab[j][i]+" ");
            }
            System.out.println();
        }

    }
}
