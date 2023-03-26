package w3.zadania.MatiBukowski;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tab1 = new int[10];
        Arrays.fill(tab1,0);

        int[] tab2 = new int[10];

        System.out.print("Wpisz liczby do tablicy: ");
        for(int i =0; i<10; i++) {
            tab2[i] = scanner.nextInt();
        }

        Arrays.sort(tab1);
        Arrays.sort(tab2);

        for(int x: tab2) {
            System.out.print(x + " ");
        }
    }
}
