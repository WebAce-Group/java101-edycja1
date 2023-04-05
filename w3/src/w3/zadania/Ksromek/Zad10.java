package w3.zadania.Ksromek;
import java.util.Scanner;
public class Zad10
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę wierszy: ");
        int w = (scan.nextInt());
        System.out.print("Podaj liczbę kolumn: ");
        int k = (scan.nextInt());
        int[][]Tab = new int[w][k];

        for(int i=0; i<w; i++)
        {
            for(int j=0; j<k; j++)
                Tab[i][j]=(i+1)*(j+1);
        }

        for(int i=0; i<w; i++)
        {
            for(int j=0; j<k; j++)
                System.out.printf("%3d",Tab[i][j]);
            System.out.println();
        }

    }
}
