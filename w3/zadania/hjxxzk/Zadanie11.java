package w3.zadania.hjxxzk1;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        int[] tab = new int[10];
        Arrays.fill(tab, 0);

        int[] tab2 = new int[10];

        for(int e = 0; e < 10; e++){
            System.out.print("Podaj wartosc : ");
            tab2[e] = scanner.nextInt();
        }

        Arrays.sort(tab);
        Arrays.sort(tab2);

        for(int e : tab) {
            System.out.print(e + " ");
        }

        System.out.println();

        for(int e : tab2) {
            System.out.print(e + " ");
        }


    }
}
