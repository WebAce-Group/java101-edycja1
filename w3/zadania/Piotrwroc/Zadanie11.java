import java.util.*;
public class Zadanie11 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] tab1 = new int[10];
        Arrays.fill(tab1, 0);
        int[] tab2 = new int[10];
        System.out.println("Podaj 10 liczb jakie chcesz wpisac do tablicy");
        for (int i = 0; i < 10; i++)
        {
            tab2[i] = scanner.nextInt();
        }
        Arrays.sort(tab1);
        Arrays.sort(tab2);
        System.out.println("Posortowane tablica 1");
        for (int i : tab1)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Posortowane tablica 2");
        for (int i : tab2)
        {
            System.out.print(i + " ");
        }
    }
}
