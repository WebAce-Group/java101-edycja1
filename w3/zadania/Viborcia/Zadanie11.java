package w3.zadania.Viborcia;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        int[] tablica = new int [10];
        Arrays.fill(tablica, 0);
        int [] tablica2 = new int [10];

        for(int i=0;i<10;i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbe nr "+(i+1)+(" : "));
            tablica2[i] = scanner.nextInt();
        }
        Arrays.sort(tablica);
        Arrays.sort(tablica2);
        System.out.println("Pierwsza tablica");
        for (int n : tablica) {
            System.out.println(n);
        }
        System.out.println("Druga tablica");
        for (int n : tablica2) {
            System.out.println(n);
        }

    }
}
