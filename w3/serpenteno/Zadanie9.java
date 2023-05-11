import java.util.*;
import static java.lang.Math.*;

public class Zadanie9 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[10];
        for (int i=0; i<10; i++)
        {
            System.out.println("Podaj " + (i + 1) + " element tablicy: ");
            tablica[i] = scanner.nextInt();
        }
		int i = 0;
		for (int element : tablica)
		{
			System.out.println(pow(tablica[i], i));
			i++;
		}
	}
}
