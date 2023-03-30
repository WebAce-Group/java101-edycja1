import java.util.Arrays;
import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[10];
        Arrays.fill(tab, 0);
        int[] tab2 = new int[10];
        for (int i=0; i<10; i++)
        {
            System.out.println("Podaj " + (i+1) + ". element tablicy: ");
            tab2[i] = scanner.nextInt();
        }
        Arrays.sort(tab);
        Arrays.sort(tab2);

        System.out.println("posortowane tablice: ");

        for (int e:tab)
            System.out.print(e + " ");

        System.out.println();

        for (int e:tab2)
            System.out.print(e + " ");


    }
}

