import java.util.Arrays;

import java.util.Scanner;

public class Zadanie11
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] tab1 = new int[10];
        Arrays.fill(tab1, 0);

        int[] tab2 = new int[10];
        for (int i = 0; i < 10; i++)
        {
            tab2[i] = scanner.nextInt();
        }

        Arrays.sort(tab1);
        Arrays.sort(tab2);

        System.out.println(" ");

        for (int element: tab1)
        {
            System.out.println(element);
        }

        System.out.println(" ");

        for (int element: tab2)
        {
            System.out.println(element);
        }

        scanner.close();
    }
}