import java.util.Arrays;
import java.util.Scanner;

public class zadanie11
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int[] tablica = new int[10];
        Arrays.fill(tablica, 0);

        int[] tab = new int[10];
        for (int i = 0; i < 10; i++)
        {
            System.out.print("podaj element tablicy: ");
            tab[i] = scan.nextInt();
        }

        Arrays.sort(tablica);
        Arrays.sort(tab);

        System.out.println();
        System.out.printf("tablica[] : %s", Arrays.toString(tablica));
        System.out.println();
        System.out.printf("tab[] : %s", Arrays.toString(tab));
        System.out.println();
    }
}