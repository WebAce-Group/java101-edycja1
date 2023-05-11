package w3.zadania.Nurek54;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        int[] tablica1 = new int[10];
        Arrays.fill(tablica1, 0);

        int[] tablica2 = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tablica2.length; i++) {
            System.out.print("Podaj liczbę: ");
            tablica2[i] = scanner.nextInt();
        }

        Arrays.sort(tablica1);
        Arrays.sort(tablica2);

        System.out.println("Posortowana tablica1: " + Arrays.toString(tablica1));
        System.out.println("Posortowana tablica2: " + Arrays.toString(tablica2));
    }
}

