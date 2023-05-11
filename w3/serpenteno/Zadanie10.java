import java.util.*;

public class Zadanie10 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj liczbę wierszy: ");
		int w = scanner.nextInt();
		System.out.println("Podaj liczbę kolumn : ");
		int k = scanner.nextInt();
		int[][] macierz = new int[w][k];
		int liczba = 1;
		for (int i=0; i<w;i++)
		{
			for (int j=0; j<k; j++)
			{
				macierz[i][j] = liczba;
				liczba++;
			}
		}
		System.out.println("Macierz oryginalna: ");
		for (int i=0; i<w;i++)
		{
			for (int j=0; j<k; j++)
			{
				System.out.print(" " + macierz[i][j] + " ");
				
			}
			System.out.println();
		}
		System.out.println("Macierz transponowana: ");
		for (int i=0; i<k;i++)
		{
			for (int j=0; j<w; j++)
			{
				System.out.print(" " + macierz[j][i] + " ");
				
			}
			System.out.println();
		}
		
	}
}
