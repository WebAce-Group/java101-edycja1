import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class Zadanie10 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wiersze");
        int w = scan.nextInt();
        System.out.println("Podaj kolumny");
        int k = scan.nextInt();
        int tab [][] = new int[w][k];
        int value =1;

        for (int i =0; i<w;i++)
        {
            for (int j = 0; j<k; j++)
            {
                tab[i][j] = value++;
            }
        }

        for (int i =0; i<w;i++)
        {
            for (int j = 0; j<k; j++)
            {
                System.out.print("[ "+tab[i][j]+" ]");
            }
            System.out.println();
        }
        System.out.println();
        for (int i =0; i<k;i++)
        {
            for (int j = 0; j<w; j++)
            {
                System.out.print("[ "+tab[j][i]+" |");
            }
            System.out.println();
        }

    }
}
