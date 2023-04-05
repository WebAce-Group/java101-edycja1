import java.util.Scanner;

public class zadanie10
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("podaj liczbę wierszy: ");
        int w = scan.nextInt();
        System.out.print("podaj liczbę kolumn: ");
        int k = scan.nextInt();
        int[][] tablica = macierz(w,k);

        System.out.println();
        System.out.println("MACIERZ:");
        wyswietl_macierz(tablica, w, k);
        System.out.println();
        System.out.println("MACIERZ TRANSPONOWANA:");
        macierz_transponowana(tablica, w, k);

    }

    public static int[][] macierz(int a, int b)
    {
        int n = 1;
        int[][] tab = new int[a][b];

        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                tab[i][j] = n;
                n++;
            }
        }

        return tab;
    }

    public static void wyswietl_macierz(int[][] tab, int a, int b)
    {
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                System.out.print(tab[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void macierz_transponowana(int[][] tab, int a, int b)
    {
        for (int i = 0; i < b; i++)
        {
            for (int j = 0; j < a; j++)
            {
                System.out.print(tab[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}