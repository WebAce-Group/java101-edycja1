import java.util.*;
public class Zadanie9 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[10];
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Podaj wartosc " + i + ". elementu tablicy");
            tab[i] = scanner.nextInt();
        }
        int j=0;
        for (int i : tab)
        {
            System.out.println(Math.pow(i, j));
            j++;
        }
    }
}