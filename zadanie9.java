import java.util.Scanner;
import java.lang.Math;

public class zadanie9
{
    public static void main(String[] args)
    {
        int[] tablica = new int[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++)
        {
            System.out.print("podaj liczbę: ");
            int n = scan.nextInt();
            tablica[i] = n;
        }

        int n = 0;

        for (int i : tablica)
        {
            System.out.println(i+"^"+n+"="+Math.pow(i, n));
            n++;
        }
    }
}