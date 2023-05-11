import java.util.*;

public class Zadanie11
{
    public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int[] tablica1 = new int[10];
		Arrays.fill(tablica1, 0);
		int[] tablica2 = new int[10];
		for (int i=0; i<10; i++)
		{
			System.out.println("Podaj " + (i + 1) + " element tablica2: ");
			tablica2[i] = scanner.nextInt();
		}
		Arrays.sort(tablica1);
		for (int i=0; i<10; i++)
		{
			System.out.println(tablica1[i]);
		}
		Arrays.sort(tablica2);
		for (int i=0; i<10; i++)
		{
			System.out.println(tablica2[i]);
		}
	}
}
