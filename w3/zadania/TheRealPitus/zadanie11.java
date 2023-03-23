import java.util.Arrays;
import java.util.Scanner;

public class zadanie11 {
    public static void main(String[] args)
    {
        int[] firstTab = new int[10];
        int[] secondTab = new int[10];
        Scanner scanner = new Scanner(System.in);

        Arrays.fill(firstTab, 0);
        for(int i=0; i<10;i++)
        {
            System.out.println("Podaj "+(i+1)+" liczbę do tabliczy: ");
            secondTab[i]= scanner.nextInt();
        }
        Arrays.sort(firstTab);
        Arrays.sort(secondTab);
        for (int wynik: firstTab)
        {
            System.out.print(wynik + " ");
        }
        System.out.println();
        for (int wynik: secondTab)
        {
            System.out.print(wynik + " ");
        }
    }
}
