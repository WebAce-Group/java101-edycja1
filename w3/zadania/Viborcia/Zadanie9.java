package w3.zadania.Viborcia;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        int[] tablica = new int[10];

        for(int i=0;i<10;i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbe nr "+(i+12)+(" : "));
            tablica[i] = scanner.nextInt();
            int a=tablica[i];
            tablica[i] = (int)Math.pow(a, i);
        }

        for (int n : tablica) {
            System.out.println(n);
        }

    }
}
