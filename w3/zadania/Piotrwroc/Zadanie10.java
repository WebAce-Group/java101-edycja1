import java.util.*;
public class Zadanie10 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe wierszy");
        int w=scanner.nextInt();
        System.out.println("Podaj liczbe kolumn");
        int k=scanner.nextInt();
        int x=1;
        int[][] tab = new int[w][k];
        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
            tab[i][j]=x++;
            }
        }
        System.out.println("Macierz");
        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Macierz transponowana");
        for (int j = 0; j < k; j++)
        {
            for (int i = 0; i < w; i++)
            {
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();
        }
    }
}